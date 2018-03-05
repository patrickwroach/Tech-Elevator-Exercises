<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>


<div style="align-items: left">
<c:set var="productId" value="${param.productId}"/>


    <div style="display:inline-block; text-align: left"><h2 style="
                            margin-top: 50px;
                            margin-bottom: 0px;">
        ${product.name}</h2>
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

    <div>
        <c:out value="by ${product.manufacturer}"/>
    </div>
    <c:choose>
        <c:when test="${product.remainingStock < 5}">
            <div class=outofstock>
                <c:out value="Only ${product.remainingStock} left!"/>
            </div>
        </c:when>
        <c:otherwise>
        </c:otherwise>
    </c:choose>
    <div>
        <c:set var="Rating" value="${product.averageRating}"/>
        <fmt:formatNumber var="parsedRating" type="number" value="${Rating}" maxFractionDigits="0"/>

        <img src="img/${parsedRating}-star.png" width="125px"/>

    </div>
    <div class=price>
        <c:set var="Amount" value="${product.price}"/>
        Price: <fmt:formatNumber value="${Amount}" type="currency"/>
    </div>
    <div>
        <c:set var="Weight" value="${product.weightInLbs}"/>
        <b>Weight</b> <fmt:formatNumber value="${Weight}" maxFractionDigits="0"/> lbs.
    </div>
</div>
