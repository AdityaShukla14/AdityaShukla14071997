<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Todos</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    
</head>
<body>
    <div class="container">
    <h1>Add Todo</h1><br>
     <form:form class="form" method="post" modelAttribute="todo"> 
        
        <form:input type="hidden" path="id" /><br>
        <!--<input type="text" name="username"/><br> -->
        Description: <form:input type="text" path="description" required="required"/><br> 
        <form:errors path="description" cssClass="text-warning"/><br>
        <!-- Target Date: <input type="date" name="targetdate"><br>-->
        <form:input type="hidden" path="done"/><br> 
        <input type="submit" class="btn btn-success"/>
    </form:form>
    
    </div>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>