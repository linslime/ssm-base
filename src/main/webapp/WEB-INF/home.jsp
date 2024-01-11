<%--
  Created by IntelliJ IDEA.
  User: linsl
  Date: 2022/12/6
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" width="600" height="100" align="center" cellpadding="0" cellspacing="3">
    <tr>
        <td>用户编号</td>
        <td>用户名</td>
        <td>用户密码</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td >${user.getId()}</td>
            <td >${user.getUsername()}</td>
            <td >${user.getPassword()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>