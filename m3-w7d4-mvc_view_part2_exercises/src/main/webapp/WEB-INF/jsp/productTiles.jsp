<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width"/>
    <title>Product Tiles View</title>
    <link rel="stylesheet" href="css/site.css"/>
</head>
<body>
<header>
    <h1>MVC Exercises - Views Part 2: Models</h1>
</header>
<nav>
    <ul>
        <li><a href="#">Link 1</a></li>
        <li><a href="#">Link 2</a></li>
    </ul>

</nav>
<section id="main-content">
    <h1>Toy Department</h1>
    <div class="allTiles">
        <c:forEach var="product" items="${productList}">
            <div class="card">
                <div class="container">
                <img class ="imageHead" src="img/${product.imageName}" height="25%"/>
                <p><c:out value="${product.name}"/>
                    <c:choose>
                        <c:when test="${product.topSeller == true}">
                            <c:out value="BEST SELLER!"/>
                        </c:when>
                        <c:otherwise>
                        </c:otherwise>
                    </c:choose>
                </p>
                <p><c:out value="by ${product.manufacturer}"/></p>
                <p class=best-seller>
                    <c:choose>
                        <c:when test="${product.remainingStock < 5}">
                            <c:out value="Only ${product.remainingStock} left!"/>
                        </c:when>
                        <c:otherwise>
                        </c:otherwise>
                    </c:choose>
                </p>
                <c:set var="Amount" value="${product.price}"/>
                <p class=price><fmt:formatNumber value="${Amount}" type="currency"/></p>
                <c:set var="Weight" value="${product.weightInLbs}"/>
                <p><fmt:formatNumber value="${Weight}" maxFractionDigits="0"/></p>
                <p>
                    <c:set var="Rating" value="${product.averageRating}"/>
                    <fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>
                    <img class = "rating" src="img/${parsedRating}-star.png"/>
                </p>

            </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>