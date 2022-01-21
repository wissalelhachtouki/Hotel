package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"../../../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"dashboard.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
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
      out.write("                <a class=\"nav-link active\" href=\"#\">\n");
      out.write("                  <span data-feather=\"home\"></span>\n");
      out.write("                  Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file\"></span>\n");
      out.write("                  Orders\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"shopping-cart\"></span>\n");
      out.write("                  Products\n");
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
      out.write("              <div class=\"btn-group mr-2\">\n");
      out.write("                <button class=\"btn btn-sm btn-outline-secondary\">Share</button>\n");
      out.write("                <button class=\"btn btn-sm btn-outline-secondary\">Export</button>\n");
      out.write("              </div>\n");
      out.write("              <button class=\"btn btn-sm btn-outline-secondary dropdown-toggle\">\n");
      out.write("                <span data-feather=\"calendar\"></span>\n");
      out.write("                This week\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <canvas class=\"my-4\" id=\"myChart\" width=\"900\" height=\"380\"></canvas>\n");
      out.write("\n");
      out.write("          <h2>Section title</h2>\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-striped table-sm\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>#</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                  <th>Header</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,001</td>\n");
      out.write("                  <td>Lorem</td>\n");
      out.write("                  <td>ipsum</td>\n");
      out.write("                  <td>dolor</td>\n");
      out.write("                  <td>sit</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,002</td>\n");
      out.write("                  <td>amet</td>\n");
      out.write("                  <td>consectetur</td>\n");
      out.write("                  <td>adipiscing</td>\n");
      out.write("                  <td>elit</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,003</td>\n");
      out.write("                  <td>Integer</td>\n");
      out.write("                  <td>nec</td>\n");
      out.write("                  <td>odio</td>\n");
      out.write("                  <td>Praesent</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,003</td>\n");
      out.write("                  <td>libero</td>\n");
      out.write("                  <td>Sed</td>\n");
      out.write("                  <td>cursus</td>\n");
      out.write("                  <td>ante</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,004</td>\n");
      out.write("                  <td>dapibus</td>\n");
      out.write("                  <td>diam</td>\n");
      out.write("                  <td>Sed</td>\n");
      out.write("                  <td>nisi</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,005</td>\n");
      out.write("                  <td>Nulla</td>\n");
      out.write("                  <td>quis</td>\n");
      out.write("                  <td>sem</td>\n");
      out.write("                  <td>at</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,006</td>\n");
      out.write("                  <td>nibh</td>\n");
      out.write("                  <td>elementum</td>\n");
      out.write("                  <td>imperdiet</td>\n");
      out.write("                  <td>Duis</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,007</td>\n");
      out.write("                  <td>sagittis</td>\n");
      out.write("                  <td>ipsum</td>\n");
      out.write("                  <td>Praesent</td>\n");
      out.write("                  <td>mauris</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,008</td>\n");
      out.write("                  <td>Fusce</td>\n");
      out.write("                  <td>nec</td>\n");
      out.write("                  <td>tellus</td>\n");
      out.write("                  <td>sed</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,009</td>\n");
      out.write("                  <td>augue</td>\n");
      out.write("                  <td>semper</td>\n");
      out.write("                  <td>porta</td>\n");
      out.write("                  <td>Mauris</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,010</td>\n");
      out.write("                  <td>massa</td>\n");
      out.write("                  <td>Vestibulum</td>\n");
      out.write("                  <td>lacinia</td>\n");
      out.write("                  <td>arcu</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,011</td>\n");
      out.write("                  <td>eget</td>\n");
      out.write("                  <td>nulla</td>\n");
      out.write("                  <td>Class</td>\n");
      out.write("                  <td>aptent</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,012</td>\n");
      out.write("                  <td>taciti</td>\n");
      out.write("                  <td>sociosqu</td>\n");
      out.write("                  <td>ad</td>\n");
      out.write("                  <td>litora</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,013</td>\n");
      out.write("                  <td>torquent</td>\n");
      out.write("                  <td>per</td>\n");
      out.write("                  <td>conubia</td>\n");
      out.write("                  <td>nostra</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,014</td>\n");
      out.write("                  <td>per</td>\n");
      out.write("                  <td>inceptos</td>\n");
      out.write("                  <td>himenaeos</td>\n");
      out.write("                  <td>Curabitur</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>1,015</td>\n");
      out.write("                  <td>sodales</td>\n");
      out.write("                  <td>ligula</td>\n");
      out.write("                  <td>in</td>\n");
      out.write("                  <td>libero</td>\n");
      out.write("                </tr>\n");
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
      out.write("    <script>window.jQuery || document.write('<script src=\"../../../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"../../../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"../../../../dist/js/bootstrap.min.js\"></script>\n");
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
