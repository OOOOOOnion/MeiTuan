<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册页面</title>

<script src="js/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/注册界面样式.css">
<script src="js/jquery.validate.js"></script>
<script src="js/messages_zh.js"></script>
<script src="js/additional-methods.js"></script>

<script src="js/注册验证.js"></script>

</head>
<body>
<div id="reg-top-logo">	
	<img alt="" src="img/注册logo.png">
</div>
	<div id="横线"></div>
	<div id="注册div">
	
<form id="signupForm" method="post" action="">
	
  <table>
 
    <tr>
      <td class="t"><label for="uaccount">账户名</label></td>
      <td><input id="uaccount" name="uaccount" type="text"></td>
      
    </tr>
    
   <tr>
      <td class="t"><label for="password">密码</label></td>
      <td><input id="password" name="password" type="password"></td>
      
   </tr>
   
   <tr>
      <td class="t"><label for="confirm_password">验证密码</label></td>
      <td><input id="confirm_password" name="confirm_password" type="password"></td>
      
   </tr>
   
   <tr>
      <td class="t"><label for="upic">头像</label></td>
      <td><input id="upic" name="upic" type="file"></td>
      
   </tr>
   <tr>
   	 <td class="t"><label for="sub"></label></td>
      <td ><input class="submit" type="submit" value="同意以下协议并注册" name="sub" id="sub"></td>
      
   </tr>
   <tr>
      <td></td>
      <td></td>
   </tr>
   <tr>
      <td ></td>
      <td><a href="#">《美团网用户协议》</a></td>
   </tr>
  </table>
</form>

</div>
<hr>
<div id="reg-foot">
	<img alt="" src="img/注册页面备案号.png">
</div>
</body>
</html>
