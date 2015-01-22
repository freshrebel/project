<%@page import="Model.Doos"%>
<%@page import="java.util.List"%>
<%@page import="Service.DoosService"%>
<%@include file="headerAdmin.jsp" %>
<center>
    <%        List<Doos> lijst = DoosService.selectAll();
    %>
    <form method="POST" action="manageBoxSubmit">
        <select name="doos" size="7">
            <%
                for(Doos d : lijst)
                {
                    out.println("<option value='" + d.getId() + "'>doos " + d.getNummer() + "</option>");
                }
            %>
        </select>
        <br/>
        <button name="actie" id="bewerken" value="bewerken">bewerken</button>
        <button name="actie" id="toevoegen" value="toevoegen">toevoegen</button>
    </form>
</center>