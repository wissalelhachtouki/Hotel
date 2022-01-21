<%-- 
    Document   : dashboard
    Created on : Jan 7, 2021, 4:55:41 PM
    Author     : Ultrapc
--%>

<%@page import="bean.Professeur"%>
<%@page import="bean.Specialite"%>
<%@page import="service.ProfesseurService"%>
<%@page import="service.SpecialiteService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Professors_Specialty CRUD</title>

    <!-- Bootstrap core CSS -->
    <link href="Style/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Style/dashboard.css" rel="stylesheet">
  </head>

  <body>
      <%
          if (session.getAttribute("email") == null) {
              response.sendRedirect("http://localhost:8080/CrudProfessors_Specialite/authentification.jsp");
          }
            ProfesseurService professeurService = new ProfesseurService();
            SpecialiteService specialiteService = new SpecialiteService();
            Professeur professeur = null;
            if (request.getParameter("id") != null) {
                professeur = professeurService.findById(Integer.parseInt(request.getParameter("id")));
            }
        %>
    <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Admin Dashboard</a>
     <!-- <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search"> -->
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
          <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/authentification.jsp?op=delete">Sign out</a>
        </li>
      </ul>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
          <div class="sidebar-sticky">
            <ul class="nav flex-column">
              <li class="nav-item">
                <a class="nav-link active" href="http://localhost:8080/CrudProfessors_Specialite/dashboard.jsp">
                  <span data-feather="users"></span>
                  Professors <span class="sr-only">(current)</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/specialitesNew.jsp">
                  <span data-feather="layers"></span>
                  Specialties
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/graph.jsp">
                  <span data-feather="bar-chart-2"></span>
                  Analytics
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="http://localhost:8080/CrudProfessors_Specialite/specialites.jsp">
                  <span data-feather="search"></span>
                  Search Professors
                </a>
              </li>
            </ul>

            <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
              <span>Saved reports</span>
              <a class="d-flex align-items-center text-muted" href="#">
                <span data-feather="plus-circle"></span>
              </a>
            </h6>
            <ul class="nav flex-column mb-2">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Current month
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Last quarter
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Social engagement
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  <span data-feather="file-text"></span>
                  Year-end sale
                </a>
              </li>
            </ul>
          </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
          <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Professors</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
            <!--  <div class="btn-group mr-2">
                <button class="btn btn-sm btn-outline-secondary">Share</button>
                <button class="btn btn-sm btn-outline-secondary">Export</button>
              </div>
              <button class="btn btn-sm btn-outline-secondary dropdown-toggle">
                <span data-feather="calendar"></span>
                This week
              </button> -->
            </div>
          </div>
            
            
            <div class="card col-md-12 mx-auto  p-md-2">
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
                   <input class="col-md-8 mx-auto btn btn-outline-danger btn-block form-control" type="submit" value="<%= (professeur == null) ? "Ajouter" : "Modifier" %>" />
        </form>
            </div>
        </div>

        <!--  <canvas class="my-4" id="myChart" width="900" height="380"></canvas> -->

          <h2>List Of Professors</h2>
          <div class="table-responsive">
            <table class="table table-striped table-sm">
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
                        <td><%= specialiteService.findById(p.getSpecialite()).getLibelle()%></td>
                        <td><%= p.getSexe()%></td>
                        <td><a class="btn btn-outline-danger btn-block" href="ProfesseurController?id=<%= p.getId()%>&op=delete">Supprimer</a></td>
                        <td><a class="btn btn-outline-danger btn-block" href="dashboard.jsp?id=<%= p.getId()%>">Modifier</a></td>
                    </tr>
                    <%
                        }
                    %>
              </tbody>
            </table>
          </div>
        </main>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="script/jquery-slim.min.js"><\/script>')</script>
    <script src="script/popper.min.js"></script>
    <script src="script/bootstrap.min.js"></script>

    <!-- Icons -->
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
    <script>
      feather.replace()
    </script>

    <!-- Graphs -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
    <script>
      var ctx = document.getElementById("myChart");
      var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
          datasets: [{
            data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
            lineTension: 0,
            backgroundColor: 'transparent',
            borderColor: '#007bff',
            borderWidth: 4,
            pointBackgroundColor: '#007bff'
          }]
        },
        options: {
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: false
              }
            }]
          },
          legend: {
            display: false,
          }
        }
      });
    </script>
  </body>
</html>

