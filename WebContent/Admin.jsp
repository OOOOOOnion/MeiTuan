<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<body>
	<form action="AdminLoginServlet" method="post">
		<table>
			<tr>
				<td>账号：</td>
				<td><input type="text" id="account" name="account"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>
	</table>
	<input type="submit" value="登录">
</form>
</body>
</html>