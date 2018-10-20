package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.FacturaDAO;
import Modelo.FacturaDTO;

public final class formfactura_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"EN\" lang=\"EN\" dir=\"ltr\">\n");
      out.write("    <head profile=\"http://gmpg.org/xfn/11\">\n");
      out.write("        <title>Gestion Telefonica</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <meta http-equiv=\"imagetoolbar\" content=\"no\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/jquery-1.4.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/jquery.slidepanel.setup.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/jquery.cycle.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"scripts/jquery.cycle.setup.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                $(\"#btnSalir\").click(function() {\n");
      out.write("                    history.back();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            ");

            String Title = "Crear";
            FacturaDTO contradoss = new FacturaDTO();
            String accion = request.getParameter("Accion");
            String id = request.getParameter("ID");
            if ((accion.equals("Eliminar") || accion.equals("Editar")) && !(id.equals(""))) {
                if (accion.equals("Editar")) {
                    Title = "Modificar";
                } else {
                    Title = "Eliminar";
                }
                FacturaDAO d = new FacturaDAO();
                try {
                    contradoss = d.getPorID(Integer.parseInt(id));
                } catch (Exception ex) {
                    out.print("$('#divError').html(\"<h5>" + ex.getMessage() + "</h5>\");");
                }
            
      out.write("\n");
      out.write("                establecer(\"FACNUMERO\", \"");
      out.print(contradoss.getFACNUMERO());
      out.write("\");\n");
      out.write("                establecer(\"LINUMEROLINEA\", \"");
      out.print(contradoss.getLINUMEROLINEA());
      out.write("\");\n");
      out.write("                establecer(\"FACFECHAEMISION\", \"");
      out.print(contradoss.getFACFECHAEMISION());
      out.write("\");\n");
      out.write("                establecer(\"FACVALOR\", \"");
      out.print(contradoss.getFACVALOR());
      out.write("\");\n");
      out.write("            ");
} else {
                Title = "Crear";
            }
            
      out.write("\n");
      out.write("});\n");
      out.write("            function establecer(id, val) {\n");
      out.write("                $(\"#\" + id).val(val);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper col0\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <div id=\"slidepanel\">\n");
      out.write("                    <div class=\"topbox\">\n");
      out.write("                        <h2>Registro</h2>\n");
      out.write("                        <p>Espacio para el registro de usuarios</p>\n");
      out.write("                        <p class=\"readmore\"><a href=\"#\">Registrar</a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"topbox last\">\n");
      out.write("                        <h2>Ingreso</h2>\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend>formulario ingreso</legend>\n");
      out.write("                                <label for=\"pupilname\">Usuario:\n");
      out.write("                                    <input type=\"text\" name=\"pupilname\" id=\"pupilname\" value=\"\" />\n");
      out.write("                                </label>\n");
      out.write("                                <label for=\"pupilpass\">Contraseña:\n");
      out.write("                                    <input type=\"password\" name=\"pupilpass\" id=\"pupilpass\" value=\"\" />\n");
      out.write("                                </label>\n");
      out.write("                                <label for=\"pupilremember\">\n");
      out.write("                                    <input class=\"checkbox\" type=\"checkbox\" name=\"pupilremember\" id=\"pupilremember\" checked=\"checked\" />\n");
      out.write("                                    Recordar</label>\n");
      out.write("                                <p>\n");
      out.write("                                    <input type=\"submit\" name=\"pupillogin\" id=\"pupillogin\" value=\"Ingreso\" />\n");
      out.write("                                    &nbsp;\n");
      out.write("                                    <input type=\"reset\" name=\"pupilreset\" id=\"pupilreset\" value=\"Resetear\" />\n");
      out.write("                                </p>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <br class=\"clear\" />\n");
      out.write("                </div>\n");
      out.write("                <div id=\"loginpanel\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"left\">Login &raquo;</li>\n");
      out.write("                        <li class=\"right\" id=\"toggle\"><a id=\"slideit\" href=\"#slidepanel\">Ingreso</a><a id=\"closeit\" style=\"display: none;\" href=\"#slidepanel\">Cerrar Panel</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"#\">Gestion Telefonica</a></h1>\n");
      out.write("                    <p>Centro de Servicios Financieros</p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"topnav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col3\">\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <h1>Factura</h1>\n");
      out.write("                    <div id=\"respond\">\n");
      out.write("                        <form id=\"formInscripcion\" method=\"post\" action=\"ControlFactura\">\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                Numero Factura\n");
      out.write("                                <input type=\"number\" name=\"FACNUMERO\" id=\"FACNUMERO\" value=\"\" size=\"22\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                Numero de linea\n");
      out.write("                                <input type=\"text\" name=\"LINUMEROLINEA\" id=\"LINUMEROLINEA\" value=\"\" size=\"22\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                Fecha emision factura\n");
      out.write("                                <input type=\"text\" name=\"FACFECHAEMISION\" id=\"FACFECHAEMISION\" value=\"\" size=\"22\" />\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                Valor factura\n");
      out.write("                                <input type=\"number\" name=\"FACVALOR\" id=\"FACVALOR\" value=\"\" size=\"22\" />\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                <label for=\"comment\" style=\"display:none;\"><small>Comment (required)</small></label>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <input type=\"submit\" name=\"btnSubmit\" id=\"btnSubmit\" value=\"");
      out.print(Title);
      out.write("\"/>\n");
      out.write("                                <input type=\"button\" name=\"btnSalir\" id=\"btnSalir\" value=\"Salir\" />\n");
      out.write("                            </p>\n");
      out.write("                            ");

                                if (request.getParameter("msg") != null) {
                                    out.print("<div style=\"color: red\">" + request.getParameter("msg") + "</div>");
                                }
                            
      out.write(" \n");
      out.write("                            <p>&nbsp;</p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col4\">\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p><br class=\"clear\" />\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("            <div id=\"copyright\">\n");
      out.write("                <p class=\"fl_left\">Copyright &copy; 2011 - All Rights Reserved -cesar mayorga</p>\n");
      out.write("                <p class=\"fl_right\">Template by cesar</p>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
