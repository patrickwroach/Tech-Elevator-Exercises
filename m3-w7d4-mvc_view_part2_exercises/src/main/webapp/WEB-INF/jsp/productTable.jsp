<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/site.css" />
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
        <tr>
            <td>Name</td>
        <c:forEach var="product" items="${productList}">
                <td><c:out value="${product.name}"/></td>
        </c:forEach>
            </tr>
        <tr>
            <td>Manufacturer</td>
        <c:forEach var="product" items="${productList}">
            <td><c:out value="${product.manufacturer}"/></td>
        </c:forEach>
            </tr>
        <tr>
            <td>Price</td>
        <c:forEach var="product" items="${productList}">
            <td><c:out value="${product.price}"/></td>
        </c:forEach>
            </tr>
        <tr>
            <td>Weight</td>
        <c:forEach var="product" items="${productList}">
            <td><c:out value="${product.weightInLbs}"/></td>
        </c:forEach>
            </tr>


    </section>
</body>
</html>

<%-- <c:forEach var="product" items="${productList}">
        <tr>
        <td><c:out value="${product.name}"/></td>
        </tr>

        <tr>
            <td><c:out value="${product.manufacturer}"/></td>
            </tr>
        <tr>

            <td><c:out value="${product.price}"/></td>

            </tr>
        <tr>

            <td><c:out value="${product.weightInLbs}"/></td>
            </tr>
        </c:forEach>--%>