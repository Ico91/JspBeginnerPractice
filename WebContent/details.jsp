<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label for="username">Username:</label><br />
	<input type="text" name="username" id="username" value="${user.username}"><br />
	<label for="password">Password:</label><br />
	<input type="text" name="password" id="password" value="${user.password}"><br /> 
	<label for="type">Type:</label><br />
	<input type="text" name="type" id="type" value="${user.type}"><br />
	<a href="home">Return home</a>
</body>
</html>