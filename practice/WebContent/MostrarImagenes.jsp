<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Imagen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Monstrar Imagenes</title>



</head>
<body>
<table style = "width:50%">      
	<tbody>
	<%Imagen imagen = (Imagen) request.getAttribute("nombre");{				  
	out.println("<br>"+"nombre: " +imagen.getNombre()+"</td>");
	out.println("<br>"+"imagen: "+imagen.getdireccion()+"</td>");
	
	}%>
	</tbody>
</table>





</body>
</html>