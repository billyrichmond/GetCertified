<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title> Certifications </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <header class="col-md-12">
                        <h1>Certifications</h1>
                        <p>Certification list</p>
                    </header>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-2">
                            <a class="btn btn-primary btn-block" href="/">Home</a>
                        </div>
                        <div class="col-md-2">
                            <a class="btn btn-primary btn-block" href="/addcert" role="button">Add</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="list-group">
                        <c:forEach items="${certs}" var="cert">
                            <button type="button" href="#" class="list-group-item list-group-item-action">${cert.certName}</button>
                        </c:forEach>
                    </div>
                </div>
            </div>

        <!--
            <c:forEach items="${certs}" var="cert">
                <div class="row">
                    <div class="col-md-12">

                            <div class="caption">
                                <p>${cert.certName}</p>
                            </div>

                    </div>
                </div>
            </c:forEach>



        -->
        </div>

        <!-- JavaScript -->
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
        <script src="node_modules/popper.js/dist/popper.min.js"></script>
        <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>