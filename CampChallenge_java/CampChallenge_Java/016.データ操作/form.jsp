<%
request.setCharacterEncoding("UTF-8");
out.print(request.getParameter("Name"));
out.print(request.getParameter("sex"));
out.print(request.getParameter("hobit"));
%>