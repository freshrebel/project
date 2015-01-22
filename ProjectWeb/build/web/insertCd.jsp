<%@page import="Service.DoosService"%>
<%@page import="Model.Doos"%>
<%@page import="java.util.List"%>
<%@include file="headerUser.jsp" %>
<%
    List<Doos> dozen = DoosService.selectAll();
%>
<center>
    <form action="insertCd" method="POST">
        <table>
            <tr>
                <td><label for="titel">titel:</label></td>
                <td>
                    <input type="text" name="titel" id="titel"/>
                </td>
            </tr>
            <tr>
                <td><label for="artiest">artiest:</label></td>
                <td><input type="text" name="artiest" id="artiest"/></td>
            </tr>
            <tr>
                <td><label for="doos">doos:</label></td>
                <td>
                    <select name="doos">
                        <option value="0">geen doos</option>
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
                    <button type="submit" name="actie" id="invoegen" value="invoegen">invoegen</button>
                    <button type="submit" name="actie" id="annuleren" value="annuleren">annuleren</button>
                </td>
            </tr>
        </table>
    </form>
</center>