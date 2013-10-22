<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method="POST" action="LogoutController">
		<input type="submit" value="Logout">
	</form>
	<div class="usersList">
		<h1>Users:</h1>
		<ul>
			<c:forEach items="${users}" var="element">
				<li><a href="UserDetailsController?id=${element.id}"><c:out
							value="${element.username}"></c:out> </a><a href="#">Edit</a></li>

			</c:forEach>
		</ul>
	</div>
	<div class="userDetails">
		<form id="details" method="POST" action="UpdateUserServlet">
			<label for="username">Username:</label><br />
			<input type="text" name="username" id="username" value="${result.username}" ><br />
			<label for="password">Password:</label><br />
			<input type="text" name="password" id="password" value="${result.password}" ><br /> 
			<label for="type">Type:</label><br />
			<select name="type" id="type" >
				<option value="Admin">Admin</option>
				<option value="User">User</option>
			</select><br />
			<br /> <input type="submit" value="Save" >
		</form>
	</div>
</body>
</html>