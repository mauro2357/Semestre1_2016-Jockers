<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="BD.ConsultaSala"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.SalasAgregar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Horarios de salas en UCOMAPS</title>
</head>
<body>
<h1>Consulte los horarios de los Centros de Informática</h1>

	<br>Seleccione Sala:<select name="sala"> 
                    <%ArrayList<SalasAgregar> lista = ConsultaSala.getSalas();
                        for (SalasAgregar h : lista) {
                    %>
                    
                    <option value="<%=h.getSal_nombre()%>"><%=(h.getSal_nombre()+", Hora Apertura: "+ h.getSal_hora_apertura()+ " y Hora Cierre: "+ h.getSal_hora_cierre())%></option>
                  	<%}
                    %>
                </select><br>
                <br>
                <li><a href="MenuPrincipal.html">Regrese al Menu Principal</a>
                </body>
</html>