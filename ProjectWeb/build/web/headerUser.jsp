<%-- 
    Document   : headerUser
    Created on : 14-jan-2015, 14:45:31
    Author     : Arno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            String type = (String) request.getSession().getAttribute("type").toString();
            boolean login = (Boolean) request.getSession().getAttribute("login");
            if (!login)
            {
                request.getSession().setAttribute("error", "sorry u bent niet ingelogd");
                response.sendRedirect("error.jsp");
            }
            if (!type.equals("gebruiker"))
            {
                request.getSession().setAttribute("error", "sorry u bent niet ingelogd als gebruiker");
                response.sendRedirect("error.jsp");
            }
        %>
        <link href="css/headerUser.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav>
            <ul>
                <li>
                    <a href="#">CD's</a>
                    <ul>
                        <li><a href="manageCd.jsp">bekijken</a></li>
                        <li><a href="insertCd.jsp">toevoegen</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">Nummers</a>
                    <ul>
                        <li><a href="manageSong.jsp">bekijken</a></li>
                        <li><a href="insertSong.jsp">toevoegen</a></li>
                    </ul>
                </li>
                <li><a href="logOut">log uit</a></li>
            </ul>
        </nav>
    </body>
</html>
