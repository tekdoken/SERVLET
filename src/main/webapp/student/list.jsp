<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 11/30/2021
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td{
            border:1px solid #47d21d;
        }
        table{
            border-collapse:collapse;
        }</style>
</head>
<body>
<h2>List Student</h2>
<table>
    <tr>
        <td>name</td>
        <td>id</td>
        <td>score math</td>
        <td>score
            Physics
        </td>
        <td>score Chemistry</td>

    </tr>
    <c:forEach items='${requestScope["list"]}' var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.id}</td>
            <td>${student.scoreMath}</td>
            <td>${student.scorePhysics}
            </td>
            <td>${student.scoreChemistry}</td>
            <td><a
                    href="/Students?action=edit&id=${student.id}"> edit </a></td>
            <td><a href="/Students?action=delete&id=${student.id}"
                   onclick="if (confirm('Delete selected item?')){return true;}else{event.stopPropagation(); event.preventDefault();};"
                   title="Link Title">
                delete
            </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
