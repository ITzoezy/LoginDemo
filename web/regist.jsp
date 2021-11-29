<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/19
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>账号注册</title>
    <style type="text/css">
        #a{
            width: 600px;
            height: 300px;
            border: 1px dashed;
            background-color: cyan;
            text-align: center;
            display: block;
            margin: 0 auto;
        }
        body{
            background-color: pink;
        }
    </style>
</head>
<body>
        <div id="a">
            <h1>注册账号</h1>
            ${empty requestScope.msg?"请输入用户名和密码":requestScope.msg}<br>

            <form action="registServlet" method="post">
                账号:<input type="text" name="username"><br>
                密码:<input type="password" name="password"><br>
                <input type="submit" value="注册">
                <input type="submit" value="重置"><br>

            </form>
        </div>

</body>
</html>
