<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 11/30/2021
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>uhuhui</h1>
<a href="/products?action=create">create</a>
<c:forEach items='${requestScope["list"]}' var="pr">
    <h3>${pr.name},${pr.id},${pr.price},<a href="/products?action=edit&id=${pr.id}">edit</a><a href="/products?action=delete&id=${pr.id}">delete</a></h3>
</c:forEach>
</body>
</html>
