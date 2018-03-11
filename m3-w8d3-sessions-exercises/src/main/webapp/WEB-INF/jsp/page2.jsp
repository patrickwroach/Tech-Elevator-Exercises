<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:import url="/WEB-INF/jsp/header.jsp"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<c:url var="newReviewUrl" value="/page2"/>

<form method="POST" action="${newReviewUrl}">

    <div>
        <label for="favoriteFood">What is your favorite food?</label>
        <input type="text" id="favoriteFood" name="favoriteFood" placeholder="enter favorite food"/>


    </div>
    <br>

    <div>
        <input style="color: white; background-color: blue;" type="submit" value="Next"/>
    </div>

</form>
</body>
</html>