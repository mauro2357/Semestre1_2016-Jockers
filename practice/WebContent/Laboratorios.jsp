<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registrar un laboratorio en la aplicacion</h1>
	<form action ="ServletLaboratorios" method="post">
	<p>Ingrese el bloque del laboratorio: <input type="text" name="blolab" value="<%=request.getParameter("blolab")!=null?request.getParameter("blolab"):""%>"  />
	<p>Ingrese el nombre del laboratorio: <input type="text" name="nomlab" value="<%=request.getParameter("nomlab")!=null?request.getParameter("nomlab"):""%>"  />	
	<p>Ingrese una breve descripcion acerca del laboratorio: <input type="text" name="labdesc" value="<%=request.getParameter("labdesc")!=null?request.getParameter("labdesc"):""%>"  />
	<p>Cuenta con VideoBeam o TV:
			Si:<input type="radio" name="labvideobeam" value="s" value="<%=request.getParameter("labvideobeam")!=null && request.getParameter("labvideobeam").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="labvideobeam" value="n" value="<%=request.getParameter("labvideobeam")!=null?request.getParameter("labvideobeam"):""%>" />
	<p><input type="submit" name="Ingresar" value="Ingresar Laboratorio"/>
	</form>

</body>
</html>