<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/colorizedNameResult" var="formAction"/>


<form method="GET" action="${formAction}">
    <label for="firstName">First Name: </label><br>
    <input type="text" id="firstName" name="firstName"/><br>

    <label for="lastName">Last Name: </label><br>
    <input type="text" id="lastName" name="lastName"/><br>


    <h1>Choose Color </h1>
    <label class="container">
        <input type= "checkbox" name="red"  id="red" value="true" />Red<br>
    </label>

    <label class="container">
        <input type= "checkbox" name="blue"  id="blue" value="true" />Blue<br>
    </label>

    <label class="container">
        <input type= "checkbox" name="green"  id="green" value="true" />Green<br>
    </label>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
