<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pojo.User" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/20
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
    <style type="text/css">
        td,th{
            text-align: center;
        }
        body{
            background-color: pink;
        }
    </style>
</head>
<body>

    <h1 style="background-color: cyan" align="center">I'm Administrator</h1>
    <table border="1" align="center" >
        <tr>
            <th>ID</th>
            <th>账号</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.user}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>修改，删除</td>
            </tr>
        </c:forEach>


    </table>



</body>
</html>
