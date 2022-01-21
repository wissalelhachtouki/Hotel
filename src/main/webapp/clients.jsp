<%-- 
   
    Author     : ELHACHTOUKI WISSAL
--%>


<%@page import="bean.Reservationn"%>
<%@page import="bean.Chambre"%>
<%@page import="service.ReservationService"%>
<%@page import="service.ClientService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion des Professeurs</title>
    </head>
    <body>
        <%
        p

                        p

                                            ClientService clientService = new ClientService();
                                            ReservationService reservationService = new ReservationService();
                                            Reservationn chambre = null;
                                            if (request.getParameter("id") != null) {
                                                client = clientService.findById(Integer.parseInt(request.getParameter("id")));
                                            }
        %>
        <nav>
  <div>
    <ul>
      <li>
        <a href="http://localhost:8080/testt/clients.jsp">Gestion Clients <span>(current)</span></a>
      </li>
      <li>
        <a href="http://localhost:8080/testt/reservations.jsp">Gestion Reservations</a>
      </li>
    </ul>
  </div>
</nav>
        <div>
            <div>Create Client</div>
            <div>
                <form class="form" method="GET" action="ClientController">
                <input type="hidden" name="id" value="<%=t(t( (client == null) ? "" : client.getI%>" />
                <div>
                <div>
                    <label>Nom</label>
                    <input type="text" name="nom" value="<%=t(t( (client == null) ? "" : client.getN%>" />
                </div>
                <div>
                    <label>Prenom</label>
                    <input type="text" name="prenom" value="<%=t(t( (client == null) ? "" : client.getPern%>" />
                </div>
                </div>
                <div>
                <div>
                    <label>Telephone</label>
                    <input type="text" name="telephone" value="<%=t(t( (client == null) ? "" : client.getTelepho%>" />
                </div>
                <div>
                    <label>Email</label>
                    <input type="email" name="email" value="<%=t(t( (client == null) ? "" : client.getEma%>" />
                </div>
                </div>
                <div>
                <div>
                    <label>Date Reserv</label>
                    <input type="date" name="dateReserv" value="<%=t(t( (client == null) ? "" : client.getDateEmbauc%>" />
                </div>
                <div>
                    <label>Chambre</label>
                    <select name="specialite">
                        <%
                        p

                                                                        p

                                                                                                                                    for (Chambre s : reservationService.findAll()) {
                        %>
                                    <option value="<%=t(t(s.getLibel%>" <%;
;
 if (client != null && reservationService.findById(client.getReservation()).getLibelle().equals(s.getLibelle()%>selected<%%>><%=t(t(s.getLibel%></option>
                                    <%
                                    p

                                                                        p
                                    %>
                    </select>
                </div>
                </div>
                    <div>
                    <label>Sexe</label>
                    <select name="sexe">
                        <option value="male" <%p
p
 if (client != null && client.getSexe().equals("male"%>selected<%%>>male</option>
                       <option value="female"<%p
p
 if (client != null && client.getSexe().equals("female"%>selected<%%>>female</option>
                    </select>
                </div>
                   <input type="submit" value="<%=t(t( (client == null) ? "Ajouter" : "Modifi%>" />
        </form>
            </div>
        </div>
            <div>
            <div>
    <div>
    <div> <h5>List of Reservatios. </h5></div>
    </div>
          <div>
      <table>
        <thead>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                        <th>Telephone</th>
                        <th>Email</th>
                        <th>Date Resev</th>
                        <th>SNum Reservation</th>
                        <th>sexe</th>
                        <th>Supprimer</th>
                        <th>Modifier</th>
  </thead>
  <tbody>
                    <%
                    p

                                        p

                                                                for (Reservationn p : clientService.findAll()) {
                    %>
                    <tr>
                        <td> <%= p.getId()%></td>
                        <td><%= p.getNom()%></td>
                        <td><%= p.getPernom()%></td>
                        <td><%= p.getTelephone()%></td>
                        <td><%= p.getEmail()%></td>
                        <td><%= p.getDateReserv()%></td>
                        <td><%= reservationService.findById(p.getReservation()).getLibelle()%></td>
                        <td><%= p.getSexe()%></td>
                        <td><a href="ClientController?id=<%= p.getId()%>&op=delete">Supprimer</a></td>
                        <td><a href="clients.jsp?id=<%= p.getId()%>">Modifier</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
      </table>
          </div>
            </div>
            </div>
    </body>
</html>
