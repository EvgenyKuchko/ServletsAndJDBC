<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.08.2021
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/home" method="POST">
    Login: <label>
    <input type="text" name="login"/>
</label>
    <br/>
    Password: <label>
    <input type="text" name="password"/>
</label>
    <input type="submit" value="Submit"/>
</form>
<h2><a href="registration">Registration</a></h2>
</body>
</html>
