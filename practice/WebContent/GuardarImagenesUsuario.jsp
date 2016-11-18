<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Imagen</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Agregar una nueva imagen </h2><br>
<form method="post"  action="ImagenesUsuarioControlador" enctype="multipart/form-data">
<p>Tu Nombre:<input type="text"  name ="usuario" value="<%=request.getParameter("usuario")!=null?request.getParameter("usuario"):""%>"  /><br/></p>
<p>Tu Correo:<input type="text"  name ="correo" value="<%=request.getParameter("correo")!=null?request.getParameter("correo"):""%>"  /><br/></p>
<p>Nombre de la imagen:<input type="text"  name ="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"  /><br/></p>
<p>Buscar:<input type="file" name ="direccion" value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>"  /><br/> </p>
<input type="submit" name ="Enviar" value="Enviar Imagen"><br/>
<br><a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
</form>
</body>
</html>