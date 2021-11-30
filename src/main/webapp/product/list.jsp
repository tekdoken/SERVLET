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
<h1>List</h1>

<a href="/products?action=create">create</a>
<a href="/products?action=find">find</a>
<c:forEach items='${requestScope["list"]}' var="student">
    <h3>${student.name},${student.id},${student.price},<a href="/products?action=edit&id=${student.id}">edit</a>
        <a href="/products?action=delete&id=${student.id}" onclick="if (confirm('Delete selected item?')){return true;}else{event.stopPropagation(); event.preventDefault();};" title="Link Title">
            delete
        </a>
    </h3>
</c:forEach>
</body>
</html>
