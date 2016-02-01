mini.parse();
var grid = mini.get("datagrid_detail");
var form = new mini.Form("#viewform");
queryDetail();
function SetData(data) {
	if (data.action == "edit") {
		data = mini.clone(data);
		$.ajax({
			url : ctx+"/activityNewDetail/getId.action?id=" + data.id,
			cache : false,
			success : function(text) {
				form.setData(text);
				form.setChanged(false);
			}
		});
	}
}
function cancelRow() {
	CloseWindow("close");
}
function updateRow() {
	form.validate();
	if (form.isValid() == false)
		return;
	var rows = grid.getSelecteds();
	var couponIds = "";
	if (rows.length > 0) {
		var ids = [];
		for ( var i = 0, l = rows.length; i < l; i++) {
			var r = rows[i];
			ids.push(r.id);
		}
		couponIds = ids.join(',');
	}
	var parm = "";
	var json = form.getData(true);
	json.couponIds = couponIds;
	parm += "id="+json.id;
	parm += "&activitySn="+json.activitySn;
	parm += "&personLimit="+json.personLimit;
	parm += "&activityLimitState="+json.activityLimitState;
	parm += "&activityLimitNum="+json.activityLimitNum;
	parm += "&type="+json.type;
	parm += "&couponIds="+json.couponIds;
	$.ajax({
		url : ctx+"/activityNew/saveActivityNewDetail.action?" + parm,
		success : function(text) {
			showMsg("操作成功", 'success');
		},
		error : function(text) {
			showMsg("操作失败：" + text.responseText, 'danger');
			grid.unmask();
		}
	});
}
function CloseWindow(action) {
	if (action == "close" && form.isChanged()) {
		if (confirm("数据被修改了，是否先保存？")) {
			return false;
		}
	}
	if (window.CloseOwnerWindow) {
		return window.CloseOwnerWindow(action);
	} else {
		window.close();
	}
}
function queryDetail(){
	var activitySn = mini.get("activitySn").getValue();
	var json = {};
	json.activitySn = activitySn;
	console.info(json);
	grid.load(json);
}
