<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商家账户信息</title>
<style type="text/css">
	body{
		margin:0px auto;
		width: 800px;
		height:600px;
		/* border: 1px solid black;		 */
		 background-color: #f5f5f5;   
  	 }
   	#main{
   		margin:10px auto;
		width: 800px;
		height:400px;
		/* border: 1px solid black;*/			
		 background-color: white; 
   }
   #info_form{
   		
		width: 800px;
		height:300px;
		
   }
   </style>
</head>
<body>
<div id="main">
		<%  if(session.getAttribute("sname")!=null){ %>
		<form id="info_form" action="${pageContext.request.contextPath}/ShopInfoServlet" method="post" target="_top">
			<table>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td>用&nbsp;&nbsp;户&nbsp;名:</td>
					<td><input type="text" value="${sessionScope.shop.sname}" id="uname"></td>
				</tr>
				<tr>
					<td>用户账号:</td>
					<td><input type="text" value="${sessionScope.shop.saccount}" id="uaccount"></td>
				</tr>
				<tr>
					<td>账号密码:</td>
					<td><input type="text" value="${sessionScope.shop.password}" id="password"></td>
				</tr>
				<tr>
					<td>手机号码:</td>
					<td><input type="text" value="${sessionScope.shop.phone}" id="phone"></td>
				</tr>
				<tr>
					<td>商家地址:</td>
					<td><input type="text" value="${sessionScope.shop.address}" id="address"></td>
				</tr>
				<tr>
					<td>起送价:</td>
					<td><input type="text" value="${sessionScope.shop.startprice}" id="address"></td>
				</tr>
				<tr>
					<td>配送费:</td>
					<td><input type="text" value="${sessionScope.shop.deliveryfee}" id="address"></td>
				</tr>
				<tr>
					<td>配送时间:</td>
					<td><input type="text" value="${sessionScope.shop.deliverytime}" id="address"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="修改" id="subm"></td>
				</tr>
			</table>
			
		</form>
		<%}else{ %>
		<p>你还未登陆！请返回<a href="${pageContext.request.contextPath}/login.jsp" target="_top">登陆</a>后重新查看商店信息</p>
		<%} %>
		</div>
</body>
</html>