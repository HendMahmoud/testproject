<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/testproject/spring/doSignIn"
		method="post">
		<h1>
			<strong>Login</strong>
		</h1>
		<label>Email </label> <input type="text" name="email" /><br>
		<label>Password </label> <input type="password" name="pass" />
		<P> 
			Don't have an account? <a href="/testproject/spring/signUp">Sign Up</a>
		</P>
		<button>Log In</button>
	</form>

</body>
</html>