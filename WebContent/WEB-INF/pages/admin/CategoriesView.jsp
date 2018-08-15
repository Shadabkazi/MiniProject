<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Categories</title>
</head>
<body>
<h1 style="text-align:center;">All Categories</h1>
<p style="text-align:right;"><a href="${pageContext.request.contextPath}/admin/category/add">Add Category</a></p>
<table border=1>
<tr>
<td>ID</td>
<td>Name</td>
<td>Description</td>
</tr>
<c:forEach var="category" items="${categories}">
<tr>
<td>${category.id}</td>
<td>${category.name}</td>
<td>${category.description}</td>
<td><a href="${pageContext.request.contextPath}/admin/category/${category.id}/edit">Edit</a></td>
<td><a href="${pageContext.request.contextPath}/admin/category/${category.id}/remove">Delete</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>