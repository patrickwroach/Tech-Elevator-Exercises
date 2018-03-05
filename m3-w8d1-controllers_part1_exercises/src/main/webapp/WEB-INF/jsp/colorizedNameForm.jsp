<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/colorizedName" var="formAction"/>


<form method="GET" action="${formAction}">
    <label for="firstName">First Name: </label><br>
    <input type="text" id="firstName" name="firstName"/><br>

    <label for="lastName">Last Name: </label><br>
    <input type="text" id="lastName" name="lastName"/><br>


    <h1>Choose Color </h1>
    <label class="container">Red
        <input type="checkbox" checked="checked">
        <span class="checkmark"></span>
    </label>
    <label class="container">Blue
        <input type="checkbox">
        <span class="checkmark"></span>
    </label>
    <label class="container">Green
        <input type="checkbox">
        <span class="checkmark"></span>
    </label>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
