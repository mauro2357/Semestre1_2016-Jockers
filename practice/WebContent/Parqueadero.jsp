<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registre un parqueadero en la aplicacion</h1>
	<form action="ServletParqueaderos" method="post">
	<p>Ingrese el bloque del parqueadero: <input type="text" name="parbloque" value="<%=request.getParameter("parbloque")!=null?request.getParameter("parbloque"):""%>"  />
	<p>Ingrese el nombre del parqueadero: <input type="text" name="parnombre" value="<%=request.getParameter("parnombre")!=null?request.getParameter("parnombre"):""%>"  />	
	<p>Ingrese la capacidad del parqueadero: <input type="text" name="parcap" value="<%=request.getParameter("parcap")!=null?request.getParameter("parcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Parqueadero"/>
</form>	
</body>
</html>