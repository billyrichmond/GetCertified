<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title> Add Exam </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <header class="col-md-12">
                        <h1>Add Exam</h1>
                        <p>Add a new exam</p>
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
            <form:form method="POST" modelAttribute="newExam">
                <fieldset>
                    <legend>New Exam</legend>
                    <div class="form-group">
                        <label class="control-label" for="certList">Certification Name:</label>
                        <form:select class="form-control" id="certList" path="certList" multiple="false">
                            <form:option value="NONE" label="Select"/>
                            <form:options items="${newExam.certList}" itemLabel="certName" itemValue="certId"/>
                        </form:select>
                    </div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </fieldset>
            </form:form>
        </div>

        <!-- JavaScript -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>