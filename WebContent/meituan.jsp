<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>假的美团外卖首页</title>
	<script src="js/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/美团商品样式.css">
	<link rel="stylesheet" type="text/css" href="css/首页排版样式.css">
	<script type="text/javascript" src="js/点击加载更多.js"></script>
	<script type="text/javascript" src="js/首页展示下拉框.js"></script>	
</head>
<body onload="$('#hhh').click()">

	<div class="div-top">
		<div id="下拉浮动框logo"><img alt="" src="img/logo.png" ></div>
		<div id="浮动框搜索">
			<div id="搜索内容"><input type="text" value=""/></div>
			<div id="搜索图标"><img alt="" src="img/搜索.png" ></div>
					
		</div>
	</div>
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
	<div id="商家表">
		<div id="商家分类">
			<div id="商家类别">商家类别</div>
			<div id="全部">全部</div>
			<div id="美食">美食</div>
			<div id="正餐优选">正餐优选</div>
			<div id="超市">超市</div>
			<div id="精选小吃">精选小吃</div>
			<div id="鲜果购">鲜果购</div>
			<div id="下午茶">下午茶</div>
		</div>
		<div id="商家"></div>
		<div id="加载更多"><div id="hhh" >点击加载更多商家</div></div>
	</div>
	<div id="右下固定框">加盟</div>
	<div id="foot">
		<div id="foot-more">
			
				<img alt="" src="img/更多服务.png" >
			
		</div>
		<div id="foot-permit">
			<img alt="" src="img/经营许可.png" >
		</div>
	</div>
<input type="hidden" id="page" value="1"> 
</body>
</html>