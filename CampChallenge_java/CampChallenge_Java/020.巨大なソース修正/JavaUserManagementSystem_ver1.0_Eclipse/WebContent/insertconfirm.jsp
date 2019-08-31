<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.UserDataBeans" %>

<%
    HttpSession hs = request.getSession();
	UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <% boolean insert = true;%>
    <% if(udb.getname().equals("")){ %>
    	<h1>名前が入力されていません</h1>
    	<% insert = false; %>
    <% } %>

    <% if(udb.getyear().equals("") || udb.getmonth().equals("") || udb.getday().equals("")){ %>
    	<h1>生年月日が入力されていません</h1>
    	<% insert = false; %>
    <% } %>

    <% if(udb.gettell().equals("")){ %>
    	<h1>電話番号が入力されていません</h1>
    	<% insert = false; %>
    <% } %>

    <% if(udb.getcomment().equals("")){ %>
    	<h1>自己紹介が入力されていません</h1>
    	<% insert = false; %>
    <% } %>

	<% if(insert){ %>
        <h1>登録確認</h1>
        名前:<%= udb.getname()%><br>
        生年月日:<%= udb.getyear()+"年"+udb.getmonth()+"月"+udb.getday()+"日"%><br>
        種別:<%= udb.gettype()%><br>
        電話番号:<%= udb.gettell()%><br>
        自己紹介:<%= udb.getcomment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
    <% } %>


        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
            <input type="hidden" name="confirm" value="return">
        </form>
    </body>
</html>
