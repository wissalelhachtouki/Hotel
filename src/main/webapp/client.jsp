
<%@page import="service.ProfesseurService"%>
<%@page import="bean.Reservationn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Client</title>
    </head>
    <body>
        <%
        ClientService clientService = new ClientService();
                            String email = request.getParameter("email");
                            Reservationn cham = null;
                            for (Reservationn p : clientService.findAll()) {
                                if (email.equals(p.getEmail())) chamb = p;
                            }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
