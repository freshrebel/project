<%@page import="java.util.List"%>
<%@page import="Service.DoosService"%>
<%@page import="Model.Cd"%>
<%@page import="Service.CdService"%>
<%@page import="Model.Doos"%>
<%@include file="headerUser.jsp" %>
<%  String ids = request.getSession().getAttribute("id").toString();
    int id = Integer.parseInt(ids);
    Cd cd = CdService.selectOne(id);
    Doos doos = new Doos();
    if (!(cd.getDoos() == null))
    {
        doos = DoosService.selectOne(Integer.parseInt(cd.getDoos().getId().toString()));
    }
    List<Doos> dozen = DoosService.selectAll();
%>
<center>
    <form action="watchCd" method="POST">
        <table>
            <tr>
                <td><label for="titel">titel:</label></td>
                <td>
                    <input type="text" name="titel" id="titel" value="<%=cd.getTitel()%>" disabled/>
                    <input type="hidden" name ="id" id="id" value="<%=cd.getId()%>"/>
                </td>
            </tr>
            <tr>
                <td><label for="artiest">artiest:</label></td>
                <td><input type="text" name="artiest" id="artiest" value="<%=cd.getArtiest()%>" disabled/></td>
            </tr>
            <tr>
                <td><label for="doos">doos:</label></td>
                <td>
                    <select name="doos" disabled>
                        <%
                            if (cd.getDoos() == null)
                            {
                                out.println("<option value='0'>geen doos</option>");
                            }
                            else
                            {
                                for (Doos d : dozen)
                                {
                                    if (d.getId() != doos.getId())
                                    {
                                        out.println("<option value='" + d.getId() + "'>Doos " + d.getNummer() + "</option>");
                                    }

                                }
                            }
                            

                        %>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="actie" id="bewerk" value="bewerk">bewerk</button>
                    <button type="submit" name="actie" id="verwijder" value="verwijder">verwijder</button>
                    <button type="submit" name="actie" id="terug" value="terug">terug</button>
                </td>
            </tr>
        </table>
    </form>
</center>