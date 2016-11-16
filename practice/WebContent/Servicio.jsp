<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consumir Servicio</title>
	</head>
	<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
	<body>
	<h2>Registrar Usuario</h2>
<form action="ServicioControlador" method="POST"> 
	<p>Ingrese el ID: <input type="text" name="id" value="<%=request.getParameter("id")!=null?request.getParameter("id"):""%>"  />
	<p>Ingrese el Nombre: <input type="text" name="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"  />
	<p>Ingrese el Direccion: <input type="text" name="direccion" value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>"  />
	<p>Ingrese el Telefono: <input type="text" name="telefono" value="<%=request.getParameter("telefono")!=null?request.getParameter("telefono"):""%>"  />
	<p>Ingrese el Correo:<input type="text" name="correo" value="<%=request.getParameter("correo")!=null?request.getParameter("correo"):""%>"  />
	<p>Ingrese el Password:<input type="text" name="password" value="<%=request.getParameter("password")!=null?request.getParameter("password"):""%>"  />
	<p>Ingrese el Fecha Nacimiento:<input type="text" name="fecha" value="<%=request.getParameter("fecha")!=null?request.getParameter("fecha"):""%>"  />
	<p><input type="submit" name="ingresar" value="Enviar" />
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
</body>
</html>
