<%--
  Created by IntelliJ IDEA.
  User: bdewitt
  Date: 3/6/18
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Divisible By: <c:out value="${fizzBuzz.divisor1}"/></p>
<p>Divisible By: <c:out value="${fizzBuzz.divisor2}"/></p>
<p>Divisible By Both: <c:out value="${fizzBuzz.divisor1}"/> <c:out value="${fizzBuzz.divisor2}"/></p>

<p>Alternative Fizz: <c:out value="${fizzBuzz.alternativeFizz}"/></p>
<p>Alternative Buzz: <c:out value="${fizzBuzz.alternativeBuzz}"/></p>

<p><c:out value="${fizzBuzz.number1}"/></p>
<p><c:out value="${fizzBuzz.number2}"/></p>
<p><c:out value="${fizzBuzz.number3}"/></p>
<p><c:out value="${fizzBuzz.number4}"/></p>
<p><c:out value="${fizzBuzz.number5}"/></p>

</body>
</html>
