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
<a href="Students">Back to customer list</a>

<form action="Students?action=edit&id=${student.id}" method="post">
    name: <input type="text" name="name" value="${student.name}">
<%--    <input type="hidden" name="id" value="${student.id}">--%>
    score Math:<input type="number" name="math" value="${student.scoreMath}">
    score Physics: <input type="number" name="phy" value="${student.scorePhysics}">
    score Chemistry: <input type="number" name="che" value="${student.scoreChemistry}">
    <button>edit</button>
</form>
</body>
</html>
