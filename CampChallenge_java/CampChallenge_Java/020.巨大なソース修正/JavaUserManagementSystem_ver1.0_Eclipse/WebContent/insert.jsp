<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>
<%
  HttpSession hs = request.getSession();
UserDataBeans udb = null;
boolean re = false;
if(request.getParameter("confirm") != null && request.getParameter("confirm").equals("return")){
	re = true;
  	udb = (UserDataBeans)hs.getAttribute("udb");
}
//  String name = request.getParameter("name");
//  int year = Integer.parseInt(request.getParameter("year"));
//  int month = Integer.parseInt(request.getParameter("month"));
//  int day = Integer.parseInt(request.getParameter("day"));
//  int type = Integer.parseInt(request.getParameter("type"));
//  String tell = request.getParameter("tell");
//  String comment = request.getParameter("comment");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <input type="text" name="name" value="<%if(re){out.print(udb.getname());} %>">
        <br><br>

        生年月日:
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>" <% if(re && Integer.parseInt(udb.getyear()) == i){out.print("selected = \"selected\"");}%>> <%=i%> </option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>" <% if(re && Integer.parseInt(udb.getmonth()) == i){out.print("selected = \"selected\"");}%>><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>" <% if(re && Integer.parseInt(udb.getday()) == i){out.print("selected = \"selected\"");}%>><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1" <%if(re && Integer.parseInt(udb.gettype()) == 1){out.print("checked");} %>>エンジニア<br>
        <input type="radio" name="type" value="2" <%if(re && Integer.parseInt(udb.gettype()) == 2){out.print("checked");} %>>営業<br>
        <input type="radio" name="type" value="3" <%if(re && Integer.parseInt(udb.gettype()) == 3){out.print("checked");} %>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%if(re){out.print(udb.gettell());}%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard" ><%if(re){out.print(udb.getcomment());}%></textarea><br><br>

        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
