<%@ page import="java.util.*,model.*" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
<head>
	<meta charset="utf-8">
	<title>商家详情</title>
	<script src="js/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/首页排版样式.css">
	<link rel="stylesheet" type="text/css" href="css/尊宝披萨.css">
	<script type="text/javascript" src="js/尊宝披萨.js"></script>
</head>
<body>

	<% String sid=request.getParameter("id");%>
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
						欢迎：<a href="./uinfo/uinfo.jsp"><%=session.getAttribute("uname") %><%-- <%=session.getAttribute("uid") %> --%></a>
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
				<div id="首页"><a href="./meituan.jsp">首页</a></div>
				<div id="我的订单"><a href="./UserOrderServlet">我的订单</a></div>
				<div id="申请加盟">申请加盟</div>
				<div id="搜索">
					<div id="搜索内容"><input type="text" value=""/></div>
					<div id="搜索图标"><img alt="" src="img/搜索.png" ></div>
					
				</div>
		</div>
	</div>
	<div id="商家模块">
		<img src="spic/3.jpg" id="商家照片">
		<div id="商家店名" name="zunbao"></div>
		<img src="img/尊宝评分.png" id="商家评分">
		<div id="商家右边">
			<div id="送餐上">平均送餐时间</div>
			<div id="送餐下左"></div>
			<div id="送餐下右">分钟</div>
			<div id="起送上">起送</div>
			<div id="起送下左"></div>
			<div id="起送下右">元</div>
			<div id="配送上">配送费</div>
			<div id="配送下左"></div>
			<div id="配送下右">元</div>
		</div>
	</div>
			<div id="商品展示"></div>
	<form>
	<div id="购物车">
		<div id="结算">
			<img id="购物车图标" src="img/购物车.png">
			<input id="立即下单" type="submit">
		</div>
		<div id="商家配送费" class="购物车栏">
			<span id="配送费字样">配送费</span>
			<span id="配送费价格人民币">¥</span>
			<span id="配送费价格"></span>
			<span id="总价字样">总价</span>
			<span id="总价人民币" >¥:</span>
			<span id="总价价格" >0</span>
		</div>
		<div id="购物车商品">
		</div>
	</div>
	</form>
	<div id="foot">
		<div id="foot-more">
				<img alt="" src="img/更多服务.png" >
		</div>
		<div id="foot-permit">
			<img alt="" src="img/经营许可.png" >
		</div>
	</div>
		<%String userid=(String)session.getAttribute("userid");%>
		<input type="hidden" id="隐藏" value=<%=sid%>>
		<input type="hidden" id="隐藏框" value=<%=userid%>>
</body>
</html>