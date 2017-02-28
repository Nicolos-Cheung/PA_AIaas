<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>平安科技深度学习</title>
    <link rel="stylesheet" href="/PADL_AIaas/Views/css/rxRegister.css">

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
        <div id="register-wrap">
            <h3>注册平安易智云账号</h3>
            <form id="RegisterForm" class="RegisterForm" action="/PADL_AIaas/registerAction" method="post">
                <fieldset style="border:none">
                    <legend style="display:none"><h1>注册平安易智云账号</h1></legend>
                    <div class="wrapper">
                        <label for="username" id="label_username" class="reg-label tr">用户名</label>
                        <input class="baseInput" id="username" name="username" type="text" datatype="s6-8" nullmsg="请设置用户名" errormsg="请输入6至8位字符" sucmsg="格式正确" placeholder="请设置用户名">
                        <span class="Validform_checktip"></span>
                    </div>
                    <div class="wrapper">
                        <label for="telnum" id="label_telnum" class="reg-label tr">手机号</label>
                        <input class="baseInput" id="telnum" name="telnum" type="text" datatype="m" nullmsg="请输入手机号码" errormsg="请填写正确的手机号格式" sucmsg="格式正确" placeholder="请输入手机号码">
                        <span id="info_reg_telnum" class="Validform_checktip"></span>
                    </div>
                    <div class="wrapper">
                        <label for="password" id="label_password" class="reg-label tr">登录密码</label>
                        <input class="baseInput" id="password" name="password" type="password" datatype="*6-16" nullmsg="请设置登录密码" errormsg="密码范围在6~16位之间" sucmsg="格式正确" placeholder="请设置登录密码">
                        <span class="Validform_checktip"></span>
                    </div>
                    <div class="wrapper">
                        <label for="repassword" id="label_repassword" class="reg-label tr">密码确认</label>
                        <input class="baseInput" id="repassword" name="repassword" type="password" datatype="*" recheck="password" nullmsg="请再次输入密码" errormsg="两次输入密码需一致" sucmsg="验证通过" placeholder="请再次输入密码">
                        <span class="Validform_checktip"></span>
                    </div>
                    <div class="wrapper">
                        <label for="verifyCode" id="label_verifyCode"class="reg-label tr">验证码</label>
                        <input class="baseInput" id="verifyCode" name="verifyCode" type="text" placeholder="请输入验证码">
                        <input type="button" id="btnSendCode" class="getVerifyCode" value="获取短信验证码" onClick="sendMessage()">
                    </div>
                    <p id="isAgreeWrapper" class="isAgreeWrapper">
                        <input id="isAgree" name="isAgree" type="radio" checked="checked" autocomplete="off">
                        <label for="isAgree"></label>
                        <span>阅读并接受</span>
                        <a target="_blank" href="＃">《平安易智云用户协议》</a>
                    </p>
                    <div id="submitWrapper" class="submitWrapper">
                        <input class="baseInput" type="submit" id="reg_submit" class="subBtn" value="注册"/>
                    </div>
                </fieldset>
            </form>
            <span class="errTip" style="position:absolute;top:76px;left:40px; color:red"></span>
        </div>
    </div>
</main>

<script src="/PADL_AIaas/Views/js/jquery-1.11.1.min.js"></script>
<script src="/PADL_AIaas/Views/js/Validform_v5.3.2_min.js"></script>
<script src="/PADL_AIaas/Views/js/rxRegister.js"></script>
</body>
</html>
