
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:import url="/WEB-INF/jsp/header.jsp" />


<body>
<div style="border-style: solid;padding: 10px;width: 500px;">
    
<b>Favorite Color:</b> ${favoriteThings.favoriteColor}<br>
<b>Favorite Food:</b> ${favoriteThings.favoriteFood}<br>
<b>Favorite Season:</b> ${favoriteThings.favoriteSeason}<br>
</div>
</body>
</html>
