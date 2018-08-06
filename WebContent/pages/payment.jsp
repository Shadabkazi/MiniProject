<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
<title>Payment Mode</title>
</head>
<body>
	<form action="payment" method="post">
		<div id="outerContainer">
			<fieldset id="paymentModeDiv">
			<legend style="color:blue;font-weight:bold;">Payment Mode</legend>
				<input type="radio" name="paymentMode" value="credit" checked="checked">Credit Card <br><br> 
				<input type="radio" name="paymentMode" value="debit">Debit Card<br> <br>
				<input type="radio" name="paymentMode" value="cod">Cash On Delivery
			</fieldset>
			<div class="divcenter">
			</div>
			<fieldset class="divright">
				<legend style="color:blue;font-weight:bold;">Cart Summary</legend>
				
				<span id="prodName">prodName</span>&nbsp;<span id="prodQuantity">prodQuantity</span>&nbsp;<span id="prodPrice">Price</span>
			</fieldset>

		</div>
		<fieldset id="addressSelectionDiv"> <legend style="color:blue;font-weight:bold;">Delivery Address</legend>
	
				<span style="float:left; width:50%;"><input type="radio" name="address" value="homeAddress" checked="checked">Home </span>
				<span style="float:center;"><input type="radio" name="address" value="OfficeAddress" checked="checked">Office</span>
		
</fieldset>
	</form>

</body>
</html>