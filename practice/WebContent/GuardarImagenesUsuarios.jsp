<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enviar Imagen</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Enviar Imagen a la Aplicación</h1>
<div class="caja">
<form method="post"  action="ImagenesSugeridasControlador"  enctype="multipar/form-data">
<p>Nombre:<input type="text"  name ="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"/><br/></p>
<p>Buscar:<input type ="file" name ="direccion"  value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>" /><br/> </p>
<p>Ingrese su Email:<input type ="text" name ="correo"  value="<%=request.getParameter("correo")!=null?request.getParameter("correo"):""%>" /><br/> </p>
<p>Seleccione tipo de Usuario:<br>
	Docente: <input type="radio" name="datou" value="Docente" value="<%=request.getParameter("datou")!=null && request.getParameter("datou").equals("Docente")?"selected='selected'":""%>" checked="checked"/><br>    
	Estudiante: <input type="radio" name="datou" value="Estudiante" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
	Otro: <input type="radio" name="datou" value="Otro" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
<p>La imagen sera revisada y si cumple con los requerimientos manejados por el sistema sera incluida proximamente en la aplicación. Gracias por su aporte</p>	
	<input type="submit" name="Ingresar"value="Enviar"/><br>
<a href="Usuarios.jsp">Regrese al Menu Principal</a>
</form>
</div>
</body>
</html>