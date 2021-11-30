<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 11/30/2021
  Time: 1:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/products?action=create" method="post">
   name: <input type="text" name="name">
    id:<input type="number" name="id">
    price:<input type="number" name="price">
    <button>create</button>
</form>
</body>
</html>
