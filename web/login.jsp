<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/17
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户页面</title>

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
        <h1 style=>登录界面</h1>
        ${empty requestScope.msg?"请输入用户名和密码":requestScope.msg}<br>
        <form action="loginServlet" method="post" >
            账号:<input type="text" name="username"><br>
            密码:<input type="password" name="password"><br>
                        没有账号?<a href="regist.jsp">注册账号</a><br>
            <input type="submit" name="login">

        </form>
    </div>

</body>
</html>
