<%@page import="java.util.ArrayList"%>
<%@page import="Clases.PuntoReferencia"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Genere Rutas en UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Genere la ruta hacia los diferentes Bloques</h2><br>	
<form action ="ConsultaRutasMapaControlador" method="post">
Seleccione Ruta: <select name="rutas"> 
                    <%ArrayList<PuntoReferencia> lista = (ArrayList<PuntoReferencia>)request.getAttribute("rutas");
                        for (PuntoReferencia h : lista) {
                    %>                    
                    <option value="<%=h.getRuta()%>"><%=(h.getRuta())%></option>                    
                    <%}
                    %>
                </select><br>
                <br>
                <p><input type="submit" name="Generar" value="Generar"/><br><br>
                <a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
                </body>
</html>