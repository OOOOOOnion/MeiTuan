<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
	<title>管理员页面顶部</title>
	<style>
		.logo{
			position: absolute;
			left: 50px;
			top: 3px;
			height: 90px;
		}
		.美团外卖{
			position: absolute;
			left: 145px;
			top: 17px;
			font-size: 28px;
		}
		.后台管理{
			position: absolute;
			left: 145px;
			top: 55px;
			font-size: 15px;
		}
		.right{
			margin-left: 1300px;
			position: relative;
		}
		.欢迎{
			position: absolute;;
			top: 20px;
			text-decoration:none;
		}
		.返回首页{
			position: absolute;;
			top: 50px;
			text-decoration:none;
		}
		.间隔符{
			position: absolute;;
			top: 50px;
			left: 85px;
		}
		.安全退出{
			position: absolute;;
			left: 98px;
			top: 50px;
			text-decoration:none;
		}
	</style>
</head>
<body>
		<img class="logo" src="../img/美团logo.png" />
		<div class="美团外卖">美团外卖</div>
		<div class="后台管理">欢迎来到后台管理系统</div>
		<div class="right">
			<span class="欢迎">欢迎您：</span>
			<a class="返回首页" href="#">[返回首页]</a>
			<span class="间隔符">|</span>
			<a class="安全退出" href="#">[安全退出]</a>
		</div>
</body>
</html>