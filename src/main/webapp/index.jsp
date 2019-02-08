<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my Adlister!" />
    </jsp:include>
    <link rel="stylesheet" href="css/AdLister.css">
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div>
        <h2>Welcome to my Adlister!</h2>
    </div>
</body>
</html>
