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
                        <span class="sidebar-nav-item">美团外卖商家后台</span>
                    </a>
                    </li>
                <li>
                    <a href="#" aria-expanded="false">账户管理 <span class="fa arrow"></span></a>
                    <ul aria-expanded="false">
                        <li><a href="./shop_info.jsp"target="right">商家信息设置</a></li>
                       <!--  <li><a href="#">添加菜品</a></li>

                        <li><a href="http://onokumus.com" target="right">删除用户信息</a></li>

                        <li><a href="http://www.baidu.com" target="right">删除用户信息</a></li>

                        <li><a href="#">修改用户信息</a></li> -->
                    </ul>
                </li>
                <li>
                    <a href="#" aria-expanded="false">菜品管理<span class="fa arrow"></span></a>
                    <ul aria-expanded="false">
                        <li><a href="#" target="right">菜品列表</a></li>
                        <li><a href="#" target="right">添加新菜品</a></li>
                        <!-- <li><a href="#">删除商家信息</a></li>
                        <li><a href="#">修改商家信息</a></li> -->
                        <!-- <li>
                            <a href="#" aria-expanded="false">其他<span class="fa plus-minus"></span></a>
                            <ul aria-expanded="false">
                                <li><a href="#">其他1</a></li>
                                <li><a href="#">其他2</a></li>
                            </ul>
                        </li> -->
                    </ul>
                </li>
                <li>
                    <a href="#" aria-expanded="false">订单管理<span class="fa arrow"></span></a>
                    <ul aria-expanded="false">
                        <li><a href="#" target="right">所有订单</a></li>
                        <li><a href="#" target="right">已接单</a></li>
                        <li><a href="#" target="right">待接单</a></li>
                        
                        <!-- <li><a href="#">修改管理员信息</a></li> -->
                    </ul>
                </li>
            </ul>
        </nav>
    </aside>
    </div>
</body>
</html>