<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name = "技育 助部";
    int age = 24;
    String dream = "めっちゃバズるSNSを作る";
    
    out.print("私の名前は" + name + "です");
    out.print("<br>");
    out.print("年齢は" + age + "です");
    out.print("<br>");
    out.print("10年後の目標は「" + dream + "」で、その頃には" + (age + 10) + "歳になっています");
%>

