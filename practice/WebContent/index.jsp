
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMaps-En construccion</title>
	</head>
	<body>
	<h1>Registrar nuevo bloque en UCOMAPS</h1>
<form action="ServletBloques" method="POST"> 
	<p>Ingrese el nombre del bloque: <input type="text" name="nombloque" value="<%=request.getParameter("nombrebloque")!=null?request.getParameter("nombloque"):""%>"  />
	<p>Ingrese el numero de pisos: <input type="text" name="numpiso" value="<%=request.getParameter("numpisos")!=null?request.getParameter("numpisos"):""%>"  />
	<p>Ingrese el numero de aulas: <input type="text" name="numaulas" value="<%=request.getParameter("numaulas")!=null?request.getParameter("numaulas"):""%>"  />
	<p>Ingrese el numero de laboratorios y/o salas: <input type="text" name="numlabsalas" value="<%=request.getParameter("numlabsalas")!=null?request.getParameter("numlabsalas"):""%>"  />
	<p>Ingrese el numero de oficinas y facultades que tiene:<input type="text" name="oficinasfacultades" value="<%=request.getParameter("oficinasfacultades")!=null?request.getParameter("oficinasfacultades"):""%>"  />
	<p>Ingrese el numero de ba�os:<input type="text" name="numbanos" value="<%=request.getParameter("numbanos")!=null?request.getParameter("numbanos"):""%>"  />
	<p>Cuenta con oratorios:
			Si:<input type="radio" name="oratorios" value="s" value="<%=request.getParameter("oratorios")!=null && request.getParameter("oratorios").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="oratorios" value="n" value="<%=request.getParameter("oratorios")!=null?request.getParameter("oratorios"):""%>" />
	<p>Cuenta con zonas de parqueo:
			Si:<input type="radio" name="parqueo" value="s" value="<%=request.getParameter("parqueo")!=null && request.getParameter("parqueo").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="parqueo" value="n" value="<%=request.getParameter("parqueo")!=null?request.getParameter("parqueo"):""%>" />		
	<p>Cuenta con zonas de estudio:
			Si:<input type="radio" name="estudio" value="s" value="<%=request.getParameter("estudio")!=null && request.getParameter("estudio").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="estudio" value="n" value="<%=request.getParameter("estudio")!=null?request.getParameter("estudio"):""%>" />
	 <p><input type="submit" name="ingresar" value="Ingresar Bloque" />
</form>
</body>
</html>
