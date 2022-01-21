
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Style/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <form class="box" method="GET" action="UserController">
                    <h1>Login</h1>
                    <p class="text-muted"> Please enter your login and password!</p> <input type="text" name="email" placeholder="Username"> <input type="password" name="password" placeholder="Password">  <a class="forgot text-muted" href="http://localhost:8080/testt/signUp.jsp">Create Account</a>  <input type="submit" name="" value="Login" href="#">
                </form>
            </div>
        </div>
    </div>
</div>
    </body>
</html>
