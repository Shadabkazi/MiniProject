<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
<script>
function validate(){
    if (document.form.fName.value == ""){
    alert("First Name required");
    return false;
}

    if (document.form.lName.value == "")
    {
    alert("Last Name required");
    return false;
    }
    
    if (document.form.mobileNumber.value == "")
    {
    alert("Mobile no. required");
    return false;
    }
    
    if (document.form.addressLine1.value == "")
    {
    alert("Address required");
    return false;
    }
    
    if (document.form.emailId.value == "")
    {
    alert("Username required");
    return false;
    }
    
    if (document.form.password.value == "")
    {
    alert("Password required");
    return false;
    }
    
    if (document.form.rep.value != document.form.password.value)
    {
    alert("password not same");
    return false;
    }
}
</script>
</head>
<body>
<div align="center">
<form name="form" action="${pageContext.request.contextPath}/register" method="post" onSubmit="return validate()">
<table frame="box">
<h1><b>Registration Form</b></h1>

<tr><td align="right">First name: </td><td><input type="text" name="fName" maxlength="15" autofocus></td></tr>

<tr><td align="right">Last name: </td><td><input type="text" name="lName" maxlength="15" autofocus></td></tr>

<tr><td align="right">Mobile:</td><td><input type="number" name="mobileNumber"maxlength="10" autofocus></td></tr>

<tr><td align="right">Address:</td><td><textarea name="addressLine1"></textarea></td></tr>

<tr><td align="right">Address1:</td><td><textarea name="addressLine2"></textarea></td></tr>

<tr><td align="right">Address2:</td><td><textarea name="addressLine3"></textarea></td></tr>

<tr><td align="right">Pincode:</td><td><input type="number" name="pincode" maxlength="6" autofocus></td></tr>

<tr><td align="right">EmailId:</td><td><input type="text" name="emailId" maxlength="10" autofocus></td></tr>

<tr><td align="right">Password:</td><td><input type="password" name="password" maxlength="10" autofocus></td></tr>

<tr><td align="right">Re-enter Password:</td><td><input type="password" name="rep" maxlength="10" autofocus></td></tr>

<tr><td align="right"></td><td><input type="submit" value="Register">&nbsp;&nbsp;&nbsp;<input type="reset"></td></tr>

</table>




</form>
</div>
</body>
</html>