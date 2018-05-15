<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title> Add Cert </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <header class="col-md-12">
                        <h1>Add Cert</h1>
                        <p>Add a new certification</p>
                    </header>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-2">
                            <a class="btn btn-primary btn-block" href="/">Home</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <form:form method="POST" modelAttribute="newCert">
                <fieldset>
                    <legend>New Certification</legend>
                    <div class="form-group">
                        <label class="control-label" for="certName">Certification Name:</label>
                        <form:input id="certName" path="certName" type="text" class="form-control" autocomplete="off" pattern="^\w+[\w\s\-]*\w\$" required="true"></form:input>
                    </div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </fieldset>
            </form:form>
        </div>

        <!-- JavaScript -->
        <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
        <script src="node_modules/popper.js/dist/popper.min.js"></script>
        <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    </body>
</html>