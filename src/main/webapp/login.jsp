<%--
  Created by IntelliJ IDEA.
  User: luciddreamz
  Date: 12/15/22
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! private String username = ""; %>
<%! private String password = ""; %>


<%
    if (request != null) {
        username = request.getParameter("username");
        password = request.getParameter("password");

        if (username != null && password != null) {

            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("profile.jsp");
            }else {
                response.sendRedirect("partials/invalid.jsp");
            }
        }
    }
%>



<html>
<head>
    <title>Title</title>
</head>
<body>


<div>
    <form action="profile.jsp" method = "post">

        <label for="username">Username:</label>
        <input type="text" id="username" name="username">

        <label for="pwd">Password:</label>
        <input type="password" id="pwd" name="pwd" minlength="8"><br><br>
        <input type="submit">

    </form>
</div>


</body>
</html>
