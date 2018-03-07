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





<c:if test="${babyLotto.ticket2[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket2[0]},${babyLotto.ticket2[1]},${babyLotto.ticket2[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket2[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket2[0]},${babyLotto.ticket2[1]},${babyLotto.ticket2[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket2[3] == 0}" >
    <br><div> ${babyLotto.ticket2[0]},${babyLotto.ticket2[1]},${babyLotto.ticket2[2]}</div>
</c:if>




<c:if test="${babyLotto.ticket3[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket3[0]},${babyLotto.ticket3[1]},${babyLotto.ticket3[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket3[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket3[0]},${babyLotto.ticket3[1]},${babyLotto.ticket3[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket3[3] == 0}" >
    <br><div> ${babyLotto.ticket3[0]},${babyLotto.ticket3[1]},${babyLotto.ticket3[2]}</div>
</c:if>



<c:if test="${babyLotto.ticket4[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket4[0]},${babyLotto.ticket4[1]},${babyLotto.ticket4[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket4[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket4[0]},${babyLotto.ticket4[1]},${babyLotto.ticket4[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket4[3] == 0}" >
    <br><div> ${babyLotto.ticket4[0]},${babyLotto.ticket4[1]},${babyLotto.ticket4[2]}</div>
</c:if>





<c:if test="${babyLotto.ticket5[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket5[0]},${babyLotto.ticket5[1]},${babyLotto.ticket5[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket5[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket5[0]},${babyLotto.ticket5[1]},${babyLotto.ticket5[2]}</div>
</c:if>

<c:if test="${babyLotto.ticket5[3] == 0}" >
    <br><div> ${babyLotto.ticket5[0]},${babyLotto.ticket5[1]},${babyLotto.ticket5[2]}</div>
</c:if>






</body>
</html>
