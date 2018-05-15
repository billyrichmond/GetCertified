<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title> TBD </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                   <header class="col-md-12">
                       <h1>Exams</h1>
                       <p>Certification exams</p>
                   </header>
                </div>
                <div class="container">
                    <div class="row">
                        <a class="btn btn-primary" href="/">Home</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <c:forEach items="${exams}" var="exam">
                    <div class="col-md-6 col-md-3">
                        <div class="thumbnail">
                            <div class="caption">
                                <h4>${exam.examName}</h4>
                                <p>${exam.examNumber}</p>
                                <p>
                                    <spring:url value="/exam?id=${exam.examId}" var="exam_id"/>
                                    <a class="btn btn-default btn-primary"
                                       href="${exam_id}"
                                       role="button">Go
                                    </a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <!-- JavaScript -->
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
        <script src="node_modules/popper.js/dist/popper.min.js"></script>
        <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>