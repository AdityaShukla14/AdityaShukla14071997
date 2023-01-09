<html>
    <head>
        <title>Login !</title>
    </head>
    <body>
        <div class="container">
            <h1>Please enter the Credentials ${name}!</h1>
            <pre>${errorMesssage}</pre>
            <form  method="post">
            Userame: <input type="text" name="username" placeholder='Userame' required></input><br>
            Password: <input type="password" name="password" placeholder='Password' required></input><br>
            <input type='submit' className='btn btn-primary'></input>
        </form>
    </div>
    </body>
</html>