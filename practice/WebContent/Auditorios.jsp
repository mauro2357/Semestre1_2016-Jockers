<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-MAPS en construccion</title>
</head>
<body>
	<h1>Registre un auditorio en la aplicacion</h1>
	<form action ="ServletAuditorios" method="post">
	<p>Ingrese el bloque del auditorio: <input type="text" name="audbloque" value="<%=request.getParameter("audbloque")!=null?request.getParameter("audbloque"):""%>"  />
	<p>Ingrese el nombre del auditorio: <input type="text" name="audnombre" value="<%=request.getParameter("audnombre")!=null?request.getParameter("audnombre"):""%>"  />	
	<p>Ingrese la capacidad del auditorio: <input type="text" name="audcap" value="<%=request.getParameter("audcap")!=null?request.getParameter("audcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Auditorio"/>
</form>
</body>
</html>