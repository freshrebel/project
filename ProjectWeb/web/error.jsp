<%-- 
    Document   : error
    Created on : 8-jan-2015, 15:51:10
    Author     : Arno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String error;
    error = (String)session.getAttribute("error");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= error.toString() %>
    </body>
</html>
