<%--
  Created by IntelliJ IDEA.
  User: New user
  Date: 2022-12-14
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.toni.slutprojekt1.model.weatherBean" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <meta charset="UTF-8">
    <title>The Weather</title>
</head>
<body>
<div class="main-index">
    <%
        weatherBean wBean = (weatherBean) request.getAttribute("wBean");
        out.println("<p>The humidity in " + wBean.getCityStr() + " is now " + wBean.getHumStr() + " %</p>");
        out.println("<p>The clouds in " + wBean.getCityStr() + " is now " + wBean.getCloudsStr() + "</p>");
        out.println("<p>The date in " + wBean.getCityStr() + " is now " + wBean.getDateStr() + "</p>");

    %>
    <form action="/index.jsp">
        <input type="submit" value="Gå tillbaka!"/>
    </form>
</div>

</body>
</html>
