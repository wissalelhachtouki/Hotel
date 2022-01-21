package org.apache.jsp.script;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Professeur;
import bean.Specialite;
import service.ProfesseurService;
import service.SpecialiteService;

public final class graph_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Dashboard Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"Style/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"Style/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      ");

            ProfesseurService professeurService = new ProfesseurService();
            SpecialiteService specialiteService = new SpecialiteService();
            Professeur professeur = null;
            if (request.getParameter("id") != null) {
                professeur = professeurService.findById(Integer.parseInt(request.getParameter("id")));
            }
        
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0\">\n");
      out.write("      <a class=\"navbar-brand col-sm-3 col-md-2 mr-0\" href=\"#\">Company name</a>\n");
      out.write("      <input class=\"form-control form-control-dark w-100\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <ul class=\"navbar-nav px-3\">\n");
      out.write("        <li class=\"nav-item text-nowrap\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Sign out</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <nav class=\"col-md-2 d-none d-md-block bg-light sidebar\">\n");
      out.write("          <div class=\"sidebar-sticky\">\n");
      out.write("            <ul class=\"nav flex-column\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"users\"></span>\n");
      out.write("                  Professors <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"http://localhost:8080/CrudProfessors_Specialite/specialitesNew.jsp\">\n");
      out.write("                  <span data-feather=\"layers\"></span>\n");
      out.write("                  Specialties\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" href=\"http://localhost:8080/CrudProfessors_Specialite/graph.jsp\">\n");
      out.write("                  <span data-feather=\"bar-chart-2\"></span>\n");
      out.write("                  Analytics\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"users\"></span>\n");
      out.write("                  Customers\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"bar-chart-2\"></span>\n");
      out.write("                  Reports\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"layers\"></span>\n");
      out.write("                  Integrations\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <h6 class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\n");
      out.write("              <span>Saved reports</span>\n");
      out.write("              <a class=\"d-flex align-items-center text-muted\" href=\"#\">\n");
      out.write("                <span data-feather=\"plus-circle\"></span>\n");
      out.write("              </a>\n");
      out.write("            </h6>\n");
      out.write("            <ul class=\"nav flex-column mb-2\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Current month\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Last quarter\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Social engagement\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Year-end sale\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 pt-3 px-4\">\n");
      out.write("          <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom\">\n");
      out.write("            <h1 class=\"h2\">Dashboard</h1>\n");
      out.write("            <div class=\"btn-toolbar mb-2 mb-md-0\">\n");
      out.write("            <!--  <div class=\"btn-group mr-2\">\n");
      out.write("                <button class=\"btn btn-sm btn-outline-secondary\">Share</button>\n");
      out.write("                <button class=\"btn btn-sm btn-outline-secondary\">Export</button>\n");
      out.write("              </div>\n");
      out.write("              <button class=\"btn btn-sm btn-outline-secondary dropdown-toggle\">\n");
      out.write("                <span data-feather=\"calendar\"></span>\n");
      out.write("                This week\n");
      out.write("              </button> -->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"card col-md-12 mx-auto  p-md-2\">\n");
      out.write("            <div class=\"card-header text-center  font-weight-bold\">Create Professors</div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form class=\"form\" method=\"GET\" action=\"ProfesseurController\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getId() );
      out.write("\" />\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Nom</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"nom\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getNom());
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Prenom</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"prenom\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getPernom());
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Telephone</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" name=\"telephone\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getTelephone());
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input class=\"form-control\" type=\"email\" name=\"email\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getEmail());
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Date Embauche</label>\n");
      out.write("                    <input class=\"form-control\" type=\"date\" name=\"dateEmbauche\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getDateEmbauche());
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row col-md-6 py-2\">\n");
      out.write("                    <label>Specialite</label>\n");
      out.write("                    <select class=\"form-control\" name=\"specialite\">\n");
      out.write("                        ");

                                    for (Specialite s : specialiteService.findAll()) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(s.getLibelle());
      out.write('"');
      out.write(' ');
 if (professeur != null && specialiteService.findById(professeur.getSpecialite()).getLibelle().equals(s.getLibelle())) { 
      out.write("selected");
 } 
      out.write('>');
      out.print(s.getLibelle());
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"row py-2 col-md-6\">\n");
      out.write("                    <label>Sexe</label>\n");
      out.write("                    <select class=\"form-control\" name=\"sexe\">\n");
      out.write("                        <option value=\"male\" ");
 if (professeur != null && professeur.getSexe().equals("male")) { 
      out.write("selected");
 } 
      out.write(">male</option>\n");
      out.write("                       <option value=\"female\"");
 if (professeur != null && professeur.getSexe().equals("female")) { 
      out.write("selected");
 } 
      out.write(">female</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                   <input class=\"col-md-8 mx-auto btn btn-outline-danger btn-block form-control\" type=\"submit\" value=\"");
      out.print( (professeur == null) ? "Ajouter" : "Modifier" );
      out.write("\" />\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--  <canvas class=\"my-4\" id=\"myChart\" width=\"900\" height=\"380\"></canvas> -->\n");
      out.write("\n");
      out.write("          <h2>List Of Professors</h2>\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-striped table-sm\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>ID</th>\n");
      out.write("                        <th>Nom</th>\n");
      out.write("                        <th>Prenom</th>\n");
      out.write("                        <th>Telephone</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Date Embauche</th>\n");
      out.write("                        <th>Specialite</th>\n");
      out.write("                        <th>sexe</th>\n");
      out.write("                        <th>Supprimer</th>\n");
      out.write("                        <th>Modifier</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("               ");

                        for (Professeur p : professeurService.findAll()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( p.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getNom());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getPernom());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getTelephone());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getDateEmbauche());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( specialiteService.findById(p.getSpecialite()).getLibelle());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( p.getSexe());
      out.write("</td>\n");
      out.write("                        <td><a class=\"btn btn-outline-danger btn-block\" href=\"ProfesseurController?id=");
      out.print( p.getId());
      out.write("&op=delete\">Supprimer</a></td>\n");
      out.write("                        <td><a class=\"btn btn-outline-danger btn-block\" href=\"dashboard.jsp?id=");
      out.print( p.getId());
      out.write("\">Modifier</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </main>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"script/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"script/popper.min.js\"></script>\n");
      out.write("    <script src=\"script/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Icons -->\n");
      out.write("    <script src=\"https://unpkg.com/feather-icons/dist/feather.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      feather.replace()\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!-- Graphs -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      var ctx = document.getElementById(\"myChart\");\n");
      out.write("      var myChart = new Chart(ctx, {\n");
      out.write("        type: 'line',\n");
      out.write("        data: {\n");
      out.write("          labels: [\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\"],\n");
      out.write("          datasets: [{\n");
      out.write("            data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],\n");
      out.write("            lineTension: 0,\n");
      out.write("            backgroundColor: 'transparent',\n");
      out.write("            borderColor: '#007bff',\n");
      out.write("            borderWidth: 4,\n");
      out.write("            pointBackgroundColor: '#007bff'\n");
      out.write("          }]\n");
      out.write("        },\n");
      out.write("        options: {\n");
      out.write("          scales: {\n");
      out.write("            yAxes: [{\n");
      out.write("              ticks: {\n");
      out.write("                beginAtZero: false\n");
      out.write("              }\n");
      out.write("            }]\n");
      out.write("          },\n");
      out.write("          legend: {\n");
      out.write("            display: false,\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
