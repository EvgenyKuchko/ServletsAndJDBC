<%@ page import="com.Person" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.08.2021
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%
    Person person = (Person)session.getAttribute("person");
%>
<h1>Hello <%=person.getFirstName()%></h1>
<h2><a href="home">Back to home page</a></h2>
</body>
</html>
