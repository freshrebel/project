<%-- 
    Document   : index
    Created on : 8-jan-2015, 16:15:53
    Author     : Arno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            String type = "";
            boolean login = false;
            String message = "";
            try
            {
                type = (String) request.getSession().getAttribute("type");
                login = (Boolean) request.getSession().getAttribute("login");
                if (type.equals("admin") && login == true)
                {
                    response.sendRedirect("manageBox.jsp");
                }
                if (type.equals("gebruiker") && login == true)
                {
                    response.sendRedirect("userStart.jsp");
                }
            }
            catch (Exception e)
            {
                message = e.getMessage();
            }

        %>
    </head>
    <body>
    <center>
        <form action="login" method="POST">
            <table>
                <tr>
                    <td><label  for="gebruikersnaam">gebruikersnaam</label></td>
                    <td>
                        <input name="gebruikersnaam" id="gebruikersnaam" type="text" />
                    </td>
                </tr>
                <tr>
                    <td><label  for="wachtwoord">wachtwoord</label></td>
                    <td>
                        <input name="wachtwoord" id="gebruikersnaam" type="password" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" name="login" id="login">log in</button>
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
