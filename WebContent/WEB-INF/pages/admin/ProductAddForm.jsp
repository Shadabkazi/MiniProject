<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form:form action="add" method="post" enctype="multipart/form-data" modelAttribute="Product">
<table>
<tr><td>Name:</td><td><form:input type="text" name="name" path="name"/></td></tr>
<tr><td>Brand:</td><td><form:input type="text" name="brand" path="brand" /></td></tr>
<tr><td>Price:</td><td><form:input type="number" name="price" path="price" /></td></tr>
<tr><td>Description:</td><td><form:textarea type="text" name="description" path="description"/></td></tr>
<tr><td>Image:</td><td><input type="file" name="image" /></td></tr>
<tr><td>Category:</td><td><form:select path="Category.cName" placeholder="categories" tabindex="4" items="${Category}"></form:select></td>
<tr><td></td><td><input type="submit" value="Sumit"></td></tr>

</table>


</form:form>


</body>
</html>