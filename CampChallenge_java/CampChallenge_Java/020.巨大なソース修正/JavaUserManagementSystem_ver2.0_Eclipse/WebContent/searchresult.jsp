<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO"
        import="java.util.ArrayList"
        import="javax.servlet.http.HttpSession" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
	HttpSession hs = request.getSession();
	ArrayList<UserDataDTO> a = (ArrayList)hs.getAttribute("resultData");
    UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <% for(int i=0;i<a.size();i++){%>
            <tr>
	                <td><a href="ResultDetail?id=<%= a.get(i).getUserID()%>"><%= a.get(i).getName()%></a></td>
                	<td><%= a.get(i).getBirthday()%></td>
                	<td><%= a.get(i).getType()%></td>
                	<td><%= a.get(i).getNewDate()%></td>
            </tr>
            <%} %>
        </table>
    </body>
    <%=jh.home()%>
</html>
