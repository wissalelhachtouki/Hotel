<%-- 
    Document   : authentification
    Created on : Dec 30, 2020, 8:37:56 PM
    Author     : Ultrapc
--%>

<%@page import="service.UserService"%>
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
        <%
            if (request.getParameter("op") != null) {
                if (request.getParameter("op").equals("delete")) {
                    session.invalidate();
                }
            }
            UserService userService = new UserService();
            Boolean empty = false;
            Boolean Correct = true;
            String givenEmail = "First Value";
            String givenPassword = "First Value";
            if (request.getParameter("email") != null) {
                givenEmail = request.getParameter("email");
            }
            if (request.getParameter("password") != null) {
                givenPassword = request.getParameter("password");
            }
            if (givenEmail.isEmpty() || givenEmail == null || givenPassword.isEmpty() || givenPassword == null) {
                empty = true;
            } else if (userService.SignIn(givenEmail, givenPassword)) {
                session.setAttribute("email", givenEmail);
                response.sendRedirect("http://localhost:8080/CrudProfessors_Specialite/dashboard.jsp");
            } else if (!userService.SignIn(givenEmail, givenPassword) && !givenEmail.equals("First Value") && !givenPassword.equals("First Value")) {
                Correct = false;
            }
            %>
        <div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <form class="box" method="GET" action="authentification.jsp">
                    <h1>Login</h1>
                    <p class="text-muted"> Please enter your Email and password!</p> <input type="text" name="email" placeholder="Email"> <input type="password" name="password" placeholder="Password"> <label style="color: red;display: <%= (empty) ? "block" : "none"%>">Login and password should not be empty</label> <label style="color: red;display: <%= (Correct) ? "none" : "block"%>">Login Or password is not correct</label>  <a class="forgot text-muted" href="http://localhost:8080/CrudProfessors_Specialite/signUp.jsp">Create Account</a>  <input type="submit" name="" value="Login" href="#">
                </form>
            </div>
        </div>
    </div>
</div>
    </body>
</html>
