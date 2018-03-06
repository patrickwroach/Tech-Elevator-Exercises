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
<p>Reverse Last Two Characters</p>


<c:forEach begin="0" end="9" var="numbers">
<li>${lastTwo.words.get(numbers)} : ${lastTwo.reversedWords.get(numbers)}</li>
</c:forEach>
</body>
</html>
