<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Sala"%>
<%@page import="Clases.HorarioO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Horario Sala</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Actualice Horario de la Sala</h2>
	<form action ="ActualizacionSalasControlador" method="post">
Seleccione Sala: <select name="salas"> 
                    <%ArrayList<Sala> lista = (ArrayList<Sala>)request.getAttribute("salas");
                        for (Sala h : lista) {
                    %>
                    
                    <option value="<%=h.getSal_nombre()%>"><%=(h.getSal_nombre())%></option>
                    
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