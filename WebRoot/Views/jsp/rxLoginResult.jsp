<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>平安科技深度学习</title>
    <!--<link href="/PADL_AIaas/Views/css/bootstrap.min.css" rel="stylesheet">-->
    <link href="/PADL_AIaas/Views/css/rxLogin.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="/PADL_AIaas/js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
<header>
    <div class="container">
        <img src="/PADL_AIaas/Views/image/login-logo.png" alt="logo" class="logo">
        <a href="/PADL_AIaas/index" class="back">平安易智云首页</a>
    </div>
</header>
<main>
    <div class="container">
        <img class="login-img" src="/PADL_AIaas/Views/image/login-img.png" alt="login-img">
        <div id="login-wrap" style="position:relative">
            <h3>登录平安易智云账号</h3>
            <form id="loginForm" action="/PADL_AIaas/loginAction" method="post">
                <input name="username" type="text" placeholder="用户名/手机/邮箱">
                <input name="password" type="password" placeholder="密码">
                <input type="submit" value="登录">
            </form>
            <p>
                <a href="/PADL_AIaas/register">立刻注册</a>
                <a href="#">忘记密码</a>
            </p>
            <span class="errTip" style="position:absolute;top:76px;left:40px; color:red">${requestScope.tip}</span>
        </div>
    </div>
</main>
<footer>
    <div class="container">
        <p class="copyright">版权所有 平安易智云 CopyRight2006-2016 备案号：粤11098765号</p>
    </div>
</footer>
<script src="/PADL_AIaas/js/jquery-1.11.1.min.js"></script>
<script src="/PADL_AIaas/js/rxLogin.js"></script>
</body>
</html>