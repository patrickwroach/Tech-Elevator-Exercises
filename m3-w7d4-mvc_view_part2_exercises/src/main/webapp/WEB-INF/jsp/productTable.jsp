<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<%--<html>--%>
<%--<head>--%>
    <%--<meta name="viewport" content="width=device-width"/>--%>
    <%--<title>Product Table View</title>--%>
    <%--<link rel="stylesheet" href="css/site.css"/>--%>
<%--</head>--%>
<%--<body>--%>
<%--<header>--%>
    <%--<h1>MVC Exercises - Views Part 2: Models</h1>--%>
<%--</header>--%>
<%--<nav>--%>
    <%--<ul>--%>
        <%--<li><a href="#">Link 1</a></li>--%>
        <%--<li><a href="#">Link 2</a></li>--%>
    <%--</ul>--%>

<%--</nav>--%>

<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

<c:url value="/productDetail"
       var="productDetailLink">
    <c:param name="productId" value="${product.productId}"> </c:param>
</c:url>

<section id="main-content">
    <h1>Toy Department</h1>
    <table>
        <tr>
            <td></td>
            <c:forEach var="product" items="${productList}">
                <td><a href="${productDetailLink}${product.productId}"><img src="img/${product.imageName}" height="25%"/></a></td>
            </c:forEach>
        </tr>
        <tr>
            <td></td>
            <c:forEach var="product" items="${productList}">
                <c:choose>
                    <c:when test="${product.topSeller == true}">
                        <td class=best-seller><c:out value="BEST SELLER!"/></td>
                    </c:when>
                    <c:otherwise>
                        <td></td>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </tr>
        <tr>
            <td class="category">Name</td>
            <c:forEach var="product" items="${productList}">
                <td class="gray"><a href="${productDetailLink}${product.productId}"><c:out value="${product.name}"/></a></td>
            </c:forEach>
        </tr>
        <tr>
            <td class="category">Rating</td>

            <c:forEach var="product" items="${productList}">
                <c:set var="Rating" value="${product.averageRating}"/>
                <fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>

                <td><img src="img/${parsedRating}-star.png" height="15%"/></td>
            </c:forEach>

        </tr>
        <tr>
            <td class="category">Mfr</td>
            <c:forEach var="product" items="${productList}">
                <td class="gray"><c:out value="${product.manufacturer}"/></td>
            </c:forEach>
        </tr>
        <tr>
            <td class="category">Price</td>

            <c:forEach var="product" items="${productList}">

                <c:set var="Amount" value="${product.price}"/>
                <td class=price><fmt:formatNumber value="${Amount}" type="currency"/></td>

            </c:forEach>
        </tr>
        <tr>
            <td class="category">Wt. (in lbs)</td>
            <c:forEach var="product" items="${productList}">
                <c:set var="Weight" value="${product.weightInLbs}"/>
                <td class="gray"><fmt:formatNumber value="${Weight}" maxFractionDigits="0"/></td>
            </c:forEach>
        </tr>

    </table>
</section>
<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>
<%--</body>--%>
<%--</html>--%>
