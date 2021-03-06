<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@page import="Clases.HorarioO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-MAPS en construccion</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
	<h2>Registre oficinas en la aplicacion</h2>
	<form action="OficinasControlador" method="post">
	<p>Ingrese el nombre de la oficina: <input type="text" name="ofinombre" value="<%=request.getParameter("ofinombre")!=null?request.getParameter("ofinombre"):""%>"  />	
	<br>
	<br>Selecciones el Bloque: <select name="ofibloque"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>		
<p>Ingrese el telefono de la oficina: <input type="text" name="ofitel" value="<%=request.getParameter("ofitel")!=null?request.getParameter("ofitel"):""%>"  />
<br>
<br>Seleccione el horario de la oficina:<select name="horaofi"> 
                    <%ArrayList<HorarioO> listaHorarios = (ArrayList<HorarioO>)request.getAttribute("Horario");
                        for (HorarioO h : listaHorarios) {
                    %>                    
                    <option value="<%=h.getHorario_nombre()%>"><%=(h.getHorario_nombre()+", Desde"+ h.getHorario_inicio()+", Hasta"+ h.getHorario_fin())%></option>                    
                    <%}
                    %>
                </select><br>
	<p>Ingrese una breve descripcion de la oficina: <input type="text" name="ofidesc" value="<%=request.getParameter("ofidesc")!=null?request.getParameter("ofidesc"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Oficina"/>	
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>