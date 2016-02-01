<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<head>
<%@include file="/page/msds/common/commonjs.jsp" %>
</head>
<body>
	<div class="mini-fit" style="background: url('${ctx}/js/miniui/themes/blue/images/toolbar/toolbar.gif') repeat-x scroll 0 0 #f0f0f0;border: 1px solid #99bce8">
		<div id="editform" class="form">
			<input class="mini-hidden" name="id" />
			<table style="width:100%;">
				<tr>
					<td>车型名称：</td>
					<td><input name="name" 
						 vtype="rangeLength:1,50" style="width: 160px;"  class="mini-textbox" emptyText="请填写车型名称" /></td>
				</tr>
				<tr>
					<td>上级ID：</td>
					<td><input name="pid" 
						 allowLimitValue="false" style="width: 160px;"  class="mini-spinner" emptyText="请填写上级ID" /></td>
				</tr>
				<tr>
					<td>等级：</td>
					<td><input name="level" 
						 allowLimitValue="false" style="width: 160px;"  class="mini-spinner" emptyText="请填写等级" /></td>
				</tr>
				<tr>
					<td style="text-align:right;padding-top:5px;padding-right:20px;"
						colspan="6"><a class="mini-button"
						onclick="updateRow()">保存</a> <a class="mini-button"
						onclick="cancelRow()">取消</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
<script type="text/javascript" src="${ctx}/page/msds/km/model/model_edit.js"></script>
</html>