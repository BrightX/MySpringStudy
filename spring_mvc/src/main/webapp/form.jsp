<%--
  Created by IntelliJ IDEA.
  User: 徐亮亮
  Date: 2020/8/26
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">

    <input type="text" name="userList[0].username"> <br>
    <input type="number" name="userList[0].age"> <br>

    <input type="text" name="userList[1].username"> <br>
    <input type="number" name="userList[1].age"> <br>

    <input type="submit" value="提交">
</form>
</body>
</html>
