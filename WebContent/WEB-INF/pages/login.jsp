<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<c:url value="/resources/imagesL/icons/favicon.ico"/>"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/bootstrap/css/bootstrap.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/fontsL/font-awesome-4.7.0/css/font-awesome.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/fontsL/Linearicons-Free-v1.0.0/icon-font.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/animate/animate.css"/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/css-hamburgers/hamburgers.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/animsition/css/animsition.min.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/select2/select2.min.css"/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendorL/daterangepicker/daterangepicker.css"/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/cssL/util.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/cssL/main.css"/>">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-90 p-b-30">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-40">
						Pheonix Login
					</span>
					
					<div class="wrap-input100 validate-input m-b-16" data-validate="Please enter proper username.">
						<input class="input100" type="text" name="email" placeholder="Username">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-20" data-validate = "Please enter password">
						<span class="btn-show-pass">
							<i class="fa fa fa-eye"></i>
						</span>
						<input class="input100" type="password" name="pass" placeholder="Password">
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
	
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/jquery/jquery-3.2.1.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/animsition/js/animsition.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/bootstrap/js/popper.js"/>"></script>
	<script src="<c:url value="/resources/vendorL/bootstrap/js/bootstrap.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/select2/select2.min.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/daterangepicker/moment.min.js"/>"></script>
	<script src="<c:url value="/resources/vendorL/daterangepicker/daterangepicker.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/vendorL/countdowntime/countdowntime.js"/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value="/resources/jsL/main.js"/>"></script>

</body>
</html>