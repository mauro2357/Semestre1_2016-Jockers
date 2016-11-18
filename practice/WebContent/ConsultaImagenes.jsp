<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Imagen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Horarios de Laboratorios en UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<form action="ConsultaImagenesControlador" method="get">
<h1>Ver imagenes en UcoMaps</h1>
	<br>Ver Imagenes:<select name="imagenes"> 
                    <%ArrayList<Imagen> lista =  (ArrayList<Imagen>)request.getAttribute("imagenes");
                        for (Imagen h : lista) {
                    %>                    
                    <option value="<%=h.getPhoto()%>"><%=("Imagen: "+ h.getPhoto())%></option>
                  	<%}
                    %>
                </select><br>
                <br>
                <a href="Usuarios.jsp">Regrese al Menu Principal</a>
                </form>
                </body>
</html>