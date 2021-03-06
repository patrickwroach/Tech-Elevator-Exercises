<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>


<c:import url="/WEB-INF/jsp/header.jsp"></c:import>

<section id="main-content">
    <h1>Toy Department</h1>



    <c:url value="/productDetail"
           var="productDetailLink">
           <c:param name="productId" value="${product.productId}"> </c:param>
    </c:url>



    <c:forEach var="product" items="${productList}">

        <div class="card">
            <a href="${productDetailLink}${product.productId}"><img src="img/${product.imageName}" style="max-height: 150px"/></a>
            <div class="container">
                <div>
                    <div style="display:inline-block; text-align: left"><a href="${productDetailLink}${product.productId}"><h4 style="
                            margin-top: 0px;
                            margin-bottom: 0px;">
                            ${product.name}</h4></a>
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
                <c:choose>
                    <c:when test="${product.remainingStock < 5}">
                        <div class=outofstock>
                            <c:out value="Only ${product.remainingStock} left!"/>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="instock">
                            <c:out value="Only ${product.remainingStock} left!"/>
                        </div>
                    </c:otherwise>
                </c:choose>
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

                    <img src="img/${parsedRating}-star.png" width="50%"/>

                </div>

            </div>
        </div>
    </c:forEach>
</section>
<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>
