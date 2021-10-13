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
<form action="/add" method="post">
    <p>
        出行人员(*):<input type="text" name="user_name">
    </p>
    <p>
        职位(*):<input type="text" name="duty">
    </p>
    <p>
        出行方式(*)<select name="trip_mode_id">
            <option value="-1">请选择</option>
            <c:forEach var="p" items="${lists}">
                <option value="${p.id}">${p.namme}</option>
            </c:forEach>
        </select>
    </p>
    <p>
        出行日期(*):<input type="text" name="depart_time">
    </p>
    <p>
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>
