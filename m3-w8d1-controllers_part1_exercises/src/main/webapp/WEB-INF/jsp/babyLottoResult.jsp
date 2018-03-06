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

<%--<c:forEach var="numbers" items="${babyLotto.ticket1}">--%>
    <%--${numbers}--%>
<%--</c:forEach>--%>

<c:if test="${babyLotto.ticket1[3] == 20}" >
    <br><div class=green> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}, ${babyLotto.ticket1[3]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 10}" >
    <br><div class=silver> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}, ${babyLotto.ticket1[3]}</div>
</c:if>

<c:if test="${babyLotto.ticket1[3] == 0}" >
    <br><div> ${babyLotto.ticket1[0]},${babyLotto.ticket1[1]},${babyLotto.ticket1[2]}, ${babyLotto.ticket1[3]}</div>
</c:if>


<%--<c:forEach var="numbers" items="${babyLotto.ticket1}">--%>
    <%--<c:out value="${babyLotto.numbers}"/></p>--%>

<%--</c:forEach>--%>
<%--<p>Divisible By: <c:out value="${fizzBuzz.divisor2}"/></p>--%>
<%--<p>Divisible By Both: <c:out value="${fizzBuzz.divisor1}"/> <c:out value="${fizzBuzz.divisor2}"/></p>--%>

<%--<p>Alternative Fizz: <c:out value="${fizzBuzz.alternativeFizz}"/></p>--%>
<%--<p>Alternative Buzz: <c:out value="${fizzBuzz.alternativeBuzz}"/></p>--%>

<%--<p><c:out value="${fizzBuzz.number1}"/></p>--%>
<%--<p><c:out value="${fizzBuzz.number2}"/></p>--%>
<%--<p><c:out value="${fizzBuzz.number3}"/></p>--%>
<%--<p><c:out value="${fizzBuzz.number4}"/></p>--%>
<%--<p><c:out value="${fizzBuzz.number5}"/></p>--%>

</body>
</html>
