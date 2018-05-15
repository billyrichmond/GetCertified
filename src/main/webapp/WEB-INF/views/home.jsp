<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Home | Get Certified</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1>${title}</h1>
                <p>${subtitle}</p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>Certifications</h3>
                            <p>
                                Number of certifications : ${certs}
                            </p>
                            <a class="btn btn-primary"
                               href="/certs"
                               role="button">Go
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>Exams</h3>
                            <p>
                                Number of exams : ${exams}
                            </p>
                            <a class="btn btn-primary"
                               href="/exams"
                               role="button">Go
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>Practice Tests</h3>
                            <p>
                                Number of practice tests :
                            </p>
                            <a class="btn btn-primary"
                               href="#"
                               role="button">Go
                            </a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>Glossary</h3>
                            <p>
                                Number of terms :
                            </p>
                            <a class="btn btn-primary"
                               href="#"
                               role="button">Go
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- JavaScript -->
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
        <script src="node_modules/popper.js/dist/popper.min.js"></script>
        <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>
