<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Category</title>
</head>
<body>
<h1>Edit Category</h1>
<form action="${pageContext.request.contextPath}/admin/category/edit" method="post" modelAttribute="Category">
<table>
<tr><td>Category ID:</td><td><input type="text" name="id" value="${Category.id}"></td></tr>
<tr><td>category Name:</td><td><input type="text" name="name" value="${Category.name}"></td></tr>
<tr><td>Category Description:</td><td><input type="text" name="description" value="${Category.description}"></td></tr>
<%-- <tr><td>Image:</td><td><input type="file" name="image" value="${Category.image}"></td></tr> --%>
<tr><td></td><td><input type="submit"></td></tr>
</table>


</form>

</body>
</html>