<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/enterName" var="formAction"/>


<form method="GET" action="${formAction}">
    <label for="firstName">First Name: </label><br>
    <input type="text" id="firstName" firstName="firstName"/><br>


    <label for="middleInitial">Middle Initial: </label><br>
    <input type="text" id="middleInitial" middleInitial="middleInitial"/><br>


    <label for="lastName">Last Name: </label><br>
    <input type="text" id="lastName" lastName="lastName"/><br>


    <input type="radio" name="order" value="FML" checked> First MI Last<br>
    <input type="radio" name="order" value="FL"> First Last<br>
    <input type="radio" name="order" value="LFM"> Last, First MI<br>
    <input type="radio" name="order" value="LF"> Last, First<br>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>

