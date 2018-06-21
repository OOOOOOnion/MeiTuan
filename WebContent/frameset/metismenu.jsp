<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.2/css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/metisMenu.css"/>
    <link rel="stylesheet" href="../css/demo.css"/>
    <link rel="stylesheet" href="../css/mini.css"/>
    
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/metisMenu.js"></script>
<script>
    $(function () {
        $('#menu').metisMenu();
    });
</script>
</head>
<body>
<div class="clearfix">
    <aside class="sidebar">
        <nav class="sidebar-nav">
            <ul class="metismenu" id="menu">
                <li class="active">
                    <a href="#" aria-expanded="true">
                        <span class="sidebar-nav-item-icon fa fa-github fa-lg"></span>
                        <span class="sidebar-nav-item">美团外卖</span>
                    </a>
                    </li>
                <li>
                    <a href="#" aria-expanded="false">用户信息管理 <span class="fa arrow"></span></a>
                </li>
                <li>
                    <a href="#" aria-expanded="false">商家信息管理<span class="fa arrow"></span></a>
                    <ul aria-expanded="false">
                        <li><a href="http://localhost:8080/meituan/QuerySjInfoServlet" target="right">查看商家信息</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </aside>
    </div>
</body>
</html>