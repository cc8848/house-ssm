<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>登陆页</title>
<meta http-equiv="content-Type" content="text/html" charset="utf-8">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<link rel="stylesheet" type="text/css" href="css/index.css">

<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/jquery-1.9.1.min.js">
</script>

</head>
<body>

	<div class="content">
		<div id="header">
			<div class="header_title">
				<span class="title_con">物业管理</span>
			</div>
		</div>
		<form id="#mainForm1" class="mainForm mainForm1" action='login.do'
			method="POST">
			<div class="con_title">
				<span class="con_title_sp">欢迎登录杜鹃苑小区物业管理系统</span>
			</div>
			<div class="normalInput">
				<input type="text" class="phone" maxlength="11" placeholder="用户名"
					name="username">
			</div>
			<span class="error error1"></span>

			<div class="normalInput">
				<input type="text" class="password" maxlength="16"	autocomplete="off" placeholder="密码" name="pwd">
					 <input	type="password" class="password1" maxlength="16" autocomplete="off"	placeholder="密码" name="pwd1"> <a id="pwdBtn" href="##"
					class="pwdBtnShow" isshow="false">
					 <i class="i_icon"></i>
				</a>
			</div>
			<span class="error error3"></span> <input type="submit" value="登陸"
				class="fullBtnBlue" />
		</form>
	</div>

</body>
</html>