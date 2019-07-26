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
<table border="1px">
    <tr>
        <td>菜单编号</td>
        <td>菜单名称</td>
        <td>父级菜单名称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="menu">
        <tr>
            <td>${menu.id}</td>
            <td>${menu.name}</td>
            <td>
                <c:if test="${not empty menu.parent}">
                    ${menu.parent.name}
                </c:if>
                <c:if test="${empty menu.parent}">
                    无
                </c:if>
            </td>
            <td><a href="update?id=${menu.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
