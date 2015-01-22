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
            if (!type.equals("admin"))
            {
                request.getSession().setAttribute("error", "sorry u bent niet ingelogd als admin");
                response.sendRedirect("error.jsp");
            }
        %>
        <link href="css/headerAdmin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="manageBox.jsp">dozen</a></li>
                <li><a href="manageUser.jsp">gebruikers</a></li>
                <li><a href="logOut">log uit</a></li>
            </ul>
        </nav>
    </body>
</html>
