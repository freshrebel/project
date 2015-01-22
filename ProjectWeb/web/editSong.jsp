<%@page import="Service.CdService"%>
<%@page import="Model.Cd"%>
<%@page import="Service.NummerService"%>
<%@page import="Model.Nummer"%>
<%@include file="headerUser.jsp" %>
<%    String ids = request.getSession().getAttribute("id").toString();
    int id = Integer.parseInt(ids);
    Nummer nummer = NummerService.selectOne(id);
    Cd cd;
    if (!(nummer.getCd() == null))
    {
        cd = CdService.selectOne(Integer.parseInt(nummer.getCd().getId().toString()));
    }
    else
    {
        cd = new Cd();
        cd.setTitel("geen cd");
    }
    
%>

<center>
    <form method="POST" action="watchSong">
        <table>
            <tr>
                <td><label for="titel">titel:</label></td>
                <td>
                    <input type="text" name="titel" id="titel" value="<%=nummer.getTitel()%>" />
                    <input type="hidden" name="id" id="id" value="<%=nummer.getId()%>"/>
                </td>
            </tr>
            <tr>
                <td><label for="artiest">artiest:</label></td>
                <td><input type="text" name="artiest" id="artiest" value="<%=nummer.getArtiest()%>"  /></td>
            </tr>
            <tr>
                <td><label>tijd:</label></td>
                <td>
                    <input type="number" name="minuten" id="minuten" style="width:3em;" value="<%=nummer.getMinuten()%>" />min
                    <input type="number" name="seconden" id="seconden" style="width:3em;" value="<%=nummer.getSeconden()%>" />sec
                </td>
            </tr>
            <tr>
                <td><label for="bpm">bpm:</label></td>
                <td><input type="number" name="bpm" id="bpm" value="<%=nummer.getBpm()%>" /></td>
            </tr>
            <tr>
                <td><label for="genres">genres:</label></td>
                <td><input type="text" name="genres" id="genres" value="<%=nummer.getGenres()%>" /></td>
            </tr>
            <tr>
                <td><label for="labels">labels:</label></td>
                <td><input type="text" name="labels" id="labels" value="<%=nummer.getLabels()%>" /></td>
            </tr>
            <tr>
                <td><label for="cd">cd:</label></td>
                <td>
                    <input type="text" name="cd" id="cd" value="<%=cd.getTitel()%>" disabled/>
                    <input type="hidden" name="cd_id" id="cd_id"/>
                           <button type="submit" name="actie" id="zoek_cd" value="zoek_cd">zoek cd</button>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="actie" id="bewerk" value="bewerk">bewerk</button>
                    <button type="submit" name="actie" id="terug" value="terug">terug</button>
                </td>
            </tr>
        </table>
    </form>
</center>