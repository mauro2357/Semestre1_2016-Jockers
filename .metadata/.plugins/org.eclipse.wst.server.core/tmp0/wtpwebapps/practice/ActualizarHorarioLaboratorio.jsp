<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Laboratorio"%>
<%@page import="Clases.HorarioO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Horario Laboratorio</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Actualice Horario del Laboratorio</h1>
<form action ="ActualizacionLaboratoriosControlador" method="post">
Seleccione Laboratorio: <select name="laboratorio"> 
                    <%ArrayList<Laboratorio> lista = (ArrayList<Laboratorio>)request.getAttribute("laboratorio");
                        for (Laboratorio h : lista) {
                    %>                    
                    <option value="<%=h.getLab_nombre()%>"><%=(h.getLab_nombre())%></option>                    
                    <%}
                    %>
                </select><br>
                <br>

Seleccione Nuevo Horario: <select name="horario"> 
                    <%ArrayList<HorarioO> listaa = (ArrayList<HorarioO>)request.getAttribute("horario");
                        for (HorarioO h : listaa) {
                    %>                    
                    <option value="<%=h.getHorario_nombre()%>"><%=(h.getHorario_nombre()+", Desde: "+ h.getHorario_inicio()+", Hasta: "+ h.getHorario_fin())%></option>                    
                    <%
                    }
                    %>
                    </select><br>  
                    <p><input type="submit" name="Actualizar" value="Actualizar"/>
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>  

</body>
</html>