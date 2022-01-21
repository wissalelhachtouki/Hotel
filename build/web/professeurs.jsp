<%-- 
    Document   : professeurs
    Created on : Dec 26, 2020, 4:09:44 PM
    Author     : Ultrapc
--%>


<%@page import="bean.Professeur"%>
<%@page import="bean.Specialite"%>
<%@page import="service.ProfesseurService"%>
<%@page import="service.SpecialiteService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion des Professeurs</title>
    </head>
    <body>
        <%
            ProfesseurService professeurService = new ProfesseurService();
            SpecialiteService specialiteService = new SpecialiteService();
            Professeur professeur = null;
            if (request.getParameter("id") != null) {
                professeur = professeurService.findById(Integer.parseInt(request.getParameter("id")));
            }
        %>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/professeurs.jsp">Gestion Professeurs <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/specialites.jsp">Gestion Specialities</a>
      </li>
    </ul>
  </div>
</nav>
        <div class="card col-md-8 mx-auto  p-md-2">
            <div class="card-header text-center  font-weight-bold">Create Professors</div>
            <div class="card-body">
                <form class="form" method="GET" action="ProfesseurController">
                <input type="hidden" name="id" value="<%= (professeur == null) ? "" : professeur.getId() %>" />
                <div class="row">
                <div class="row col-md-6 py-2">
                    <label>Nom</label>
                    <input class="form-control" type="text" name="nom" value="<%= (professeur == null) ? "" : professeur.getNom()%>" />
                </div>
                <div class="row col-md-6 py-2">
                    <label>Prenom</label>
                    <input class="form-control" type="text" name="prenom" value="<%= (professeur == null) ? "" : professeur.getPernom()%>" />
                </div>
                </div>
                <div class="row">
                <div class="row col-md-6 py-2">
                    <label>Telephone</label>
                    <input class="form-control" type="text" name="telephone" value="<%= (professeur == null) ? "" : professeur.getTelephone()%>" />
                </div>
                <div class="row col-md-6 py-2">
                    <label>Email</label>
                    <input class="form-control" type="email" name="email" value="<%= (professeur == null) ? "" : professeur.getEmail()%>" />
                </div>
                </div>
                <div class="row">
                <div class="row col-md-6 py-2">
                    <label>Date Embauche</label>
                    <input class="form-control" type="date" name="dateEmbauche" value="<%= (professeur == null) ? "" : professeur.getDateEmbauche()%>" />
                </div>
                <div class="row col-md-6 py-2">
                    <label>Specialite</label>
                    <select class="form-control" name="specialite">
                        <%
                                    for (Specialite s : specialiteService.findAll()) {
                                    %>
                                    <option value="<%=s.getLibelle()%>" <% if (professeur != null && specialiteService.findById(professeur.getSpecialite()).getLibelle().equals(s.getLibelle())) { %>selected<% } %>><%=s.getLibelle()%></option>
                                    <% } %>
                    </select>
                </div>
                </div>
                    <div class="row py-2 col-md-6">
                    <label>Sexe</label>
                    <select class="form-control" name="sexe">
                        <option value="male" <% if (professeur != null && professeur.getSexe().equals("male")) { %>selected<% } %>>male</option>
                       <option value="female"<% if (professeur != null && professeur.getSexe().equals("female")) { %>selected<% } %>>female</option>
                    </select>
                </div>
                   <input class="btn btn-outline-danger btn-block form-control" type="submit" value="<%= (professeur == null) ? "Ajouter" : "Modifier" %>" />
        </form>
            </div>
        </div>
            <div class="card col-md-8 mx-auto  p-md-2" bg-dark text-white>
            <div class="card col-12 bg-dark text-white">
    <div class="card-header bg-dark text-white">
    <div class="px-1 bg-dark text-white"> <h5>List of Specialties. </h5></div>
    </div>
          <div class="card-body bg-dark text-white table-responsive">
      <table class="table table-hover table-dark col-md-12">
        <thead class="thead-dark">
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                        <th>Telephone</th>
                        <th>Email</th>
                        <th>Date Embauche</th>
                        <th>Specialite</th>
                        <th>sexe</th>
                        <th>Supprimer</th>
                        <th>Modifier</th>
  </thead>
  <tbody>
                    <%
                        for (Professeur p : professeurService.findAll()) {
                    %>
                    <tr>
                        <td> <%= p.getId()%></td>
                        <td><%= p.getNom()%></td>
                        <td><%= p.getPernom()%></td>
                        <td><%= p.getTelephone()%></td>
                        <td><%= p.getEmail()%></td>
                        <td><%= p.getDateEmbauche()%></td>
                        <td><%= specialiteService.findById(p.getSpecialite()).getLibelle()%></td>
                        <td><%= p.getSexe()%></td>
                        <td><a class="btn btn-outline-danger btn-block" href="ProfesseurController?id=<%= p.getId()%>&op=delete">Supprimer</a></td>
                        <td><a class="btn btn-outline-danger btn-block" href="professeurs.jsp?id=<%= p.getId()%>">Modifier</a></td>
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
