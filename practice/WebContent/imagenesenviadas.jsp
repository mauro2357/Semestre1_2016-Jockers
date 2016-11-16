<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>enviar imagenes</title>
</head>
<body>
<h2>sugerir una nueva imagen </h2>
<div class="caja">
<form method="post"  action="ImagenesSugeridasControlador"  enctype="multipar/form-data">
<p> ingrese un nombre a la imagen <input type="text"  name ="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"  /> /><br/></p>

<p>buscar la direccion<input type ="file" name ="direccion"  value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>"  />/><br/> </p>
<p>ingrese su correo<input type ="text" name ="correo"  value="<%=request.getParameter("correo")!=null?request.getParameter("correo"):""%>"  />/><br/> </p>
<p>Seleccione tipo de Usuario:<br>
	Docente: <input type="radio" name="datou" value="Docente" value="<%=request.getParameter("datou")!=null && request.getParameter("datou").equals("Docente")?"selected='selected'":""%>" checked="checked"/><br>    
	Estudiante: <input type="radio" name="datou" value="Estudiante" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
	Otro: <input type="radio" name="datou" value="Otro" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
	
	<input type="submit" name="Ingresar" />

<a href="MenuPrincipal.html">Regrese al Menu Principal</a>

<p>la imagen sera revisada y si cumple con los requerimientos manejados por el sistema sera incluida proximamente en la aplicacion
gracias por sus aportes</p>
</form>
 </div>

</body>
</html>