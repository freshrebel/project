<%@page import="Model.Nummer"%>
<%@page import="java.util.List"%>
<%@page import="Service.NummerService"%>
<%@page import="Model.Cd"%>
<%@include file="headerUser.jsp" %>
<%    String titel = "";
    String artiest = "";
    int minuten = 0;
    int seconden = 0;
    int bpm = 0;
    String genres = "";
    String labels = "";
    Cd cd = null;

    if (request.getSession().getAttribute("titel") != null)
    {
        titel = (String) request.getSession().getAttribute("titel");
    }
    if (request.getSession().getAttribute("artiest") != null)
    {
        artiest = (String) request.getSession().getAttribute("artiest");
    }
    if (request.getSession().getAttribute("minuten") != null)
    {
        minuten = Integer.parseInt((String) request.getSession().getAttribute("minuten"));
    }
    if (request.getSession().getAttribute("seconden") != null)
    {
        seconden = Integer.parseInt((String) request.getSession().getAttribute("seconden"));
    }
    if (request.getSession().getAttribute("bpm") != null)
    {
        bpm = Integer.parseInt((String) request.getSession().getAttribute("bpm"));
    }
    if (request.getSession().getAttribute("genres") != null)
    {
        genres = (String) request.getSession().getAttribute("genres");
    }
    if (request.getSession().getAttribute("labels") != null)
    {
        labels = (String) request.getSession().getAttribute("labels");
    }
    if (request.getSession().getAttribute("cd") != null)
    {
        cd = (Cd) request.getSession().getAttribute("cd");
    }
    
    List<Nummer> lijst = NummerService.selectWhere(titel, artiest, minuten, seconden, bpm, genres, labels, cd);
%>
<center>
<form action="manageSong" method="POST">
        <select name="nummer" size="15">
            <%
                for (Nummer nummer : lijst)
                {
                    out.println("<option value='" + nummer.getId() + "'>" + nummer.getTitel() + "</option>");
                }
            %>
        </select>
        <button type="submit" name="actie" id="bekijk" value="bekijk">bekijk</button>
        <div>
            <table>
                <tr>
                    <td><label for="titel">titel:</label></td>
                    <td><input type="text" name="titel" id="titel" value="<%=titel%>" /></td>
                </tr>
                <tr>
                    <td><label for="artiest">artiest:</label></td>
                    <td><input type="text" name="artiest" id="artiest" value="<%=artiest%>" /></td>
                </tr>
                <tr>
                    <td><label>tijd:</label></td>
                    <td>
                        <input type="number" name="minuten" id="minuten" value="<%=minuten%>" style="width:3em;"/>min
                        <input type="number" name="seconden" id="seconden" value="<%=seconden%>" style="width:3em;"/>sec
                    </td>
                </tr>
                <tr>
                    <td><label for="bpm">bpm:</label></td>
                    <td><input type="number" name="bpm" id="bpm" value="<%=bpm%>" /></td>
                </tr>
                <tr>
                    <td><label for="genres">genres:</label></td>
                    <td><input type="text" name="genres" id="genres" value="<%=genres%>" /></td>
                </tr>
                <tr>
                    <td><label for="labels">labels:</label></td>
                    <td><input type="text" name="labels" id="labels" value="<%=labels%>" /></td>
                </tr>
                <tr>
                    <td><label for="cd">cd:</label></td>
                    <td>
                        <input type="text" name="cd" id="cd" disabled/>
                        <input type="hidden" name="cd_id" id="cd_id"/>
                        <button type="submit" name="actie" id="zoek_cd" value="zoek_cd">zoek cd</button>
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