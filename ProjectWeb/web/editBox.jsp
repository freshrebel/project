<%@page import="Model.Doos"%>
<%@page import="Service.DoosService"%>
<%@include file="headerAdmin.jsp" %>
<%    int id = Integer.parseInt((String) request.getSession().getAttribute("id"));
    Doos doos = DoosService.selectOne(id);
    int nummer = doos.getNummer();
    String commentaar = doos.getCommentaar();
%>
<center>
    <form action="editBox" method="POST">
        <table>
            <tr>
                <td>
                    <label for="nummer">nummer</label>
                </td>
                <td>
                    <input type="text" name="nr" id="nr" value="<%=nummer%>" disabled/>
                    <input type="hidden" name="nummer" value="<%=nummer%>" id="nummer"/>
                    <input type="hidden" name="id" id="id" value="<%=id%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="commentaar">commentaar</label>
                </td>
                <td>
                    <textarea name="commentaar" id="commentaar"><%=commentaar%></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" name="actie" id="submit" value="submit">submit</button>
                    <button type="submit" name="actie" id="delete" value="delete">delete</button>
                    <button type="submit" name="actie" id="terug" value="terug">terug</button>
                </td>
            </tr>
        </table>
    </form>
</center>
