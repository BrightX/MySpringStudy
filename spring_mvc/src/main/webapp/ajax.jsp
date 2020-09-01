<%--
  Created by IntelliJ IDEA.
  User: 徐亮亮
  Date: 2020/8/26
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-3.5.0.min.js"></script>
    <script>
        let userList = new Array();
        userList.push({
            username: "Tom",
            age: 18
        });
        userList.push({
            username: "Maria",
            age: 19
        });
        $.ajax({
            url: "${pageContext.request.contextPath}/user/quick15",
            type: "post",
            data: JSON.stringify(userList),
            contentType: "application/json;charset=utf-8",
            success: function (result) {
                console.log(result)
            }
        });
    </script>
</head>

<body>

</body>
</html>
