<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.LinkedList"%>
<%@page import="Clases.Imagen"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imagenes UcoMaps</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Imagenes UcoMaps</h2>
<table style = "width:100%">
            <thead>
            	<tr>
				<th>Nombre</th> 
				<th>Imagen</th>
				</tr>
				      </thead>
				       <tbody>
				<%
				LinkedList<Imagen> lista = (LinkedList<Imagen>)request.getAttribute("imagenes");
				for (int i=0;i<lista.size();i++)
				{
				   out.println("<tr>");
				   out.println("<td>"+lista.get(i).getNombre());
				   out.println("<td>"+lista.get(i).getdireccion()+"</td>");
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