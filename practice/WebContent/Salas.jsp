<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-MAPS en construccion</title>
</head>
<body>
	<h1>Registre un centro de informatica</h1>
	<form action="ServletSalas" method ="post">
	<p>Ingrese el bloque del centro informatico: <input type="text" name="blosala" value="<%=request.getParameter("blosala")!=null?request.getParameter("blosala"):""%>"  />
	<p>Ingrese el nombre del centro informatico: <input type="text" name="nomsala" value="<%=request.getParameter("nomsala")!=null?request.getParameter("nomsala"):""%>"  />	
	<p>Ingrese el numero de equipos del centro informatico: <input type="text" name="equisala" value="<%=request.getParameter("equisala")!=null?request.getParameter("equisala"):""%>"  />
	<p>Cuenta con VideoBeam:
			Si:<input type="radio" name="salavideobeam" value="s" value="<%=request.getParameter("salavideobeam")!=null && request.getParameter("salavideobeam").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="salavideobeam" value="n" value="<%=request.getParameter("salavideobeam")!=null?request.getParameter("salavideobeam"):""%>" />
	
	<p>Ingrese la hora de apertura del centro informatico: <input type="text" name="apesala" value="<%=request.getParameter("apesala")!=null?request.getParameter("apesala"):""%>"  />
	<p>Ingrese la hora de cierre del centro informatico: <input type="text" name="ciesala" value="<%=request.getParameter("ciesala")!=null?request.getParameter("eciesala"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Sala"/>
</form>
</body>
</html>