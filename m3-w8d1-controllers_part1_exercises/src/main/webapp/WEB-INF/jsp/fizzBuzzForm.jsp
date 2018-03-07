<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="/fizzBuzzRevisitedResult" var="formAction"/>


<form method="GET" action="${formAction}">
    <label for="divisor1">Divisible By: </label><br>
    <input type="text" id="divisor1" name="divisor1"/><br>


    <label for="divisor2">Divisible By: </label><br>
    <input type="text" id="divisor2" name="divisor2"/><br>


    <label for="alternativeFizz">Alternative Fizz </label><br>
    <input type="text" id="alternativeFizz" name="alternativeFizz"/><br>

    <label for="alternativeBuzz">Alternative Buzz </label><br>
    <input type="text" id="alternativeBuzz" name="alternativeBuzz"/><br>

    <label for="number1">Number 1 </label><br>
    <input type="text" id="number1" name="number1"/><br>

    <label for="number1">Number 2 </label><br>
    <input type="text" id="number2" name="number2"/><br>

    <label for="number1">Number 3 </label><br>
    <input type="text" id="number3" name="number3"/><br>

    <label for="number1">Number 4 </label><br>
    <input type="text" id="number4" name="number4"/><br>

    <label for="number1">Number 5 </label><br>
    <input type="text" id="number5" name="number5"/><br>


    <input type="submit" value="Submit"/>
</form>
</body>
</html>

