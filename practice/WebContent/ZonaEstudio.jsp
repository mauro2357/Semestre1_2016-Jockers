<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="BD.ConsultaBloques"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.BloquesAgregar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<body>
	<h1>Registre una zona estudio en la aplicacion</h1>
	<form action="ZonaEstudioControlador" method="post">
	<p>Ingrese el nombre de la zona de estudio: <input type="text" name="zonanom" value="<%=request.getParameter("zonanom")!=null?request.getParameter("zonanom"):""%>"  />
	<br>	
	<br>Selecciones el Bloque:<select name="zonablo"> 
                    <%ArrayList<BloquesAgregar> lista = ConsultaBloques.getBloques();
                        for (BloquesAgregar h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>

	<p>Ingrese la capacidad de la zona de estudio: <input type="text" name="zonacap" value="<%=request.getParameter("zonacap")!=null?request.getParameter("zonacap"):""%>"  />	
	<p><input type="submit" name="Ingresar" value="Ingresar Zona De Estudio"/>
</form>
<li><a href="MenuPrincipal.html">Regrese al Menu Principal</a>
</body>
</html>