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
    <c:forEach var="product" items="${productList}">

        <div class="card">
            <img src="img/${product.imageName}" style="max-height: 140px"/>
            <div class="container">
                <div>
                    <div style="display:inline-block; text-align: left"><h4 style="
                            margin-top: 0px;
                            margin-bottom: 0px;">
                            ${product.name}</h4>
                    </div>
                    <div class=best-seller style="display:inline-block; text-align: right">
                        <c:choose>
                            <c:when test="${product.topSeller == true}">
                                <c:out value="BEST SELLER!"/>
                            </c:when>
                            <c:otherwise>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
                <div>
                    <c:out value="by ${product.manufacturer}"/>
                </div>
                <div class=outofstock>
                    <c:choose>
                        <c:when test="${product.remainingStock < 5}">
                            <c:out value="Only ${product.remainingStock} left!"/>
                        </c:when>
                        <c:otherwise>
                            <c:out value=""/>
                        </c:otherwise>
                    </c:choose>
                </div>
                <div class=price>
                    <c:set var="Amount" value="${product.price}"/>
                    <fmt:formatNumber value="${Amount}" type="currency"/>
                </div>
                <div>
                    <c:set var="Weight" value="${product.weightInLbs}"/>
                    Weight <fmt:formatNumber value="${Weight}" maxFractionDigits="0"/> lbs.
                </div>
                <div>
                    <c:set var="Rating" value="${product.averageRating}"/>
                    <fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>

                    <img src="img/${parsedRating}-star.png" width="80%"/>

                </div>

            </div>
        </div>
    </c:forEach>
</section>
</body>
</html>