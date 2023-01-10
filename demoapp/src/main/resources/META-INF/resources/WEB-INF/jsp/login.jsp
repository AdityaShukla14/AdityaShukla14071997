<html>
    <head>
        <title>Login !</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h1>Please enter the Credentials ${name}!</h1>
            <pre>${errorMesssage}</pre>
            <form  method="post">
            Userame: <input type="text" name="username" placeholder='Username' required></input><br>
            Password: <input type="password" name="password" placeholder='Password' required></input><br>
            <input type='submit' className='btn btn-primary'></input>
        </form>
    </div>
    </body>
</html>