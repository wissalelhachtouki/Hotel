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
        <div class="card col-md-8 mx-auto  p-md-2">
            <div class="card-header text-center  font-weight-bold">Create Professors</div>
            <div class="card-body">
                <form class="form" method="GET" action="ProfesseurController">
            <fieldset>
                <input type="hidden" name="id" value="<%= (professeur == null) ? "" : professeur.getId() %>" />
                <div class="row py-2">
                    <label>Nom</label>
                    <input class="form-control" type="text" name="nom" value="<%= (professeur == null) ? "" : professeur.getNom()%>" />
                </div>
                <div class="row py-2">
                    <label>Prenom</label>
                    <input class="form-control" type="text" name="prenom" value="<%= (professeur == null) ? "" : professeur.getPernom()%>" />
                </div>
                <div class="row py-2">
                    <label>Telephone</label>
                    <input class="form-control" type="text" name="telephone" value="<%= (professeur == null) ? "" : professeur.getTelephone()%>" />
                </div>
                <div class="row py-2">
                    <label>Email</label>
                    <input class="form-control" type="text" name="email" value="<%= (professeur == null) ? "" : professeur.getEmail()%>" />
                </div>
                <div class="row py-2">
                    <label>Date Embauche</label>
                    <input class="form-control" type="date" name="dateEmbauche" value="<%= (professeur == null) ? "" : professeur.getDateEmbauche()%>" />
                </div>
                <div class="row">
                    <select class="form-control" name="specialite">
                        <%
                                    for (Specialite s : specialiteService.findAll()) {
                                    %>
                                    <option value="<%=s.getCode()%>"><%=s.getCode()%></option>
                                    <% } %>
                    </select>
                </div>
                    <div class="row">
                    <select class="form-control" name="sexe">
                        <option value="male">male</option>
                                <option value="female">female</option>
                    </select>
                </div>
                   <input class="btn btn-outline-danger btn-block form-control" type="submit" value="<%= (professeur == null) ? "Ajouter" : "Modifier" %>" />
            </fieldset>
        </form>
            </div>
        </div>
        <form method="GET" action="ProfesseurController">
            <fieldset>
                <input type="hidden" name="id" value="<%= (professeur == null) ? "" : professeur.getId() %>" />
                <legend>  Informations machine  </legend>
                <table border="0">                        
                    <tr>
                        <td>Nom</td>
                        <td><input type="text" name="nom" value="<%= (professeur == null) ? "" : professeur.getNom()%>" /></td>
                    </tr>
                    <tr>
                        <td>Prenom</td>
                        <td><input type="text" name="prenom" value="<%= (professeur == null) ? "" : professeur.getPernom()%>" /></td>
                    </tr>
                    <tr>
                        <td>Telephone</td>
                        <td><input type="text" name="telephone" value="<%= (professeur == null) ? "" : professeur.getTelephone()%>" /></td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td><input type="email" name="email" value="<%= (professeur == null) ? "" : professeur.getEmail()%>" /></td>
                    </tr>
                    <tr>
                        <td>Date Embauche</td>
                        <td><input type="date" name="dateAchat" value="<%= (professeur == null) ? "" : professeur.getDateEmbauche()%>" /></td>
                    </tr>
                    <tr>
                    <tr>
                        <td>
                            <select name="specialite">
                                <%
                                    for (Specialite s : specialiteService.findAll()) {
                                    %>
                                    <option value="<%=s.getCode()%>"><%=s.getCode()%></option>
                                    <% } %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <select name="sexe">
                                <option value="male">male</option>
                                <option value="female">female</option>
                            </select>
                        </td>
                    </tr>
                        <td></td>
                        <td><input type="submit" value="<%= (professeur == null) ? "Ajouter" : "Modifier" %>" /></td>
                    </tr>
                </table>
            </fieldset>
        </form>
                    <fieldset>
            <legend>  List des professeurs  </legend>
            <table border="1">
                <thead>
                    <tr>
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
                    </tr>
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
                        <td><%= p.getSpecialite()%></td>
                        <td><%= p.getSexe()%></td>
                        <td><a href="ProfesseurController?id=<%= p.getId()%>&op=delete">Supprimer</a></td>
                        <td><a href="professeurs.jsp?id=<%= p.getId()%>">Modifier</a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </fieldset>
    </body>
</html>
