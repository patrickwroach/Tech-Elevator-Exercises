<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/orderedName" var="formAction"/>


<form method="GET" action="${formAction}">
    <label for="firstName">First Name: </label><br>
    <input type="text" id="firstName" name="firstName"/><br>


    <label for="middleInitial">Middle Initial: </label><br>
    <input type="text" id="middleInitial" name="middleInitial"/><br>


    <label for="lastName">Last Name: </label><br>
    <input type="text" id="lastName" name="lastName"/><br>


    <input type="radio" name="nameOrder" value="1" checked> First MI Last<br>
    <input type="radio" name="nameOrder" value="2"> First Last<br>
    <input type="radio" name="nameOrder" value="3"> Last, First MI<br>
    <input type="radio" name="nameOrder" value="4"> Last, First<br>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>

