<%@page import="java.util.LinkedList"%>
<%@page import="Clases.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ubicacion de Laboratorios, Oficinas y Salas</title>
<link rel="stylesheet" type="text/css" href="style.css" media="screen"/>
</head>
<body>
<div id="wrapper">
<div id="page-bgtop">
<div id="content" style="padding-top:170px;padding-right:150px">
		<div id="sidebar">	
<table style = "width:100%">
            <thead>
            	<tr>
            	<th>Sala</th> 
				<th>Bloque</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Sala> lista = (LinkedList<Sala>)request.getAttribute("salas");
				for (int i=0;i<lista.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+lista.get(i).getSal_nombre()+"</td>");
				   out.println("<td>"+lista.get(i).getNombre_bloque()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table>
				</div>
			
			<div id="sidebar">
				<table style = "width:100%">
            <thead>
            	<tr>
            	<th>Oficina</th> 
				<th>Bloque</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Oficina> listab = (LinkedList<Oficina>)request.getAttribute("oficinas");
				for (int i=0;i<listab.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+listab.get(i).getOfi_nombre()+"</td>");
				   out.println("<td>"+listab.get(i).getNombre_bloque()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table>
				</div>
			
			<div id="sidebar">
				<table style = "width:100%">
            <thead>
            	<tr>
            	<th>Laboratorio</th> 
				<th>Bloque</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Laboratorio> listac = (LinkedList<Laboratorio>)request.getAttribute("laboratorios");
				for (int i=0;i<listac.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+listac.get(i).getLab_nombre()+"</td>");
				   out.println("<td>"+listac.get(i).getNombre_bloque()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table>
</div>
		<div style="clear: both;">&nbsp;</div>
		<a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
		</div>
	</div>
	</div><br>
</body>
</html>