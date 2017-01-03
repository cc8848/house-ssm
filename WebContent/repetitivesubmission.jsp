<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<h1>防止用户重复注册,本项目用不到,做着试试</h1>
	<form action="<%=request.getContextPath()%>/user/sign" method="get">
		name:<input type="text" name="uname"><br> phone:<input
			type="text" name="phone"><br> <input type="submit"
			value="提交">${signmessage }<br> <a
			href="<%=request.getContextPath()%>/user/restsign/uname/phone">做restful</a>
		
	</form>
</body>
</html>