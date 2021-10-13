<%--
  Created by IntelliJ IDEA.
  User: MaLiWei
  Date: 2021/9/30
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/show" method="post">
    <select name="trip_mode_id">
        <option value="-1">请选择</option>
        <c:forEach var="p" items="${lists}">
            <option value="${p.id}" <c:if test="${p.id==param.trip_mode_id}">selected</c:if>>${p.namme}</option>
        </c:forEach>
    </select>
    <input type="submit" value="查询">
</form>
<a href="/toadd">添加</a>
<table border="2" width="600px">
    <tr>
        <td>出差人员</td>
        <td>职位</td>
        <td>出现方式</td>
        <td>出现日期</td>
        <td>行程状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="p">
        <tr>
            <td>${p.user_name}</td>
            <td>${p.duty}</td>
            <td>${p.namme}</td>
            <td>${p.depart_time}</td>
            <td>${p.stauts==1?"已取消":"未出行"}</td>
            <td>
                <a href="/update/${p.id}"><c:if test="${p.stauts==0}"></c:if>取消行程</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
