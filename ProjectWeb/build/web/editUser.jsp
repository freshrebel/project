<%@page import="Model.Gebruiker"%>
<%@page import="Service.GebruikerService"%>
<%@include file="headerAdmin.jsp" %>
<center>
    <%        int id = (Integer) request.getSession().getAttribute("id");
        Gebruiker gebruiker = GebruikerService.selectOne(id);
        String gebruikersnaam = gebruiker.getGebruikersnaam();
        String wachtwoord = gebruiker.getWachtwoord();
        String typeg = gebruiker.getType();
    %>

    <form action="editUser" method="POST">
        <table>
            <tr>
                <td>
                    <label for="gebruikersnaam">gebruikersnaam</label>
                </td>
                <td>
                    <input type="text" name="gebruikersnaam" id="gebruikersnaam" value="<%=gebruikersnaam%>"/>
                    <input type="hidden" name="id" id="id" value="<%=id%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="wachtwoord">wachtwoord</label>
                </td>
                <td>
                    <input type="text" name="wachtwoord" id="wachtwoord" value="<%=wachtwoord%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="type">type</label>
                </td>
                <td>
                    <select name="type">
                        <option value="<%=typeg%>"><%=typeg%></option>
                        <%
                            if (typeg.equals("admin"))
                            {
                                out.println("<option value='gebruiker'>gebruiker</option>");
                            }
                            if (typeg.equals("gebruiker"))
                            {
                                out.println("<option value='admin'>admin</option>");
                            }
                        %>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="actie" id="bewerk" value="bewerk">bewerk</button>
                    <button type="submit" name="actie" id="annuleren" value="annuleren">annuleren</button>
                </td>
            </tr>
        </table>
    </form>
</center>