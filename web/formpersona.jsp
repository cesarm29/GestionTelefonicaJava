<%-- 
    Document   : formpersona
    Created on : 7/11/2013, 09:10:44 PM
    Author     : cesar1
--%>

<%@page import="DAO.PersonaDao"%>
<%@page import="DTO.PersonaDto"%>
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
    
    $(function(){
        $("#btnSalir").click(function(){
            history.back();
        });
    
<%
    String Title = "Crear";
PersonaDto contrado = new PersonaDto();
String accion = request.getParameter("Accion");
String id = request.getParameter("ID");
if((accion.equals("Eliminar") || accion.equals("Editar")) && !(id.equals(""))){
    if(accion.equals("Editar"))Title = "Modificar"; else Title = "Eliminar";
    PersonaDao d = new PersonaDao();
    try{
    contrado =  d.getPorID(Integer.parseInt(id));
    }catch(Exception ex){
        out.print("$('#divError').html(\"<h5>" +ex.getMessage() + "</h5>\");");
    }
%>
    establecer("id", "<%=contrado.getPERID() %>");
    establecer("nombre", "<%=contrado.getPERNOMBRE() %>");
    establecer("apellido", "<%=contrado.getPERAPELLIDO() %>");
    establecer("telefono fijo", "<%=contrado.getPERTELEFONOFIJO() %>");
    establecer("fecha nacimiento", "<%=contrado.getPERFECHANACIMIENTO() %>");
    establecer("cedula", "<%=contrado.getPERCEDULA() %>");
<%}else {
Title = "Crear";
}
%>});
    function establecer(id, val){
        $("#" + id).val(val);
    }
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
        <form id="formInscripcion" method="post" action="PersonaCtrol">

          <p>
            <input name="id" type="text" id="id" size="22" required="required"/>
            Identificacion
          </p>
          <p>
            <input type="text" name="nombre" id="nombre" value="" size="22" />
            Nombre
          </p>
          <p>
            <input type="text" name="apellido" id="apellido" value="" size="22" />
            Apellido
          </p>
          <p>
            <input type="text" name="telefono fijo" id="telefono fijo" value="" size="22" />
            Telefono fijo
          </p>
          <p>
            <input type="text" name="fecha nacimiento" id="fecha nacimiento" value="" size="22" />
            Fecha nacimiento
          </p>
          
          <p>
            <input type="text" name="cedula" id="cedula" value="" size="22" />
            cedula
          </p>
          
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>
            <label for="comment" style="display:none;"><small>Comment (required)</small></label>
          </p>
          <p>
                                          <input type="submit" name="btnSubmit" id="btnSubmit" value="<%=Title %>"/>
                                        <input type="button" name="btnSalir" id="btnSalir" value="Salir" />
                                      </p>
          
          <%
                                        if(request.getParameter("msg")!=null){
                                            out.print("<div style=\"color: red\">" + request.getParameter("msg") + "</div>");
                                        }
                                       %> 
          <p>&nbsp;</p>
        </form>
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

