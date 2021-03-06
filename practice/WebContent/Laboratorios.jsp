<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@page import="Clases.HorarioO"%>
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
	<h2>Registrar un laboratorio en la aplicacion</h2>
	<form action ="LaboratoriosControlador" method="post">
	<p>Ingrese el nombre del laboratorio: <input type="text" name="nomlab" value="<%=request.getParameter("nomlab")!=null?request.getParameter("nomlab"):""%>"  />	
	<br>	
	<br>Selecciones el Bloque:<select name="blolab"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>	
<br>Seleccione el horario del Laboratorio:<select name="horalab"> 
                    <%ArrayList<HorarioO> listaHorarios = (ArrayList<HorarioO>)request.getAttribute("Horario");
                        for (HorarioO h : listaHorarios) {
                    %>                    
                    <option value="<%=h.getHorario_nombre()%>"><%=(h.getHorario_nombre()+", Desde"+ h.getHorario_inicio()+", Hasta"+ h.getHorario_fin())%></option>                    
                    <%}
                    %>
                </select><br>
	<p>Ingrese una breve descripcion acerca del laboratorio: <input type="text" name="labdesc" value="<%=request.getParameter("labdesc")!=null?request.getParameter("labdesc"):""%>"  />
	<p>Cuenta con VideoBeam o TV:
			Si:<input type="radio" name="labvideobeam" value="s" value="<%=request.getParameter("labvideobeam")!=null && request.getParameter("labvideobeam").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="labvideobeam" value="n" value="<%=request.getParameter("labvideobeam")!=null?request.getParameter("labvideobeam"):""%>" />
	<p><input type="submit" name="Ingresar" value="Ingresar Laboratorio"/>
	</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>