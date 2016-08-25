<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1> 
	Hello world!
</h1>
${controllerMessage}<br>
<form>
	<a href="/testproject/spring/signIn">Sign in</a> <br> <a href="/testproject/spring/signUp">Sign Up</a>
</form>
</body>
</html>
