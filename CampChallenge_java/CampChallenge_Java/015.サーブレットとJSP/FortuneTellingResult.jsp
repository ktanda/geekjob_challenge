<%@page import="org.camp.servlet.ResultData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	ResultData data = (ResultData)request.getAttribute("DATA");
%>
<meta htpp-equiv="contentType" content="text/html: charset=UTF-8">
<title>JSP Paga</title>
</head>
<body>
<%
	if(data != null){
		out.print("<h1>あなたの" + data.getD() + "の運勢は、" + data.getLuck() +"です。</h1>");
	}
%>
</body>
</html>
