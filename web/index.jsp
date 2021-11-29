<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/17
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
	<script type="text/javascript">
		function Open(){
			window.location.href = "login.jsp";
		}
		// function openAdmin(){
		// 	window.location.href = "admin.jsp"
		// }
	</script>
	<style type="text/css">
		button{
			height: 50px;
			width: 500px;
			text-align: center;
			display: block;
			margin: 0 auto;
			background-color: cyan;
		}
	</style>
</head>
<body style="background-color: pink">

	<h2 style="background-color: pink" align="center">请选择您的身份</h2>
	<div>
		<button onclick="Open()">管理员</button><br>
		<button onclick="Open()">普通用户</button>
	</div>

</body>
</html>
