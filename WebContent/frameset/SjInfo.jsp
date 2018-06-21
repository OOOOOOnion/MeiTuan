<%@ page import="java.util.*,model.Shops" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<style>
		#展示用户信息{
			width:1250px;
			height:630px;
		}
		#标题{
		    width:300px;
			font-weight:800;
			font-size:25px;
		    margin:0 auto;
			
		}
		table{
			border-collapse:collapse;
			width:600px;
			margin:0 auto;
		}
		table,table tr th, table tr td { border:1px solid; }
		
		th{
			width:100px;
		}
		
	</style>
</head>
<body>
	<%
		ArrayList<Shops> list = (ArrayList<Shops>) request.getAttribute("sjList");
	%>
	<div id="展示用户信息">
		<div id="标题">美团外卖商家信息管理</div>
		<form action="" method="post">
		<table id="表格">
			<tr>
				<th>商家名称</th>
				<th>商家账号</th>
				<th>商家密码</th>
				<th>商家电话</th>
				<th>商家地址</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<% for(Shops s:list){ 
		   %>
			<tr>
				<td><%=s.getSname()%></td>
				<td><%=s.getSaccount()%></td>
				<td><%=s.getPassword()%></td>
				<td><%=s.getPhone()%></td>
				<td><%=s.getAddress()%></td>
				<th>
					<input type="submit" value="修改">
				</th>
				<th>
					<input type="submit" value="删除">
				</th>
			</tr>
			<%} %>
		</table>
		</form>
	</div>
</body>
</html>