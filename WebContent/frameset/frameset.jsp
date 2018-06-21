<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<frameset rows="100px,*" frameborder="no">
	<frame name="top" src="http://localhost:8080/meituan/frameset/top.jsp" style="border-bottom: 2px solid rgb(245,215,5)">
	<frameset cols="252,*" frameborder="no">
		<frame name="left" src="http://localhost:8080/meituan/frameset/metismenu.jsp" style="border-right: 2px solid rgb(245,215,5)"/>
		<frame name="right" src="http://localhost:8080/meituan/QueryUserInfoServlet">
	</frameset>
</frameset>