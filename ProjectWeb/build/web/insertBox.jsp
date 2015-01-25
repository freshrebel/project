<%@page import="Service.DoosService"%>
<%@page import="Model.Doos"%>
<%@page import="java.util.List"%>
<%@include file="headerAdmin.jsp" %>
<center>
    <%        List<Doos> lijst = DoosService.selectAll();
        int nummer = 0;
        for (int i = 1; i < (lijst.size() + 2); i++)
        {
            nummer = i;
            loop:
            for (Doos d : lijst)
            {
                if (nummer == d.getNummer())
                {
                    nummer = 0;
                    break loop;
                }
            }
            if (nummer != 0)
            {
                break;
            }
        }
    %>
    <form action="insertBox" method="POST">
        <table>
            <tr>
                <td>
                    <label for="nummer">nummer</label>
                </td>
                <td>
                    <input type="text" name="nr" id="nr" value="<%=nummer%>" disabled/>
                    <input type="hidden" name="nummer" value="<%=nummer%>" id="nummer"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="commentaar">commentaar</label>
                </td>
                <td>
                    <textarea name="commentaar" id="commentaar"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="actie" id="submit" value="submit">submit</button>
                    <button type="submit" name="actie" id="terug" value="terug">terug</button>
                </td>
            </tr>
        </table>
    </form>
</center>
