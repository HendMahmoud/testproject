<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>

<script>
function myFunction() {
	var pass1 = document.getElementById("pass1").value;
    var pass2 = document.getElementById("pass2").value;
    if (pass1 != pass2) {
    	document.getElementById("notmatch").innerHTML = "Incorrect confirmation password!";
    }else{
    	document.getElementById("notmatch").innerHTML = "";
    }
}
</script>
</head>

<body>

	<form action="http://localhost:8080/testproject/spring/doSignUp"
		method="post">
		<h1>
			<strong>Sign Up</strong>
		</h1>
		<label>Name <span>*</span></label> <input type="text" name="name" required /><br>
		<label>Email <span>*</span></label> <input type="text" name="email" required /><br>
		<label>Password <span>*</span></label> <input id="pass1" type="password" name="pass" required /><br>
		
		<label>Confirm password <span>*</span></label> <input onblur="myFunction()" id=pass2 type="password" name="confirmPass" required />
		<p id="notmatch" style="color:red;"></p><br>
		<button>Create</button>
	</form>

</body>
</html>