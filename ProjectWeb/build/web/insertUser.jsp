<%@include file="headerAdmin.jsp" %>
<center>
    <form action="insertUser" method="POST">
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
                    <input name="wachtwoord" id="gebruikersnaam" type="text" />
                </td>
            </tr>
            <tr>
                <td><label  for="type">type</label></td>
                <td>
                    <select name="type" id="type">
                        <option value="admin">admin</option>
                        <option value="gebruiker">gebruiker</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="insert" id="insert">toevoegen</button>
                </td>
            </tr>
        </table>
    </form>
</center>