<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.LinkedList"%>
<%@page import="Clases.Anuncios"%>
<%@page import="Clases.Imagen"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UcoMaps</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="wrapper">
	<div id="logo">
		<h1>UcoMaps</h1>
		<p><em>Aplicación<a href="http://www.freecsstemplates.org/"></a></em></p>
	</div>
	<hr />
	<!-- end #logo -->
	<div id="header">
		<div id="menu">
			<ul>
				<li><a href="ConsultaPuntos.jsp">Mapas</a></li>
				<li><a href="ConsultaRutasMapaControlador">Rutas</a></li>
				<li><a href="ConsultaHorariosControlador">Horarios</a></li>
				<li><a href="ConsultaLugaresControlador">Ubicación Lugares</a></li>
				<li><a href="InformacionLugaresControlador">Información</a></li>
				<li><a href="Reportes.jsp">Contacto</a></li>
				<li><a href="Administrador.jsp">Login</a></li>
			</ul>
		</div>
		<!-- end #menu -->
	</div>
	<!-- end #header -->
	<!-- end #header-wrapper -->
	<div id="page">
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
				<h2 class="title">UcoMaps, un proyecto por y para estudiantes Uconianos.</h2>
				<div class="entry">		   
			    <div id="map" style="width:100%;height:200px;width:700px"></div>	
				<script type="text/javascript">
				function myMap() {
				  var mapCanvas = document.getElementById("map");
				  var mapOptions = {
				    center: new google.maps.LatLng(6.150097, -75.366369),
				    zoom:16
				  };
				  var map = new google.maps.Map(mapCanvas, mapOptions);
				}
				</script>
				<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDdXWWU2BPWI7i2_6UPhZM9Ru5nfGtU23w&callback=myMap"></script>				
			    <br><p>Gracias por usar la aplicación, próximamente disponible para móviles.</p>
			  	</div>
			</div>
			<div class="post">
			  <h2 class="title"><a href="#">Galería de Imágenes</a></h2>
					  <table style = "width:100%">
            <thead>
            	<tr>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Imagen> lista = (LinkedList<Imagen>)request.getAttribute("imagenes");
				for (int i=0;i<lista.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+lista.get(i).getPhoto()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table>
				<br><a href="GuardarImagenesUsuario.jsp">Envíe sus imágenes</a>
			  </div>
			</div>
	</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<h2>Anuncios</h2>
			<table style = "width:100%">						
            <thead>
            	<tr>
				<th>Anuncio</th> 
				<th>Descripción</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Anuncios> listaa = (LinkedList<Anuncios>)request.getAttribute("anuncios");
				for (int i=0;i<listaa.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+listaa.get(i).getTitulo_anuncio());
				   out.println("<td>"+listaa.get(i).getDescripcion_anuncio()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table><br>
				<a href='Anuncios.jsp'>Envíe su anuncio. Clic aquí</a><br><br>		
					<h2>Aliados</h2>
					<ul>
						<li><a href="http://www.uco.edu.co/Paginas/home.aspx">Universidad Católica de Oriente</a></li>
						<li><a href="https://www.facebook.com/isuco/?fref=ts">Ingeniería de Sistemas Uco</a></li>
						<li><a href="https://developers.google.com/maps/?hl=es-419">API de Google Maps</a></li>
					</ul>
				</li>
			</ul>
			</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	</div>
	<!-- end #page -->
</html>
