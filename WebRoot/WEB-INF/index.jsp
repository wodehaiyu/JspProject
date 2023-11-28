<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
	body{
		margin: 0;
		background-image: url('/JspProject/static/background.jpg');
        background-size: cover; 
	}
	h1{
		color:#fff;
		display: inline-block;
	}
	.register{
		width: 400px;
		margin-top:150px;
		margin-left: auto;
		margin-right: auto;
		border-radius:8px;
		padding:10px 40px 60px 40px;
		background-color: rgba(25, 111, 61, 0.9);
		box-shadow: 0px 5px 10px 0px #000;
	}

	.button{
		box-sizing: border-box;
		width:100%;
		height: 45px;
		font-size: 18px;
		color:#000;
		background: #F4D03F ;
		border: 0;
		border-radius:4px;
	}
	.button:hover{
		background: #F1C40F  ;
	}
	span{
		display: inline-block;
		width:80px;
		height:30px;
		text-align: justify;
		text-align-last: justify;
		color: #fff;
	}
	.input-text{
		box-sizing: border-box;
		width:100%;
		margin-bottom:16px;
		height: 45px;
		font-size: 18px;
		border:0px solid white;
		border-radius:4px;
		padding-left: 5%;
		background-color: rgba(225, 225, 225, 0.5);
	}
	.login{
		color:rgba(255, 255, 255, 0.2);
	}
	.login:hover{
		color:rgba(255, 255, 255, 1);
	}
</style>
</head>
<body>

	<div class="register">
		<h1>用户注册</h1>
		<h1 style="width:20px;text-align: center;font-weight: 100">|</h1>
		<h1 class="login">用户登录</h1>
		<div style="height: 1px;background: #145A32;width: 100%; margin-bottom: 20px"></div>
		<form action="#">
				<span>用户名</span>
				<input class="input-text" type="text" name="username"><br>
				<span>密码</span>
				<input class="input-text" type="password" name="password1"><br>
				<span>确认密码</span>
				<input class="input-text" type="password" name="password2" style="margin-bottom: 40px;"><br>
				<input class="button" type="submit" value = "注 册">
		</form>
	</div>
</body>
</html>