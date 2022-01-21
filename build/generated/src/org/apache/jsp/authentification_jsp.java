package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.UserService;

public final class authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"Style/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
            
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <form class=\"box\" method=\"GET\" action=\"authentification.jsp\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                    <p class=\"text-muted\"> Please enter your Email and password!</p> <input type=\"text\" name=\"email\" placeholder=\"Email\"> <input type=\"password\" name=\"password\" placeholder=\"Password\"> <label style=\"color: red;display: ");
      out.print( (empty) ? "block" : "none");
      out.write("\">Login and password should not be empty</label> <label style=\"color: red;display: ");
      out.print( (Correct) ? "none" : "block");
      out.write("\">Login Or password is not correct</label>  <a class=\"forgot text-muted\" href=\"http://localhost:8080/CrudProfessors_Specialite/signUp.jsp\">Create Account</a>  <input type=\"submit\" name=\"\" value=\"Login\" href=\"#\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
