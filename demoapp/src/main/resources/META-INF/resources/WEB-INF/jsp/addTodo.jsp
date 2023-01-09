<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
     <form class="form" method="post"> 
        <!-- Id: <input type="number" name="id"><br>
        Username: <input type="text" name="username"><br> -->
        Description: <input type="text" name="description" required><br> 
        <!-- Target Date: <input type="date" name="targetdate"><br>
        Done ? : <input type="text" name="done"><br> -->
        <input type="submit" class="btn btn-success">
    </form>
    
    </div>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>