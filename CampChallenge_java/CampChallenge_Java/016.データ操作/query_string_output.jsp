<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int total = Integer.parseInt(request.getParameter("total"));
int count = Integer.parseInt(request.getParameter("num"));

out.print("購入総額：" + total);
out.print("<br>");
out.print("購入数量：" + count);
out.print("<br>");
out.print("商品単価：" + total / count);
out.print("<br>");

if(request.getParameter("type").equals("1")){
	out.print("商品種別：雑貨");
	out.print("<br>");
}else if(request.getParameter("type").equals("2")){
	out.print("商品種別：生鮮食費");
	out.print("<br>");
}else{
	out.print("商品種別：その他");
	out.print("<br>");
}

out.print("付与ポイント：");
if(total < 3000){
	out.print("ポイント無し");
	out.print("<br>");
}else if(3000 <= total && total < 5000){
	out.print(total * 0.04 + "ポイント");
	out.print("<br>");
}else{
	out.print(total * 0.05 + "ポイント");
	out.print("<br>");
}
%>
</body>
</html>