<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Anuncios en UcoMaps</title>
	<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
	</head>
	<body>	
	<div class="post">	
	<h2>Registra tu negocio o asunto en UCOMAPS</h2><br>
<form action="AnuncioControlador" method="POST">
	<p>Ingrese el titulo del anuncio: <input type="text" name="nomanuncio" value="<%=request.getParameter("nomanuncio")!=null?request.getParameter("nomanuncio"):""%>"  />
	<p>Ingrese la descripcion de su anuncio:<br>
	<br><textarea name="descanuncio" rows="10" cols="30"></textarea>
	<p><input type="submit" name="Ingresar" value="Enviar"/>
</form><br>
<a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
<% request.getAttribute("estado"); %>
</div>
</body>
</html>