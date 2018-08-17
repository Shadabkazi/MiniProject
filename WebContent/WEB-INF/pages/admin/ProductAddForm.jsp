<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form:form action="add" method="post" enctype="multipart/form-data">
<table>
<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
<tr><td>Brand:</td><td><input type="text" name="brand"/></td></tr>
<tr><td>Price:</td><td><input type="number" name="price"/></td></tr>
<tr><td>Description:</td><td><textarea name="description"></textarea></td></tr>
<tr><td>Image:</td><td><input type="file" name="image" /></td></tr>
<tr><td>Select Category:</td><td><select name="category" tabindex="4" >
	 <c:forEach items="${category }" var="cat">
	 	<option value="${cat.id }" >${cat.cName }</option>
	 </c:forEach>
</select>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>

</table>


</form:form>


</body>
</html>