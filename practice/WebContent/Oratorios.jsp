<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registrar oratorio en la aplicacion</h1>
	<form action ="ServletOratorios" method="post">
	<p>Ingrese el bloque del oratorio: <input type="text" name="orabloque" value="<%=request.getParameter("orabloque")!=null?request.getParameter("orabloque"):""%>"  />
	<p>Ingrese el nombre del oratorio: <input type="text" name="oranombre" value="<%=request.getParameter("oranombre")!=null?request.getParameter("oranombre"):""%>"  />	
	<p>Ingrese la capacidad del oratorio: <input type="text" name="oratcap" value="<%=request.getParameter("oratcap")!=null?request.getParameter("oratcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Oratorio"/>
</form>
</body>
</html>