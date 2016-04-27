<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enviar Sugerencias</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
	<h1>Envie sus sugerencias a UcoMaps</h1>
	<form action ="ReporteControlador" method="post">
	<p>Seleccione:<br>
	Sugerencia: <input type="radio" name="dato" value="Sugerencia" value="<%=request.getParameter("dato")!=null && request.getParameter("dato").equals("Sugerencia")?"selected='selected'":""%>" checked="checked"/><br>    
	Fallo: <input type="radio" name="dato" value="Fallo" value="<%=request.getParameter("dato")!=null?request.getParameter("dato"):""%>" /><br>	
	
	<p>Ingrese su sugerencia o reporte un fallo:<br>
	<br><textarea name="sugrep" rows="10" cols="30"></textarea>
	<br/>
	<p>Ingrese su correo electronico para obtener respuesta: <input type="text" name="sugcorreo" value="<%=request.getParameter("sugcorreo")!=null?request.getParameter("sugcorreo"):""%>"  />		
	<p>Seleccione tipo de Usuario:<br>
	Docente: <input type="radio" name="datou" value="Docente" value="<%=request.getParameter("datou")!=null && request.getParameter("datou").equals("Docente")?"selected='selected'":""%>" checked="checked"/><br>    
	Estudiante: <input type="radio" name="datou" value="Estudiante" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
	Otro: <input type="radio" name="datou" value="Otro" value="<%=request.getParameter("datou")!=null?request.getParameter("datou"):""%>" /><br>	
	<p><input type="submit" name="Ingresar" value="Enviar"/>
</form>
<a href="Usuarios.jsp">Regrese al Menu Principal</a>
<% request.getAttribute("estado"); %>
</body>
</html>