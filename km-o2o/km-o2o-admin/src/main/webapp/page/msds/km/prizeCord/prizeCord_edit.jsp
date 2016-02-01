<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<head>
<%@include file="/page/msds/common/commonjs.jsp"%>
</head>
<body>
	<div class="mini-fit"
		style="background: url('<%=ctx%>/js/miniui/themes/blue/images/toolbar/toolbar.gif') repeat-x scroll 0 0 #f0f0f0;border: 1px solid #99bce8">
		<div id="editform" class="form">
			<input class="mini-hidden" name="id" />
			<table style="width: 100%;">
				<tr>
					<td>优惠码：</td>
					<td><input name="sn" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写优惠码" /></td>
				</tr>
				<tr>
					<td>活动编号：</td>
					<td><input name="activitySn" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写活动编号" /></td>
				</tr>
				<tr>
					<td>失效日期：</td>
					<td><input name="expiryDate" format="yyyy-MM-dd H:mm:ss"
						timeFormat="H:mm:ss" showTime="true" style="width: 160px;"
						class="mini-datepicker" emptyText="请填写失效日期" /></td>
				</tr>
				<tr>
					<td>状态：</td>
					<td><input name="state" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-combobox" data="prizeCordState"
						emptyText="请填写状态" /></td>
				</tr>
				<tr>
					<td>手机：</td>
					<td><input name="phone" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写手机" /></td>
				</tr>
				<tr>
					<td>车牌号：</td>
					<td><input name="license" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写车牌号" /></td>
				</tr>
				<tr>
					<td>车型：</td>
					<td><input name="model" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写车型" /></td>
				</tr>
				<tr>
					<td>openid：</td>
					<td><input name="openid" vtype="rangeLength:1,50"
						style="width: 160px;" class="mini-textbox" emptyText="请填写openid" /></td>
				</tr>
				<tr>
					<td>操作人：</td>
					<td><input name="operator" allowLimitValue="false"
						style="width: 160px;" class="mini-spinner" emptyText="请填写操作人" /></td>
				</tr>
				<tr>
					<td>创建时间：</td>
					<td><input name="createDate" format="yyyy-MM-dd H:mm:ss"
						timeFormat="H:mm:ss" showTime="true" style="width: 160px;"
						class="mini-datepicker" emptyText="请填写创建时间" /></td>
				</tr>
				<tr>
					<td>修改时间：</td>
					<td><input name="modifyDate" format="yyyy-MM-dd H:mm:ss"
						timeFormat="H:mm:ss" showTime="true" style="width: 160px;"
						class="mini-datepicker" emptyText="请填写修改时间" /></td>
				</tr>
				<tr>
					<td
						style="text-align: right; padding-top: 5px; padding-right: 20px;"
						colspan="3"><a class="mini-button" onclick="updateRow()">保存</a>
						<a class="mini-button" onclick="cancelRow()">取消</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
<script type="text/javascript"
	src="<%=ctx%>/page/msds/km/prizeCord/prizeCord_edit.js"></script>
</html>