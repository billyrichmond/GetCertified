<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Exam | Get Certified</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <header class="col-md-12">
                        <h1>Exam</h1>
                        <p>${exam.examName} - ${exam.examNumber}</p>
                        <a class="btn btn-default btn-primary"
                           href="/"
                           role="button">Home
                        </a>
                    </header>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <c:choose>
                    <c:when test="${examQuestionsIsEmpty}">
                        <div class="col-md-12">
                            <div class="thumbnail">
                                <h4 class="text-center">There are no questions entered for this exam</h4>
                            </div>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <p>Records!</p>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>

        <!-- JavaScript -->
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
        <script src="node_modules/popper.js/dist/popper.min.js"></script>
        <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>