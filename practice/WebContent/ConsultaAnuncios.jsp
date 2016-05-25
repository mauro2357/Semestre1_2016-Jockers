<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.LinkedList"%>
<%@page import="Clases.Anuncios"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Anuncios UcoMaps</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Si quieres anunciar puedes hacerlo por UcoMaps</h1>
<a href="Anuncios.jsp">Envie su Anuncio</a>
<table style = "width:100%">
            <thead>
            	<tr>
				<th>Anuncio</th> 
				<th>Descripción</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Anuncios> lista = (LinkedList<Anuncios>)request.getAttribute("anuncios");
				for (int i=0;i<lista.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+lista.get(i).getTitulo_anuncio());
				   out.println("<td>"+lista.get(i).getDescripcion_anuncio()+"</td>");
				   out.println("</tr>");
				}
				%>
				  </tbody>
				</table>
  <style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: center;
}
</style>
</body>
<a href="Usuarios.jsp">Regrese al Menu Principal</a>
</html>