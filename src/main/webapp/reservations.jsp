
<%@page import="bean.Chambre"%>
<%@page import="service.ChambreService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion des Reservation</title>
    </head>
    <body>
        <%
        ReservationService reservationService = new ReservationService();
                            Chambre reservation = null;
                            if (request.getParameter("id") != null) {
                            	reservation = reservationService.findById(Integer.parseInt(request.getParameter("id")));
                            }
        %>
        <nav>
  <div id="navbarNav">
    <ul>
      <li>
        <a href="http://localhost:8080/CrudProfessors_Specialite/clients.jsp">Gestion Clients</a>
      </li>
      <li>
        <a href="http://localhost:8080/CrudProfessors_Specialite/reservations.jsp">Gestion Reservations <span>(current)</span></a>
      </li>
    </ul>
  </div>
</nav>
        <div>
            <div>Create Specialities</div>
            <div >
                <form class="form" method="GET" action="ReservationController">
                <input type="hidden" name="id" value="<%=(reservation == null) ? "" : reservation.getId()%>" />
                <div>
                <div>
                    <label>Code</label>
                    <input type="text" name="code" value="<%=(reservation == null) ? "" : reservation.getCode()%>" />
                </div>
                <div>
                    <label>Libelle</label>
                    <input type="text" name="libelle" value="<%=(reservation == null) ? "" : reservation.getLibelle()%>" />
                </div>
                </div>
                   <input type="submit" value="<%=(reservation == null) ? "Ajouter" : "Modifier"%>" />
        </form>
            </div>
        </div>
                    <fieldset>
            <div>
            <div>
    <div>
    <div> <h5>List of reservations. </h5></div>
    </div>
          <div>
      <table>
        <thead>

          <th>ID</th>
          <th>Code</th>
          <th>Libelle</th>
          <th>Supprimer</th>
          <th>Modifier</th>
  </thead>
  <tbody>
                    <%
                    for (Chambre s : sreservationService.findAll()) {
                    %>
                    <tr>
                        <td> <%= s.getId()%></td>
                        <td><%= s.getCode()%></td>
                        <td><%= s.getLibelle()%></td>
                        <td><a href="ChambreController?id=<%= s.getId()%>&op=delete">Supprimer</a></td>
                        <td><a href="chambres.jsp?id=<%= s.getId()%>">Modifier</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
      </table>
          </div>
            </div>
            </div>
            
        </fieldset>
    </body>
</html>
