<%--
  User: tl
  Date: 2019-06-28
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
    <input type="hidden" value="${menu.pid}">
    父级：<input type="text" name="name" value="${empty menu.parent.name ? "无" : menu.parent.name}">
    当前菜单：<input type="text" value="${menu.name}">
    <input type="submit" value="提交">
</form>
</body>
</html>
