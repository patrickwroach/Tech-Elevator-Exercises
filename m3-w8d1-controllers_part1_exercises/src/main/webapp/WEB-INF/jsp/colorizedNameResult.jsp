<%--
  Created by IntelliJ IDEA.
  User: bdewitt
  Date: 3/5/18
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>


</head>
<body>
<p>First Name: <c:out value="${enterName.firstName}"/></p>
<p>Middle Initial: <c:out value="${enterName.middleInitial}"/></p>
<p>Last Name: <c:out value="${enterName.lastName}"/></p>
<p>Ordered: <c:out value="${enterName.nameOrder}"/></p>
</body>
</html>