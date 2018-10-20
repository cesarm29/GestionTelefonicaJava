<%-- 
    Document   : index
    Created on : 7/11/2013, 07:06:53 PM
    Author     : cesar1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
<head profile="http://gmpg.org/xfn/11">
<title>Telefonia movil</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>

</head>
<body>
<div class="wrapper col0">
  <div id="topbar">
    <div id="slidepanel">
      <div class="topbox">
        <h2>Registrese</h2>
        <p>Espacio para registrarse</p>
        <p class="readmore"><a href="formpersona.jsp">Registro</a></p>
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
        <li class="active"><a href="index.html">Inicio</a></li>
        <li><a href="style-demo.html">Contactenos</a></li>
        <li><a href="full-width.html">Full Width</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="featured_slide">
    <div class="featured_box"><a href="#"><img src="images/demo/Nueva carpeta/00092192_html_m510f4350.jpg" alt="" /></a>
      <div class="floater">
        <h2>Llena tu vida de Amigos de Todas Partes…</h2>
        <p> 
Estos planes te permiten llamar con los minutos incluidos en el plan al cualquier destino móvil o fijo nacional, a la misma tarifa.
 
•Planes con cargo fijo mensual desde $30.900 con IVA del 16% e Impoconsumo del 4% incluido.
•Planes que incluyen desde 180 hasta 1.760 minutos para hablar a Cualquier Destino Móvil o Fijo Nacional.
•Planes con hasta 6 Números Elegidos Todo Destino, para hablar gratis hasta 900 minutos.
•Con los Números Elegidos Todo Destino, podrás hablar gratis los primeros cinco minutos de cada llamada, de acuerdo a la cantidad de minutos gratis que incluye el plan seleccionado.
•Cuentan con hasta 200 Mensajes de Texto a móviles Claro de obsequio. La cantidad de mensajes de texto de obsequio, varía de acuerdo al plan que selecciones.
•El valor del minuto adicional es igual al incluido en los planes abiertos.</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/Nueva carpeta/126893-787-550.jpg" alt="" /></a>
      <div class="floater">
        <h2>Planes de voz y datos</h2>
        <p>Planes con cargo fijo mensual desde $58.800 con IVA del 16% e Impoconsumo del 4% incluido.
Planes incluyen más minutos para hablar a cualquier destino fijo o móvil nacional desde 190 hasta 485 minutos.
Planes con hasta 3 Números Elegidos Todo Destino, para hablar gratis hasta 450 minutos. De acuerdo al plan seleccionado.
Con los Números Elegidos Todo Destino, podrás hablar gratis los primeros cinco minutos de cada llamada, de acuerdo a la cantidad de minutos gratis que incluye el plan seleccionado.
Planes con hasta 150 Mensajes de Texto a móviles Claro de obsequio.
Planes con capacidad de 1.2GB ó 2.4GB de Full Navegación.
</p>
              </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/Nueva carpeta/telefonia_celular.jpg" alt="" /></a>
      <div class="floater">
        <h2>Capacidad de Navegacion</h2>
        <p>Con la capacidad de navegación incluida en el plan podrás navegar a una mayor velocidad. Hasta 5 Mbps (Megabits por Segundo).
Una vez consumida la capacidad incluida del plan, los clientes de planes IPhone, Smartphone o BlackBerry  serán direccionados al Portal Servicios de Navegación y podrán elegir:
Acceder  sin costo a los servicios de Chat, Mail y Redes Sociales en planes IPhone y Smartphone o a los servicios de Chat y Redes Sociales en los planes BlackBerry.
Comprar paquetes de navegación adicionales con cargo a su factura.
Navegar por demanda a $ 0.39 IVA incluido por Kb Adicional.</p></div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/Nueva carpeta/telefonia_movil_getty_260813_0.jpg" alt="" /></a>
      <div class="floater">
        <h2>Planes Paquetes y datos</h2>
        <p>Con la navegación incluida en el plan o paquete podrás navegar donde quieras y descargar lo que quieras a una velocidad Máxima de Hasta 5 Megabits por Segundo (Mbps)
Planes:
Con los planes Navegación, podrás disfrutar al máximo de tus Páginas Favoritas, acceder a tus Cuentas de Correo, disfrutar de tus Redes Sociales preferidas, ver Videos en Youtube y otras páginas, subir fotos, Escuchar y Descargar Música, y mucho más…
Activa tu equipo en uno de los siguientes planes de datos y podrás tener el servicio de datos y para utilizar el servicio de voz podrás realizar recargas en prepago a través de amigo Claro recarga a través de *600</p>
        <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
      </div>
    </div>
    <div class="featured_box"><a href="#"><img src="images/demo/Nueva carpeta/Telefonia-4G.jpg" alt="" /></a>
      <div class="floater">
        <h2>Consulta nuestros planes</h2>
        <p>Ingresa a nuestra aplicacion para consultar las tarifas planes y servicios que ofrecemos</p>
      </div>
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
  <div id="homecontent">
    <div class="fl_left">
      <div class="column2">
        <ul>
          <li>
            <h2>BlackBerry 9720</h2>
            <div class="imgholder"><img src="images/demo/Nueva carpeta/bb_9720_grandeweb.jpg" alt="" /></div>
            <p>N</p>
            <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
          </li>
          <li class="last">
            <h2>Lipsum</h2>
            <div class="imgholder"><img src="images/demo/Nueva carpeta/BlackBerry_Q10_grandeweb.jpg" alt="" /></div>
            <p>N</p>
            <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
          </li>
        </ul>
        <br class="clear" />
      </div>
      <div class="column2">
        <h2>&nbsp;</h2>
      </div>
    </div>
    <div class="fl_right">
      <h2>Equipos recomendados</h2>
      <ul>
        <li>
          <div class="imgholder"><a href="#"><img src="images/demo/Nueva carpeta/iPhone5C_green_grandeweb.jpg" alt="" /></a></div>
          <p><strong><a href="#">Atnatis dolor tincidunt nulla</a></strong></p>
          <p>Equipo disponible para la venta</p>
        </li>
        <li>
          <div class="imgholder"><a href="#"><img src="images/demo/Nueva carpeta/iPhone5C_rosa32GBgrandeweb.jpg" alt="" /></a></div>
          <p><strong><a href="#">Atnatis dolor tincidunt nulla</a></strong></p>
          <p>Equipo disponible para la venta</p>
        </li>
        <li>
          <div class="imgholder"><a href="#"><img src="images/demo/Nueva carpeta/nokia_lumia_1020_grandeweb.jpg" alt="" /></a></div>
          <p><strong><a href="#">Atnatis dolor tincidunt nulla</a></strong></p>
          <p>Equipo disponible para la venta</p>
        </li>
        <li>
          <div class="imgholder"><a href="#"><img src="images/demo/Nueva carpeta/samsungG_s4_azul_grande.jpg" alt="" /></a></div>
          <p><strong><a href="#">Samsung s4</a></strong></p>
          <p>Equipo disponible para la venta</p>
        </li>
        <li class="last">
          <div class="imgholder"><a href="#"><img src="images/demo/Nueva carpeta/ZTE_open_grandeweb.jpg" alt="" /></a></div>
          <p><strong><a href="#">ZTE Open Azul</a></strong></p>
          <p>Equipo disponible para la venta</p>
        </li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="footer">
    
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
  <div id="copyright">
    <p class="fl_left">Copyright &copy; 2011 - All Rights Reserved - <a href="#">Cesar mayorga</a></p>
    <p class="fl_right">Template by cesar</p>
    <br class="clear" />
  </div>
</div>
</body>
</html>
