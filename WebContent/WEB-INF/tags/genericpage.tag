<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<html>
<body>
	<div id="pageheader">
		<form method="POST" action="logout">
			<input type="submit" value="Logout">
		</form>
		<a href="home">Home</a>
	</div>
	<div id="body">
		<jsp:doBody />
	</div>
	<div id="pagefooter">
		
	</div>
</body>
</html>