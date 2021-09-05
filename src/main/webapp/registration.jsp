<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.08.2021
  Time: 0:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/registration" method="POST">
    First Name: <label>
    <input type="text" name="first_name"/>
</label>
    <br/>
    Last Name: <label>
    <input type="text" name="last_name"/>
</label>
    <br/>
    Age: <label>
    <input type="text" name="age"/>
</label>
    <br/>
    Login: <label>
    <input type="text" name="login"/>
</label>
    <br/>
    Password: <label>
    <input type="text" name="password"/>
</label>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>