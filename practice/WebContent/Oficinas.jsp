<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-MAPS en construccion</title>
</head>
<body>
	<h1>Registre oficinas en la aplicacion</h1>
	<form action="ServletOficinas" method="post">
	<p>Ingrese el bloque de la oficina: <input type="text" name="ofibloque" value="<%=request.getParameter("ofibloque")!=null?request.getParameter("ofibloque"):""%>"  />
	<p>Ingrese el nombre de la oficina: <input type="text" name="ofinombre" value="<%=request.getParameter("ofinombre")!=null?request.getParameter("ofinombre"):""%>"  />	
	<p>Ingrese el telefono de la oficina: <input type="text" name="ofitel" value="<%=request.getParameter("ofitel")!=null?request.getParameter("ofitel"):""%>"  />
	<p>Ingrese la hora de apertura  de la oficina: <input type="text" name="ofiape" value="<%=request.getParameter("ofiape")!=null?request.getParameter("ofiape"):""%>"  />
	<p>Ingrese la hora de cierre de la oficina: <input type="text" name="oficie" value="<%=request.getParameter("oficie")!=null?request.getParameter("oficie"):""%>"  />
	<p>Ingrese una breve descripcion de la oficina: <input type="text" name="ofidesc" value="<%=request.getParameter("ofidesc")!=null?request.getParameter("ofidesc"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Oficina"/>	
</form>
</body>
</html>