<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Hello Spring MVC</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>
<h2>Colored Name</h2>
First Name:
<c:out value="${colorizedName.firstName}"/><br>
Last Name:
<c:out value="${colorizedName.lastName}"/><br>

<c:if test="${colorizedName.red == true}" >
    <br><div class=red> <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/></div>
</c:if>

<c:if test="${colorizedName.blue == true}" >
    <br><div class=blue> <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/></div>
</c:if>

<c:if test="${colorizedName.green == true}" >
    <br><div class=green> <c:out value="${colorizedName.firstName}"/> <c:out value="${colorizedName.lastName}"/></div>
</c:if>
</body>
</html>