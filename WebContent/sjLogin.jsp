<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.js"></script>
<script src="js/messages_zh.js"></script>
<script src="js/additional-methods.js"></script>
<script src="js/登陆验证.js"></script>
<link rel="stylesheet" type="text/css" href="css/登陆界面样式.css">
</head>
<body>
	<div id="login-top-pic">
		<img alt="" src="img/登陆页面logo.png" />
	</div>
	<div id="aa">
		<div id="show-pic">
			<img alt="" src="img/登陆页面侧图.png" />
		</div>
		<div id="logindiv">
			<form action="./SjLoginServlet" method="post" id="loginform">
				<table>
					<tr>
						<td><span id="loginstyle">美团商家登录页面</span></td>
					</tr>
					<tr>
						<td class="t"><label for="uaccount">商家账户名</label></td>
					</tr>
					<tr>
						<td><input id="uaccount" name="uaccount" type="text"></td>
					</tr>

					<tr>
						<td class="t"><label for="password">密码</label></td>
					</tr>
					
					<tr>
						<td><input id="password" name="password" type="password"></td>
					</tr>

					<tr>
						<td><div id="bb"><input type="checkbox" id="autologin"  name = "autologin"/>7天内自动登陆 &nbsp;&nbsp;&nbsp;&nbsp;
							<a href="#">忘记密码？</a></div>
						</td>						
					</tr>
					
					<tr>					
						<td><input class="submit" type="submit" value="登陆"
							name="sub" id="login"></td>
					</tr>
				
				</table>
			</form>
		</div>
	</div>
	
	
</body>
</html>