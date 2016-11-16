<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Oficina"%>
<%@page import="Clases.Sala"%>
<%@page import="Clases.Laboratorio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Consulte Horarios</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />

</head>
<body>
<div id="wrapper">
<div id="page-bgtop">
<div id="content" style="padding-top:170px;padding-right:150px">
		<div id="sidebar">			
			<h2>Horarios Oficinas</h2>
				<br>Seleccione Oficina:<select name="oficina"> 
                    <%ArrayList<Oficina> lista = (ArrayList<Oficina>)request.getAttribute("oficinas");
                        for (Oficina h : lista) {
                    %>
                    
                    <option value="<%=h.getOfi_nombre()%>"><%=(h.getOfi_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                    
                    <%}
                    %>
                </select><br>	
			</div>
			
			<div id="sidebar">
			
					<h2>Horarios Salas</h2>
				<br>Seleccione Sala:<select name="sala"> 
                    <%ArrayList<Sala> listab =  (ArrayList<Sala>)request.getAttribute("salas");
                        for (Sala h : listab) {
                    %>
                    <option value="<%=h.getSal_nombre()%>"><%=(h.getSal_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                  	<%}
                    %>
                </select><br>
                <br>
			</div>
			
			<div id="sidebar">		
				<h2>Horarios Laboratorios</h2>
					<br>Seleccione Laboratorio:<select name="laboratorios"> 
                    <%ArrayList<Laboratorio> listac =  (ArrayList<Laboratorio>)request.getAttribute("laboratorios");
                        for (Laboratorio h : listac) {
                    %>
                    
                    <option value="<%=h.getLab_nombre()%>"><%=(h.getLab_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                  	<%}
                    %>
                </select><br>
                <p>
                
                
			</div>
		<div style="clear: both;">&nbsp;</div>
		<a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
		</div>
	</div>
	</div><br>
</body>
</html>