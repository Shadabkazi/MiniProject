<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>
<h1 style="text-align:center;"><a href="${pageContext.request.contextPath}/admin/category">Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/admin/products">Product</a></h1>
<p style="text-align:right;"><a href="${pageContext.request.contextPath}/admin/product/add">Add Product</a></p>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Brand</td>
			<td>Price</td>
			<td>Description</td>

		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.brand}</td>
				<td>${product.price}</td>
				<td>${product.description}</td>

				<td><a href="${pageContext.request.contextPath}/admin/product/${product.id}/edit">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/admin/product/${product.id}/remove">Delete</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>