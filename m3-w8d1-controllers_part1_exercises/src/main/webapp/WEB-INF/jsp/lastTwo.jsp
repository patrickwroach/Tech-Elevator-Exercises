<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:url value="/lastTwoResult" var="formAction"/>


<form method="GET" action="${formAction}">

    Reverse Last Two Characters<br>
    <br>

    <label for="word1"> Word 1: </label>
    <input type="text" id="word1" name="wordArray"/><br>


    <label for="word2">Word 2: </label>
    <input type="text" id="word2" name="wordArray"/><br>


    <label for="word3">Word 3: </label>
    <input type="text" id="word3" name="wordArray"/><br>


    <label for="word4">Word 4: </label>
    <input type="text" id="word4" name="wordArray"/><br>


    <label for="word5">Word 5: </label>
    <input type="text" id="word5" name="wordArray"/><br>


    <label for="word6">Word 6: </label>
    <input type="text" id="word6" name="wordArray"/><br>


    <label for="word7">Word 7: </label>
    <input type="text" id="word7" name="wordArray"/><br>


    <label for="word8">Word 8: </label>
    <input type="text" id="word8" name="wordArray"/><br>


    <label for="word9">Word 9: </label>
    <input type="text" id="word9" name="wordArray"/><br>

    <label for="word9">Word 10: </label>
    <input type="text" id="word10" name="wordArray"/><br>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>

