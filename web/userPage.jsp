<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/20
  Time: 15:44
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
          font-size: 20px;
          font-family: "宋体";
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
    <form  action="" name="form" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td>
                    用户名: <input type="text" name="username">
                </td>
            </tr>
            <tr>
                <td>
                    头像:   <input type="file" name="photo">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="上传" type="submit" onclick="form.action='uploadServlet';form.submit()">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" value="下载"type="submit" onclick="form.action='download';form.submit()">
                </td>
            </tr>

        </table>
    </form>

</div>

</body>
</html>
