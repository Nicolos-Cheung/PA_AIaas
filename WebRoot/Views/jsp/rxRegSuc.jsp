<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-cn">

<script language="JavaScript">
	var times = 5;
	function clock() 
	{
		time.innerHTML = times;
		window.setTimeout('clock()', 1000);
		times = times - 1;
	}
</script>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>平安科技深度学习</title>
    <link rel="stylesheet" href="/PADL_AIaas/Views/css/rxRegSuc.css">

    <!--[if lt IE 9]>
    <script src="/PADL_AIaas/js/html5shiv.js"></script>
    <![endif]-->
</head>
<body onload="clock()">
<header>
    <div class="container">
        <img src="/PADL_AIaas/Views/image/login-logo.png" alt="logo" class="logo">
        <a href="/PADL_AIaas/index" class="back">平安易智云首页</a>
    </div>
</header>
<main>
    <div class="container">
        <div id="regSuc-box" class="regSuc-box">
            <img src="/PADL_AIaas/Views/image/regSuc.png" alt="registerSuccess">
            <p>恭喜您，<span class="user">${requestScope.username}</span>已经成功注册平安易智云账号！</p>
            <p><span id="time">5</span>秒后自动跳转到注册前的页面</p>
            <%response.setHeader("Refresh", "5;URL=/PADL_AIaas/login");%>  
        </div>
    </div>
</main>
<script src="/PADL_AIaas/Views/js/jquery-1.11.1.min.js"></script>
<script src="/PADL_AIaas/Views/js/Validform_v5.3.2_min.js"></script>
<script src="/PADL_AIaas/Views/js/rxRegSuc.js"></script>
</body>
</html>
