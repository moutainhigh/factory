var code;var validate=function(str){var phoneRules=/^1[3|4|5|7|8]\d{9}$/;return phoneRules.test(str)};var submit=function(phone,license,model){localStorage["phone"]=phone;localStorage["license"]=license;localStorage["model"]=model;$.post('/prizeCord/get.itf?sn='+code,{license:license,model:model,phone:phone},function(data){if(data.code!=null&&data.msg!=null){var msg=data.msg;if(data.code!="9999"){$(".code").html(data.msg);setTimeout(function(){var qrcode=new QRCode(document.getElementById("qrcode"),{width:100,height:100});qrcode.makeCode(data.msg+"\n\r"+phone)},0);if(data.code=='0000'){msg='成功领取红包！'}else if(data.code=='0001'){msg='您已领取过红包啦~'}$("#successPart").on("click",function(){share()})}else{$(".resultDetail").hide()}$(".normalPart").hide();$("#successPart").show();$("#successPhoneNumer").html(phone);$("#result").html(msg)}})};var init=function(){var submitBtn=$("#receiveBtn");var phoneText=$("#phoneText");var licenseText=$("#licenseText");var modelText=$("#modelText");$.post('/activity/info.itf?sn='+code,function(data){if(data.code!=null){var msg=data.msg;$(".hdName").html(" "+msg.prize+" ");$(".hdDate").html(msg.endTime.split(" ")[0]);if(data.code=='0000'){}else{$(".hdState").html(data.code);$("#form").hide()}}});if(validate(localStorage["phone"])){$("#phoneNum").text(localStorage["phone"]);$("#phoneLic").text(localStorage["license"]);$("#phoneModel").text(localStorage["model"]);phoneText.hide();licenseText.hide();modelText.hide();$("#hasPhone").show();submitBtn.removeClass("disable").addClass("clickable");$(".change").on("click",function(){delete localStorage["phone"];delete localStorage["license"];delete localStorage["model"];phoneText.val('');licenseText.val('');modelText.val('');phoneText.show();licenseText.show();modelText.show();$("#hasPhone").hide();submitBtn.removeClass("clickable").addClass("disable")})}else{$("#hasPhone").hide()}$("#form input").on("change",function(e){var license=licenseText.val();var model=modelText.val();var isValid=validate(phoneText.val());submitBtn.removeClass("clickable").addClass("disable");if(!isValid){phoneText.focus()}else if(license==null||license==''){licenseText.focus()}else if(model==null||model==''){modelText.focus()}else{submitBtn.removeClass("disable").addClass("clickable");var k=window.event?e.keyCode:e.which;if(k==13){if(submitBtn.hasClass("clickable")){submit(phoneText.val(),licenseText.val(),modelText.val())}}}});submitBtn.on("click",function(e){e.preventDefault();var phoneLs=localStorage["phone"];var licenseLs=localStorage["license"];var modelLs=localStorage["model"];var phone=phoneText.val();var license=licenseText.val();var model=modelText.val();if(validate(phone)&&license!=null&&license!=''&&model!=null&&model!=''&&submitBtn.hasClass("clickable")){submit(phone,license,model)}else if(validate(phoneLs)&&licenseLs!=null&&modelLs!=null){submit(phoneLs,licenseLs,modelLs)}else{phoneText.focus()}});$("#ruleLink").on("click",function(){$.pgwModal({target:'#modalContent',title:'红包使用规则'})})};function share(){$('body').append('<div class="share" onclick="remove(this)">		<img src="images/share.png" />		<div class="clear"></div>		<p class="tr">点击右上角</p>		<p class="tr">分享给你朋友</p>	</div>')}$(document).ready(function(){code=window.location.search.substr(1).match(new RegExp("(^|&)code=([^&]*)(&|$)"))[2];init()});