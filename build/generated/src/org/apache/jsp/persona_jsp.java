package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.PersonaDAO;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class persona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#btnNuevo\").click(function() {\n");
      out.write("                    location.href = 'formpersona.jsp?ID=0&Accion=';\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        </script>\n");
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
      out.write("                        <li><a href=\"index.jsp\">Inicio</a></li> \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"first\"></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ####################################################################################################### -->\n");
      out.write("        <div class=\"wrapper col3\">\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <h1>&nbsp;</h1>\n");
      out.write("                    <div id=\"respond\">\n");
      out.write("                        <h1>Listado de Personas</h1>\n");
      out.write("                        <input type=\"button\" id=\"btnNuevo\" name=\"btnNuevo\" value=\"Nuevo\" />\n");
      out.write("                        <br>\n");
      out.write("                        </br>\n");
      out.write("                        <div id=\"busqueda\">\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <right><input type=\"text\" id=\"q\" name=\"q\" value=\"\" placeholder=\"Busqueda por serial\"/></right>\n");
      out.write("                                </br>\n");
      out.write("                                <input type=\"submit\" class=\"btn-u pull-rgt\" value=\"Buscar\"></input>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      if (request.getParameter("msg") != null) {
                        
      out.write("\n");
      out.write("                        <div style=\"color: red\">\n");
      out.write("                            ");

                                out.print(request.getParameter("msg"));
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <table border=\"2\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Identificacion Persona</th>\n");
      out.write("                                    <th>Nombres</th>\n");
      out.write("                                    <th>Apellidos</th>\n");
      out.write("                                    <th>Telefono Fijo</th>\n");
      out.write("                                    <th>Fecha de nacimiento</th>\n");
      out.write("                                    <th>Cedula</th>\n");
      out.write("                                    <th>Editar</th><th>Eliminar</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    PersonaDAO obj = new PersonaDAO();
                                    try {
                                        String filtro = request.getParameter("q");
                                        if (filtro == null) {
                                            filtro = "";
                                        }
                                        ResultSet resul = obj.getTabla(filtro);
                                        while (resul.next()) {
                                            String html = "<tr>";
                                            html += "<td>" + resul.getInt("PERID") + "</td>";
                                            html += "<td>" + resul.getString("PERNOMBRE") + "</td>";
                                            html += "<td>" + resul.getString("PERAPELLIDO") + "</td>";
                                            html += "<td>" + resul.getString("PERTELEFONOFIJO") + "</td>";
                                            html += "<td>" + resul.getString("PERFECHANACIMIENTO") + "</td>";
                                            html += "<td>" + resul.getString("PERCEDULA") + "</td>";
                                            html += "<td><a href='formpersona.jsp?ID=" + resul.getString("PERID") + "&Accion=Editar'>Editar</a></td>";
                                            html += "<td><a href='formpersona.jsp?ID=" + resul.getString("PERID") + "&Accion=Eliminar'>Eliminar</a></td>";
                                            html += "</tr>";
                                            out.print(html);
                                        }
                                    } catch (Exception ex) {
                                        out.print("\" <h1>" + ex.getMessage() + "</h1>");
                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
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
