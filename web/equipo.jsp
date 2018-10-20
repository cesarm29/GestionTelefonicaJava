<%-- 
    Document   : equipo
    Created on : 17/11/2013, 09:30:25 PM
    Author     : cesar1
--%>

<%@page import="Modelo.EquipoDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
    <head profile="http://gmpg.org/xfn/11">
        <title>Gestion Telefonica</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <meta http-equiv="imagetoolbar" content="no" />
        <link rel="stylesheet" href="styles/layout.css" type="text/css" />
        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
        <script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
        <script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $("#btnNuevo").click(function() {
                    location.href = 'formequipo.jsp?ID=0&Accion=';
                });

            });
        </script>
        </script>
    </head>
    <body>
        <div class="wrapper col0">
            <div id="topbar">
                <div id="slidepanel">
                    <div class="topbox">
                        <h2>Registro</h2>
                        <p>Espacio para el registro de usuarios</p>
                        <p class="readmore"><a href="#">Registrar</a></p>
                    </div>
                    <div class="topbox last">
                        <h2>Ingreso</h2>
                        <form action="#" method="post">
                            <fieldset>
                                <legend>formulario ingreso</legend>
                                <label for="pupilname">Usuario:
                                    <input type="text" name="pupilname" id="pupilname" value="" />
                                </label>
                                <label for="pupilpass">Contraseña:
                                    <input type="password" name="pupilpass" id="pupilpass" value="" />
                                </label>
                                <label for="pupilremember">
                                    <input class="checkbox" type="checkbox" name="pupilremember" id="pupilremember" checked="checked" />
                                    Recordar</label>
                                <p>
                                    <input type="submit" name="pupillogin" id="pupillogin" value="Ingreso" />
                                    &nbsp;
                                    <input type="reset" name="pupilreset" id="pupilreset" value="Resetear" />
                                </p>
                            </fieldset>
                        </form>
                    </div>
                    <br class="clear" />
                </div>
                <div id="loginpanel">
                    <ul>
                        <li class="left">Login &raquo;</li>
                        <li class="right" id="toggle"><a id="slideit" href="#slidepanel">Ingreso</a><a id="closeit" style="display: none;" href="#slidepanel">Cerrar Panel</a></li>
                    </ul>
                </div>
                <br class="clear" />
            </div>
        </div>
        <!-- ####################################################################################################### -->
        <div class="wrapper col1">
            <div id="header">
                <div id="logo">
                    <h1><a href="#">Gestion Telefonica</a></h1>
                    <p>Centro de Servicios Financieros</p>
                </div>
                <div id="topnav">
                    <ul>
                        <li><a href="index.jsp">Inicio</a></li> 
                    </ul>
                </div>
                <br class="clear" />
            </div>
        </div>
        <!-- ####################################################################################################### -->
        <div class="wrapper col2">
            <div id="breadcrumb">
                <ul>
                    <li class="first"></li>
                </ul>
            </div>
        </div>
        <!-- ####################################################################################################### -->
        <div class="wrapper col3">
            <div id="container">
                <div id="content">
                    <h1>&nbsp;</h1>
                    <div id="respond">

                        <h1>Listado de Equipos</h1>
                        <input type="button" id="btnNuevo" name="btnNuevo" value="Nuevo" />
                        <br>   
                        </br>
                        <div id="busqueda">
                            <form action="">
                                <right><input type="text" id="q" name="q" value="" placeholder="Busqueda por serial"/></right>
                                </br>
                                <input type="submit" class="btn-u pull-rgt" value="Buscar"></input>
                            </form>
                        </div>
                        </br>
                        </br>
                        
                        <%      if (request.getParameter("msg") != null) {
                        %>
                        <div style="color: red">
                            <%
                                out.print(request.getParameter("msg"));
                            %>
                        </div>
                        <%
                            }
                        %>
                    
                        <table>
                            <thead>
                                <tr>
                                    <th>Serial Equipo</th>
                                    <th>Numero de linea</th>
                                    <th>Descripcion</th>
                                    <th>Estado equipo</th>
                                    <th>Numero de linea</th>
                                    <th>Editar</th><th>Eliminar</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    EquipoDAO obj1 = new EquipoDAO();
                                    try {
                                        String filtro = request.getParameter("q");
                                        if (filtro == null) {
                                            filtro = "";
                                        }
                                        ResultSet resul = obj1.getTabla(filtro);
                                        while (resul.next()) {
                                            String html = "<tr>";
                                            html += "<td>" + resul.getInt("EQUSERIAL") + "</td>";
                                            html += "<td>" + resul.getString("LINUMEROLINEA") + "</td>";
                                            html += "<td>" + resul.getString("EQUMARCA") + "</td>";
                                            html += "<td>" + resul.getString("EQUDESCRIPCION") + "</td>";
                                            html += "<td>" + resul.getString("EQUESTADO") + "</td>";
                                            html += "<td><a href='formequipo.jsp?ID=" + resul.getString("EQUSERIAL") + "&Accion=Editar'>Editar</a></td>";
                                            html += "<td><a href='formequipo.jsp?ID=" + resul.getString("EQUSERIAL") + "&Accion=Eliminar'>Eliminar</a></td>";
                                            html += "</tr>";
                                            out.print(html);
                                        }
                                    } catch (Exception ex) {
                                        out.print("\" <h1>" + ex.getMessage() + "</h1>");
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <!-- ####################################################################################################### -->
        <div class="wrapper col4">
            <div id="footer">
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p><br class="clear" />
                </p>
            </div>
        </div>
        <!-- ####################################################################################################### -->
        <div class="wrapper col5">
            <div id="copyright">
                <p class="fl_left">Copyright &copy; 2011 - All Rights Reserved -cesar mayorga</p>
                <p class="fl_right">Template by cesar</p>
                <br class="clear" />
            </div>
        </div>
    </body>
</html>

