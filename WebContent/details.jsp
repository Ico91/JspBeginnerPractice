<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
	<jsp:body>
		<br /><br /><br />
		<label for="username">Username:</label><br />
		<input type="text" name="username" id="username" value="${user.username}"><br />
		<label for="password">Password:</label><br />
		<input type="text" name="password" id="password" value="${user.password}"><br /> 
		<label for="type">Type:</label><br />
		<input type="text" name="type" id="type" value="${user.type}"><br />
	</jsp:body>
</t:genericpage>