<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Category</title>

</head>
<body>
<form action="addData" method="post" enctype="multipart/form-data">
<table>
<tr><td>Category Name:</td><td><input type="text" name="name"></td></tr>
<tr><td>Category Description:</td><td><input type="text" name="description"></td></tr>
<!-- <tr><td>Image name:</td><td><input type="text" name="imageName"></td></tr> -->
<tr><td>Image:</td><td><input type="file" name="image"></td></tr>
<tr><td><input type="submit" value="Submit"></td><td><input type="reset" value="Reset"></td></tr>
</table>
</form>

</body>
</html>