<%@page import="Service.GebruikerService"%>
<%@page import="java.util.List"%>
<%@page import="Model.Gebruiker"%>
<%@include file="headerAdmin.jsp" %>
<center>
    <%
        List<Gebruiker> lijst = GebruikerService.selectAll();
    %>
    <form action="manageUser">
        <select name="gebruiker" size="7">
            <%
                for(Gebruiker g : lijst)
                {
                    out.println("<option value='" + g.getId() + "'>" + g.getGebruikersnaam()+ "</option>");
                }
            %>
        </select>
        <br/>
        <button type="submit" name="actie" id="bekijken" value="bekijken">bekijken</button>
        <button type="submit" name="actie" id="toevoegen" value="toevoegen">toevoegen</button>
    </form>
</center>