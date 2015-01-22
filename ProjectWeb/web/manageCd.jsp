<%@page import="Model.Doos"%>
<%@page import="Service.DoosService"%>
<%@page import="Model.Cd"%>
<%@page import="java.util.List"%>
<%@page import="Service.CdService"%>
<%@include file="headerUser.jsp" %>
<%

String titel = "";
    String artiest = "";
    Doos doos = null;
    if (null != request.getSession().getAttribute("titel"))
    {
        titel = (String) request.getSession().getAttribute("titel");
    }
    if (null != request.getSession().getAttribute("artiest"))
    {
        artiest = (String) request.getSession().getAttribute("artiest");
    }
    if (null != request.getSession().getAttribute("doos"))
    {
        doos = (Doos) request.getSession().getAttribute("doos");
    }
    List<Cd> lijst = CdService.selectWhere(titel, artiest, doos);
    List<Doos> dozen = DoosService.selectAll();
%>
<center>
    <form action="manageCd" method="POST">
        <select name="cd" size="15">
            <%
                for (Cd cd : lijst)
                {
                    out.println("<option value='" + cd.getId() + "'>" + cd.getTitel() + "</option>");
                }
            %>
        </select>
        <button type="submit" name="actie" id="bekijk" value="bekijk">bekijk</button>
        <div>
            <table>
                <tr>
                    <td><label for="titel">titel:</label></td>
                    <td><input type="text" name="titel" id="titel" /></td>
                </tr>
                <tr>
                    <td><label for="artiest">artiest:</label></td>
                    <td><input type="text" name="artiest" id="artiest" /></td>
                </tr>
                <tr>
                    <td><label for="doos">doos:</label></td>
                    <td>
                        <select name="doos">
                            <option value="0">selecteer een doos</option>
                            <%
                                for (Doos d : dozen)
                                {
                                    out.println("<option value='" + d.getId() + "'>Doos " + d.getNummer() + "</option>");
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" name="actie" id="zoek" value="zoek">zoek</button>
                    </td>
                </tr>
            </table> 
        </div>
    </form>
</center>