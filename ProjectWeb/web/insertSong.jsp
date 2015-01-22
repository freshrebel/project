<%@include file="headerUser.jsp" %>
<center>
    <form method="POST" action="insertSong">
        <table>
            <tr>
                <td><label for="titel">titel:</label></td>
                <td><input type="text" name="titel" id="titel"/></td>
            </tr>
            <tr>
                <td><label for="artiest">artiest:</label></td>
                <td><input type="text" name="artiest" id="artiest"/></td>
            </tr>
            <tr>
                <td><label>tijd:</label></td>
                <td>
                    <input type="number" name="minuten" id="minuten" style="width:3em;"/>min
                    <input type="number" name="seconden" id="seconden" style="width:3em;"/>sec
                </td>
            </tr>
            <tr>
                <td><label for="bpm">bpm:</label></td>
                <td><input type="number" name="bpm" id="bpm"/></td>
            </tr>
            <tr>
                <td><label for="genres">genres:</label></td>
                <td><input type="text" name="genres" id="genres"/></td>
            </tr>
            <tr>
                <td><label for="labels">labels:</label></td>
                <td><input type="text" name="labels" id="labels"/></td>
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
                    <button type="submit" name="actie" id="toevoegen" value="toevoegen">toevoegen</button>
                    <button type="submit" name="actie" id="terug" value="terug">terug</button>
                </td>
            </tr>
        </table>
    </form>
</center>