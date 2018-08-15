<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Products</title>
</head>
<body>
<body>
<form:form action="${pageContext.request.contextPath}/admin/product/edit" method="post" modelAttribute="Product">
<table>
<tr><td>ID:</td><td><form:input type="text" name="id" value="${product.id}" path="id"/></td></tr>
<tr><td>Name:</td><td><form:input type="text" name="name" value="${product.name}" path="name"/></td></tr>
<tr><td>Brand:</td><td><form:input type="text" name="brand" value="${product.brand}" path="brand" /></td></tr>
<tr><td>Price:</td><td><form:input type="number" name="price" value="${product.price}" path="price" /></td></tr>
<tr><td>Description:</td><td><form:textarea type="text" name="description" value="${product.description}" path="description"/></td></tr>
<tr><td></td><td><input type="submit" value="Sumit"></td></tr>

</table>


</form:form>

</body>
</html>