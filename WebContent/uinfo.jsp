<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息页</title>
<link rel="stylesheet" type="text/css" href="css/用户信息页面.css">
</head>
<body>
		<div id="top">
		<div id ="top-address">
			<div id="top-center">
				<div id="定位">越秀区&nbsp;仲恺农业工程学院海珠校区&nbsp;|&nbsp;切换地址</div> 
				
				<div id="我的">
				<%  if(session.getAttribute("uname")!=null){ %>
						欢迎：<a href="./uinfo.jsp"><%=session.getAttribute("uname") %></a>
						<a href="./UserQuitServlet">退出</a>
				<%}else{%>
					<a href="./register.jsp">注册</a>  &nbsp;|&nbsp;
					<a href="./login.jsp">登录</a>
				<%} %>
				 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机版&nbsp;&nbsp;&nbsp;&nbsp;美团网&nbsp;&nbsp;&nbsp;&nbsp;联系我们</div>
			</div>
		</div>
		<div id="top-search">
			
				<div id="logo"><img alt="" src="img/logo.png" ></div>
				<div id="首页">首页</div>
				<div id="我的订单">我的订单</div>
				<div id="申请加盟">申请加盟</div>
				<div id="搜索">
					<div id="搜索内容"><input type="text" value=""/></div>
					<div id="搜索图标"><img alt="" src="img/搜索.png" ></div>
					
				</div>
		</div>
	</div>
		<div id="info">
		<div id="left">
		
		</div>
		<div id ="right"></div>
		</div>
		<div id="foot">
		<div id="foot-more">
			
				<img alt="" src="img/更多服务.png" >
			
		</div>
		<div id="foot-permit">
			<img alt="" src="img/经营许可.png" >
		</div>
	</div>
</body>
</html>