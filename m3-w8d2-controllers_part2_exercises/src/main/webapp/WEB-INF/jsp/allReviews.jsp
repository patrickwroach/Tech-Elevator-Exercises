<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Squirrel Cigar Party</title>
    <link rel="stylesheet" href="css/site.css"/>


</head>

<body>
<c:url var = "imglink" value="/img/forDummies.png"></c:url>

<h1>Ain't no party like a squirrel party</h1>
<h3>Cause a squirrel party is nuts!</h3>
<img src ="${imglink}">
<p>Wanna throw a squirrel party? Of course you do!  Everyone wants more <strong>squirrels</strong> in their life!
    Your desire for more squirrels is about to be <strong>fulfilled</strong>!  Just do the following:</p>
<ol>
    <li>Grab a copy of this book (or go digital!)</li>
    <li>Get a handful of <strong>cigars</strong></li>

</ol>


<br>
<br>

<section class="centeredPanel">
    <h2><strong>Reviews for Squirrel Cigar Party For Dummies</strong></h2>
    <c:url var="newReviewUrl" value="/newReview"/>
    <span class="centered"> <a href="${newReviewUrl }">Leave a Review</a></span>
    <ul>
        <c:forEach items="${allReviews }" var="review">


            <li><c:out value="${review.title}"/> (<c:out value="${review.username}"/>)</li>
            <li><c:out value="${review.dateSubmitted}"/></li>


            <c:forEach begin="1" end="${review.rating}" step="1">
                <img src="img/star.png"/>
            </c:forEach>

            <li><c:out value="${review.text}"/></li>
            <br>
            <hr>
        </c:forEach>
    </ul>

</section>
</body>
</html>