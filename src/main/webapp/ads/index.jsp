<%--
  Created by IntelliJ IDEA.
  User: luciddreamz
  Date: 1/3/23
  Time: 09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>ADS</h1>
<c:forEach var="ad" items="${ads}">
    <div class="item">
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
