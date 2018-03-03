<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>



<c:set var="productId" value="${param.productId}"/>
<section id="productDescription">

    Description: ${product.description}


</section>