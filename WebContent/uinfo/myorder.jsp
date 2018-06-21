<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
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
   </style>
</head>
<body>
	<div id="main">
		<%  if(session.getAttribute("uname")!=null){ %>
			<table>
		<tr>
			<td>订单id</td>
			<td>商家id</td>
			<td>商品id</td>
			<td>商品数量</td>
			<td>商品单价</td>
			<td>商品总价</td>
			<td>订单状态</td>
			
		</tr>
		<c:forEach items="${OrderList}" var="o">
		
		<tr>
			<td>${o.oid}</td>
			<td>${o.sid }</td>
			<td>${o.spid }</td>
			<td>${o.spnum }</td>
			<td>${o.spprice }</td>
			<td>${o.totalprice }</td>
			<td>${o.state }</td>
			
			
			
		</tr>
		</c:forEach>
		<tr>
			<td>第 ${requestScope.pageBean.page}页,共 ${requestScope.pageBean.totalpage}页</td>
			<td><a href="${pageContext.request.contextPath}/UserOrderServlet?page=1">首页</a></td>
			<td><a href="${pageContext.request.contextPath}/UserOrderServlet?page=${requestScope.pageBean.page-1}">上一页</a></td>
			<td><a href="${pageContext.request.contextPath}/UserOrderServlet?page=${requestScope.pageBean.page+1}">下一页</a></td>
			<td><a href="${pageContext.request.contextPath}/UserOrderServlet?page=${requestScope.pageBean.totalpage}">尾页</a></td>
			
		</tr>
	</table>
			
		<%}else{ %>
		<p>你还未登陆！请返回<a href="${pageContext.request.contextPath}/login.jsp" target="_top">登陆</a>后重新查看个人订单</p>
		<%} %>
	
	</div>
</body>
</html>