<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
	<h1>Registre la facultad en la aplicacion</h1>
	<form action="FacultadControlador" method="post">
	<p>Ingrese el nombre de la facultad: <input type="text" name="facunombre" value="<%=request.getParameter("facunombre")!=null?request.getParameter("facunombre"):""%>"  />
	<br>	
	<br>Selecciones el Bloque:<select name="facubloque"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>	
	<p>Ingrese el telefono de la facultad: <input type="text" name="facutel" value="<%=request.getParameter("facutel")!=null?request.getParameter("facutel"):""%>"  />
	<p>Ingrese el horario de la facultad: <input type="text" name="facuhora" value="<%=request.getParameter("facuhora")!=null?request.getParameter("facuhora"):""%>"  />
	<p>Ingrese una breve descripcion acerca de la facultad: <input type="text" name="facudesc" value="<%=request.getParameter("facudesc")!=null?request.getParameter("facudesc"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Facultad"/>	
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>