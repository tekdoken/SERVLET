<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 11/30/2021
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="StudentServlet">Back to customer list</a>

<form action="StudentServlet?action=edit" method="post">
    <input type="text" name="name" value="${student.name}">
    <input type="number" name="id" value="${student.id}">
    <input type="number" name="newid" value="${student.id}">
    <input type="number" name="math" value="${student.scoreMath}">
    <input type="number" name="phy" value="${student.scorePhysics}">
    <input type="number" name="che" value="${student.scoreChemistry}">
    <button>edit</button>
</form>
</body>
</html>
