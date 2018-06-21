<%@ page import="java.util.*,model.Users" language="java"
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
		
		
	</style>
</head>
<body>
	<%
		ArrayList<Users> list = (ArrayList<Users>) request.getAttribute("userList");
	%>
	<div id="展示用户信息">
		<div id="标题">美团外卖用户信息管理</div>
		<form action="" method="post">
		<table id="表格">
			<tr>
				<th>用户名</th>
				<th>用户账号</th>
				<th>用户密码</th>
				<th>用户电话</th>
				<th>用户地址</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<% for(Users user:list){ 
		   %>
			<tr>
				<td><%=user.getUname()%></td>
				<td><%=user.getUaccount()%></td>
				<td><%=user.getPassword()%></td>
				<td><%=user.getPhone()%></td>
				<td><%=user.getAddress()%></td>
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