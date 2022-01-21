<%-- 
    Document   : signUp
    Created on : Dec 30, 2020, 9:30:48 PM
    Author     : Ultrapc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Style/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sing Up</title>
    </head>
    <body>
         <div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <form class="box" method="GET" action="UserController">
                    <h1>Sign Up</h1>
                    <p class="text-muted"> Create New Account</p> <input type="text" name="prenom" placeholder="First & Last Name"> <input type="text" name="email" placeholder="Email"> <input type="password" name="password" placeholder="Password"> <input type="password" name="repassword" placeholder="Re-enter Password"> <input type="submit" name="" value="Sign Up" href="#">
                </form>
            </div>
        </div>
    </div>
</div>
    </body>
</html>
