<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registrar kiosco en la aplicacion</h1>
	<form action = "ServletKioscos" method="post">
	<p>Ingrese el bloque del kiosco: <input type="text" name="kiobloque" value="<%=request.getParameter("kiobloque")!=null?request.getParameter("kiobloque"):""%>"  />
	<p>Ingrese el nombre del kiosco: <input type="text" name="kionombre" value="<%=request.getParameter("kionombre")!=null?request.getParameter("kionombre"):""%>"  />	
	<p>Ingrese la capacidad del kiosco: <input type="text" name="kiocap" value="<%=request.getParameter("kiocap")!=null?request.getParameter("kiocap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Kiosco"/>
</form>
</body>
</html>