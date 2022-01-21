<%-- 
    Document   : client
    Created on : Dec 30, 2020, 10:40:31 PM
    Author     : Ultrapc
--%>
<%@page import="service.ProfesseurService"%>
<%@page import="bean.Professeur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Professeur</title>
    </head>
    <body>
        <% 
            ProfesseurService professeurService = new ProfesseurService();
            String email = request.getParameter("email");
            Professeur prof = null;
            for (Professeur p : professeurService.findAll()) {
                if (email.equals(p.getEmail())) prof = p;
            }
            %>
        <h1>Hello World!</h1>
    </body>
</html>
