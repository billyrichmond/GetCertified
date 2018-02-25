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
                       <p>List of certification exams</p>
                   </header>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <c:forEach items="${exams}" var="exam">
                    <div class="col-md-12">
                        <div class="thumbnail">
                            <spring:url value="/exam?id=${exam.examId}" var="exam_id"/>
                            <a class="btn btn-success btn-primary btn-block"
                               href="${exam_id}"
                               role="button">${exam.name}
                            </a>
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