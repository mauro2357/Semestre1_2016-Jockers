<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subir una imagen en UcoMaps- Usuario</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Agregar una nueva imagen </h2>
<form action="ImagenesAdministradorControlador" method="post" enctype="multipart/form-data"> <br>
<p>Nombre:<input type="text"  name ="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"/><br/></p>
<p>Buscar:<input type ="file" name ="direccion"  value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>"/><br/> </p>
<input type="submit"name ="boton"value="Enviar"><br>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
</form>
</body>
</html>