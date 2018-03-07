<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Hello Spring MVC</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>
<h2>Colored Name</h2>


<c:if test="${squirrelParty.success == true}" >
    <br>webapp\img\happy-squirrel.png</div>
</c:if>

    <c:out value="${squirrelParty.success}"/></div>

</body>
</html>