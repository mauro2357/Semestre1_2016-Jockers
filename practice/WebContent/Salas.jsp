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
	<p>Ingrese el bloque del centro informatico: <input type="text" name="nomsala" value="<%=request.getParameter("nomsala")!=null?request.getParameter("nomsala"):""%>"  />
	
</form>

</body>
</html>