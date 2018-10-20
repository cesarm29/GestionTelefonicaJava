<%-- 
    Document   : equipo
    Created on : 17/11/2013, 09:19:14 PM
    Author     : cesar1
--%>
<%@page import="Modelo.EquipoDAO"%>
<%@page import="Modelo.EquipoDTO"%>

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
EquipoDTO contrados = new EquipoDTO();
String accion = request.getParameter("Accion");
String id = request.getParameter("ID");
if((accion.equals("Eliminar") || accion.equals("Editar")) && !(id.equals(""))){
    if(accion.equals("Editar"))Title = "Modificar"; else Title = "Eliminar";
    EquipoDAO d = new EquipoDAO();
    try{
    contrados =  d.getPorID(Integer.parseInt(id));
    }catch(Exception ex){
        out.print("$('#divError').html(\"<h5>" +ex.getMessage() + "</h5>\");");
    }
%>
    establecer("EQUSERIAL", "<%=contrados.getEQUSERIAL()%>");
    establecer("LINUMEROLINEA", "<%=contrados.getLINUMEROLINEA()%>");
    establecer("EQUMARCA", "<%=contrados.getEQUMARCA()%>");
    establecer("EQUDESCRIPCION", "<%=contrados.getEQUDESCRIPCION()%>");
    establecer("EQUESTADO", "<%=contrados.getEQUESTADO()%>");
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
      <h1>Equipo</h1>
      <div id="respond">
        <form id="formInscripcion" method="post" action="ControlEquipo">

          <p> 
            Serial Equipo
            </br>
            <input type="text" name="EQUSERIAL" id="EQUSERIAL" value="" size="22" />   
          </p>
          <p>  
            Numero de linea
            </br>
            <input type="text" name="LINUMEROLINEA" id="LINUMEROLINEA" value="" size="22" />
          </p>
          <p>
            Marca Equipo
            </br>
            <input type="text" name="EQUMARCA" id="EQUMARCA" value="" size="22" />
          </p>
          <p>
            Descripcion Equipo
            </br>
            <input type="text" name="EQUDESCRIPCION" id="EQUDESCRIPCION" value="" size="22" /> 
          </p>
          
          <p>
            Estado Equipo
            </br>
            <input type="text" name="EQUESTADO" id="EQUESTADO" value="" size="22" />
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
