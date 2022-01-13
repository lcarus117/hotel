<%--
  Created by IntelliJ IDEA.
  User: Synapse
  Date: 2021/12/24
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${param.msg}
<form action="login" method="post">
    用户名：<input type="text" name="uname">
    密码：<input type="text" name="pwd">
    <input type="submit" value="登录">
</form>

</body>
</html>
