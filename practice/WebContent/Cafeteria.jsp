<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registre la cafeteria en la aplicacion</h1>
	<form action="ServletCafeteria" method ="post">
	<p>Ingrese el bloque de la cafeteria: <input type="text" name="cafbloque" value="<%=request.getParameter("cafbloque")!=null?request.getParameter("cafbloque"):""%>"  />
	<p>Ingrese el nombre de la cafeteria: <input type="text" name="cafnombre" value="<%=request.getParameter("cafnombre")!=null?request.getParameter("cafnombre"):""%>"  />	
	<p>Ingrese la capacidad de la cafeteria: <input type="text" name="cafcap" value="<%=request.getParameter("cafcap")!=null?request.getParameter("cafcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Cafeteria"/>
</form>
</body>
</html>