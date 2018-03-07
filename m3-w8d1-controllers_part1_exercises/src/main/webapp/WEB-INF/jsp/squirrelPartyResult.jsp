<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Hello Spring MVC</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>


<c:if test="${squirrelParty.success == true}" >
    <h1> Great Party!</h1>
    <br><img src="img/happy-squirrel.png"></div>
</c:if>

<c:if test="${squirrelParty.success == false}" >
    <h1> Ugh </h1>
    <br><img src="img/sad-squirrel.png"></div>
</c:if>


</body>
</html>