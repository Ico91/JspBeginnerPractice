<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jspf"%>
	<br /><br /><br />
	<form id="update" method="POST" action="update?id=${user.id}">
		<label for="username">Username:</label><br />
		<input type="text" name="username" id="username" value="${user.username}"><br />
		<label for="password">Password:</label><br />
		<input type="text" name="password" id="password" value="${user.password}"><br /> 
		<label for="type">Type:</label><br />
		<select name="type" id="type">
            <c:forEach items="${types}" var="type">
                <option value="${type}" ${user.type == type ? 'selected' : ''}>${type}</option>        
            </c:forEach>
        </select>
		<input type="submit" value="Save">
	</form>
</body>
</html>