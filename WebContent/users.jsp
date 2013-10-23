<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:genericpage>
	<jsp:body>
	<br /><br /><br />
	<form id="search" name="searchForm" method="GET" action="search">
		        <input type="text" name="search" id="search"><input type="submit" value="search">
	</form>
	<a href="home">Show all</a>
	<div class="usersList">
		<h1>Users:</h1>
		<ul>
			<c:forEach items="${users}" var="element">
				<li><a href="details?id=${element.id}"><c:out
							value="${element.username}"></c:out> </a><a href="editUser?id=${element.id}">Edit</a></li>
			</c:forEach>
		</ul>
	</div>
	</jsp:body>
</t:genericpage>