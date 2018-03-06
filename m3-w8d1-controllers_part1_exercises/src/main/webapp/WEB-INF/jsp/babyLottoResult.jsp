<%--
  Created by IntelliJ IDEA.
  User: bdewitt
  Date: 3/6/18
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/site.css"/>

<html>
<head>
    <title>Title</title>
</head>
<body>



<c:if test="${babyLotto.ticket1[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 0}" >
    <br><div> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>



<c:if test="${babyLotto.ticket1[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 0}" >
    <br><div> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}</div>
</c:if>




</body>
</html>
