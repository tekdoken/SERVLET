<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 11/30/2021
  Time: 1:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products">Back to customer list</a>

<form action="/products?action=edit" method="post">
    <input type="text" name="name" value="${productEdit.name}">
    <input type="number" name="id" value="${productEdit.id}">
    <input type="number" name="price" value="${productEdit.price}">
    <button>edit</button>
</form>
</body>
</html>
