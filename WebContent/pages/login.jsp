<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<title>Login</title>
</head>
<body>
	
	<div class="table" >
	<form action="login" method="post">
  <div class="table-row">
    <div class="table-cell">
      Username: 
    </div>
    <div class="table-cell">
      <input type="text" name="username" autofocus="autofocus" placeholder="Enter name">
    </div>
  </div>
  <div class="table-row">
    <div class="table-cell">
      Password: 
    </div>
    <div class="table-cell">
      <input type="password" name="password" >
    </div>
  </div>
  <div class="table-row">
    <div class="table-cell">
      <input type="submit" name="loginBtn" value="Login">
    </div>
    <div class="table-cell">
      <input type="button" name="signUpBtn" value="Sign Up">
    </div>
  </div>
  </form>
  <div class="table-row">
  	<div class="table-cell">
  		<a href="forgotPassword">Forgot Password?</a>
  	</div>
  
  </div>
</div>

</body>
</html>