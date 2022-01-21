package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Professeur;
import bean.Specialite;
import service.ProfesseurService;
import service.SpecialiteService;

public final class professeurs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestion des Professeurs</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ProfesseurService professeurService = new ProfesseurService();
            SpecialiteService specialiteService = new SpecialiteService();
            Professeur professeur = null;
            if (request.getParameter("id") != null) {
                professeur = professeurService.findById(Integer.parseInt(request.getParameter("id")));
            }
        
      out.write("\n");
      out.write("        <form method=\"GET\" action=\"ProfesseurController\">\n");
      out.write("            <fieldset>\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getId() );
      out.write("\" />\n");
      out.write("                <legend>  Informations Professeur  </legend>\n");
      out.write("                <table border=\"0\">                        \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nom</td>\n");
      out.write("                        <td><input type=\"text\" name=\"nom\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getNom());
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Prenom</td>\n");
      out.write("                        <td><input type=\"text\" name=\"prenom\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getPernom());
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Telephone</td>\n");
      out.write("                        <td><input type=\"text\" name=\"telephone\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getTelephone());
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>email</td>\n");
      out.write("                        <td><input type=\"email\" name=\"email\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getEmail());
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date Embauche</td>\n");
      out.write("                        <td><input type=\"date\" name=\"dateEmbauche\" value=\"");
      out.print( (professeur == null) ? "" : professeur.getDateEmbauche());
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Specialite</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"specialite\">\n");
      out.write("                                ");

                                    for (Specialite s : specialiteService.findAll()) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(s.getCode());
      out.write('"');
      out.write('>');
      out.print(s.getCode());
      out.write("</option>\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Sexe</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"sexe\">\n");
      out.write("                                <option value=\"male\">male</option>\n");
      out.write("                                <option value=\"female\">female</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"");
      out.print( (professeur == null) ? "Ajouter" : "Modifier" );
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("                    <fieldset>\n");
      out.write("            <legend>  List des professeurs  </legend>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Nom</th>\n");
      out.write("                        <th>Prenom</th>\n");
      out.write("                        <th>Telephone</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Date Embauche</th>\n");
      out.write("                        <th>Specialite</th>\n");
      out.write("                        <th>sexe</th>\n");
      out.write("                        <th>Supprimer</th>\n");
      out.write("                        <th>Modifier</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

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
      out.write("                        <td><a href=\"ProfesseurController?id=");
      out.print( p.getId());
      out.write("&op=delete\">Supprimer</a></td>\n");
      out.write("                        <td><a href=\"professeurs.jsp?id=");
      out.print( p.getId());
      out.write("\">Modifier</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
