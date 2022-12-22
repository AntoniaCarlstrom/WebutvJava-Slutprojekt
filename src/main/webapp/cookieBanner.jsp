<%--
  Created by IntelliJ IDEA.
  User: New user
  Date: 2022-12-22
  Time: 08:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookieBanner</title>

</head>
<body>
<footer>
    <div>
        <p>
        <h2> Välkommen till Väderhemsidan!</h2>
        <h3> För att använda denna sida måste du acceptera cookies!</h3>

        </p>
        <button onclick="acceptCookiePolicy();" style="float: right;">Accept</button>

    </div>
</footer>

<script>
    function acceptCookiePolicy() {
        // Sets cookie "consentCookie"
        document.cookie = "consentCookie=accepted;max-age=31536000";
        // Reloads page to read consentCookie and close banner.
        window.location.reload();


    }

</script>
</body>
</html>
