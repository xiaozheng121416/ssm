<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>展示账户数据列表</h1>
    <table border="1">
        <tr>
            <th>账户id</th>
            <th>账户名称</th>
            <th>账户金额</th>
        </tr>

        <c:forEach items="${moneList}" var="mone">
            <tr>
                <td>${mone.id}</td>
                <td>${mone.username}</td>
                <td>${mone.money}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
