<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="BD.ConsultaOficinas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.OficinasAgregar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOmaps</title>
</head>
<body>
<h1>Consulte los horarios de las oficinas</h1>

	<br>Seleccione Oficina:<select name="oficina"> 
                    <%ArrayList<OficinasAgregar> lista = ConsultaOficinas.getOficinas();
                        for (OficinasAgregar h : lista) {
                    %>
                    
                    <option value="<%=h.getOfi_nombre()%>"><%=(h.getOfi_nombre()+", Hora Apertura: "+ h.getOfi_hora_apertura()+ " y Hora Cierre: "+ h.getOfi_hora_cierre())%></option>
                    
                    <%}
                    %>
                </select><br>
                <br>
                <li><a href="MenuPrincipal.html">Regrese al Menu Principal</a>
                </body>
</html>