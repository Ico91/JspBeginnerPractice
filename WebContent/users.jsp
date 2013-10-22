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
				<li><a href="details?id=${element.id}"><c:out
							value="${element.username}"></c:out> </a><a href="editUser?id=${element.id}">Edit</a></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>