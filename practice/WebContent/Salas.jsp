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
	<h2>Registre un centro de informatica</h2>
	<form action="SalasControlador" method ="post">
	<p>Ingrese el nombre del centro informatico: <input type="text" name="nomsala" value="<%=request.getParameter("nomsala")!=null?request.getParameter("nomsala"):""%>"  />	
	<br>	
	<br>Selecciones el Bloque:<select name="blosala"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>	
    <p>Ingrese el numero de equipos del centro informatico: <input type="text" name="equisala" value="<%=request.getParameter("equisala")!=null?request.getParameter("equisala"):""%>"  />
	<p>Cuenta con VideoBeam:
			Si:<input type="radio" name="salavideobeam" value="s" value="<%=request.getParameter("salavideobeam")!=null && request.getParameter("salavideobeam").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="salavideobeam" value="n" value="<%=request.getParameter("salavideobeam")!=null?request.getParameter("salavideobeam"):""%>" />
	<br>
	<br>Seleccione el horario del Centro Informatico:<select name="horasala"> 
                    <%ArrayList<HorarioO> listaHorarios = (ArrayList<HorarioO>)request.getAttribute("Horario");
                        for (HorarioO h : listaHorarios) {
                    %>                    
                    <option value="<%=h.getHorario_nombre()%>"><%=(h.getHorario_nombre()+", Desde"+ h.getHorario_inicio()+", Hasta"+ h.getHorario_fin())%></option>                    
                    <%}
                    %>
                </select><br>
	<p><input type="submit" name="Ingresar" value="Ingresar Sala"/>
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>