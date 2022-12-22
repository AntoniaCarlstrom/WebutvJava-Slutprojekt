<%@ page import="com.toni.slutprojekt1.controller.OWservlet" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/style.css">

    <title>OpenWeather</title>
</head>
<body>
<nav class="flexnav">
    <div class="flex-left">
        <h2>Väderhemsida</h2>
    </div>
    <div class="flex-right">

    </div>
</nav>
<div class="main-index">
    <form action="<%=request.getContextPath()%>/OWServlet" method="get">
        <table>
            <tr>
                <td>Stad:</td>
                <td><input type="text" name="city"/><br/></td>

            </tr>
            <tr>
                <td>Land:</td>
                <td><input type="text" name="country"/><br/></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Visa väder"/>
                </td>
            </tr>


        </table>
    </form>


    <b>Din senaste sökning var:</b>
    <br><br>
    ${cookie["searchCookie"].getValue()}


</div>


<footer>
    <div class="footer-left"></div>
    <div class="footer-right">
        <jsp:include page="/consentServlet"/>
    </div>
</footer>

</body>

</html>