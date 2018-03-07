<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/squirrelPartyResult" var="formAction"/>


<form method="GET" action="${formAction}">

    <img src="img/smoking-squirrel.png"></div>
    <br>
    <label for="squirrelNumber">Number of Squirrels: </label><br>
    <input type="text" id="squirrelNumber" name="squirrelNumber"/><br>



    <label class="container">
        <input type= "checkbox" name="weekend"  id="weekend" value="true" />Is It A Weekend<br>
    </label>


    <input type="submit" value="Submit"/>
</form>
</body>
</html>
