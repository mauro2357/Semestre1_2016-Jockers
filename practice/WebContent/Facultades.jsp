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
	<form action ="ServletFacultades" method= "post">
	<p>Ingrese el bloque de la facultad: <input type="text" name="facbloque" value="<%=request.getParameter("facbloque")!=null?request.getParameter("facbloque"):""%>"  />
	<p>Ingrese el nombre de la facultad: <input type="text" name="facnombre" value="<%=request.getParameter("facnombre")!=null?request.getParameter("facnombre"):""%>"  />	
	<p>Ingrese el telefono de la facultad: <input type="text" name="factel" value="<%=request.getParameter("factel")!=null?request.getParameter("factel"):""%>"  />
	<p>Ingrese el horario de la facultad: <input type="text" name="fachora" value="<%=request.getParameter("fachora")!=null?request.getParameter("fachora"):""%>"  />
	<p>Ingrese una breve descripcion de la facultad: <input type="text" name="facdesc" value="<%=request.getParameter("facdesc")!=null?request.getParameter("facdesc"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Facultad"/>	
	
</form>
</body>
</html>