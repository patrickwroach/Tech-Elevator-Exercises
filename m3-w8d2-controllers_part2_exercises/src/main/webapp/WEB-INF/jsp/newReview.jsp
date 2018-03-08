<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Squirrel Cigar Party</title>

</head>

<body>

<header>
    <link rel="stylesheet" href="css/site.css"/>
    <h1 class="centered">Squirrel Cigar Party For Dummies</h1>
    <img src="img/forDummies.png" class="centered"/><br>
</header>

<section class="centered">


    <c:url var="newReviewUrl" value="/newReview"/>
    <form:form method="POST" action="${newReviewUrl }" modelAttribute="review">


        <h2><strong>Leave Us A Review</strong></h2>

        <div>
            <form:label path="username">Username</form:label>
            <form:input path="username" placeholder="enter username"/>
        </div><br>

        <div>
            <form:label path="rating">Rating</form:label>
            <form:input path="rating" placeholder="rating" type="number" />
        </div><br>

        <div>
            <form:label path="title">Review Title</form:label>
            <form:input path="title" placeholder="review title"/>
        </div><br>

        <div>
            <form:label path="text">Review</form:label>
            <form:textarea path="text" placeholder="review text" row="5" />

        </div><br>

        <div>
            <input style="color: white; background-color: blue;" type="submit" value="Submit"/>
        </div>

    </form:form>
</section><br><br><br><br>
</body>
</html>