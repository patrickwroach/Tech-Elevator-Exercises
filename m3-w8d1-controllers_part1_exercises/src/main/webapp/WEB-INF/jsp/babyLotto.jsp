<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/babyLottoResult" var="formAction"/>


<form method="GET" action="${formAction}">

    Baby Lotto<br>

    <label for="ticket1">Ticket 1: </label><br>
    <input type="text" id="ticket1" name="ticket1"/><br>

    <label for="ticket1">Ticket 2: </label><br>
    <input type="text" id="ticket2" name="ticket2"/><br>

    <label for="ticket1">Ticket 3: </label><br>
    <input type="text" id="ticket3" name="ticket3"/><br>

    <label for="ticket1">Ticket 4: </label><br>
    <input type="text" id="ticket4" name="ticket4"/><br>

    <label for="ticket1">Ticket 5: </label><br>
    <input type="text" id="ticket5" name="ticket5"/><br>


    <input type="submit" value="Submit"/>
</form>
</body>
</html>

