<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20.03.2023
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp" %>
<div>
    <span>Content. Русский</span>
    <p>Size: ${requestScope.flights.size()}</p>
    <p>Id: ${requestScope.flights.get(0).id}</p>
    <p>Id 2: ${requestScope.flights[1].id}</p>
    <p>Map Id 2: ${requestScope.flightsMap[1]}</p>
    <p>JSESSION id^ ${cookie["JSESSIONID"]}, unique identifier</p>
    <p>Header: ${header["Cookie"]}</p>
    <p>Param id: ${param.id}</p>
    <p>Param test: ${param.test}</p>
    <p>Empty list: ${not empty requestScope.flights}</p>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
