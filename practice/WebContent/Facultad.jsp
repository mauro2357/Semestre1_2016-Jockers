<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registre la facultad en la aplicacion</h1>
	<form action="ServletFacultad" method="post">
	<p>Ingrese el bloque de la facultad: <input type="text" name="facubloque" value="<%=request.getParameter("facubloque")!=null?request.getParameter("facubloque"):""%>"  />
	<p>Ingrese el nombre de la facultad: <input type="text" name="facunombre" value="<%=request.getParameter("facunombre")!=null?request.getParameter("facunombre"):""%>"  />
	<p>Ingrese el telefono de la facultad: <input type="text" name="facutel" value="<%=request.getParameter("facutel")!=null?request.getParameter("facutel"):""%>"  />
	<p>Ingrese la hora de apertura de la facultad: <input type="text" name="facuape" value="<%=request.getParameter("facuape")!=null?request.getParameter("facuape"):""%>"  />
	<p>Ingrese la hora de cierre de la facultad: <input type="text" name="facucie" value="<%=request.getParameter("facucie")!=null?request.getParameter("facucie"):""%>"  />
	<p>Ingrese una breve descripcion acerca de la facultad: <input type="text" name="facudesc" value="<%=request.getParameter("facudesc")!=null?request.getParameter("facudesc"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Facultad"/>	
</form>
</body>
</html>