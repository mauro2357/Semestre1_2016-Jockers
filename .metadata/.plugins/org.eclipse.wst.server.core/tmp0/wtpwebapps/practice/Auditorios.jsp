<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-MAPS en construccion</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
	<h1>Registre un auditorio en la aplicacion</h1>
	<form action ="AuditoriosControlador" method="post">
	<p>Ingrese el nombre del auditorio: <input type="text" name="audnombre" value="<%=request.getParameter("audnombre")!=null?request.getParameter("audnombre"):""%>"  />	
	<br>
	<br>Seleccione el Bloque: <select name="audbloque"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%
                    }
                    %>
                    </select><br>	
	<p>Ingrese la capacidad del auditorio: <input type="text" name="audcap" value="<%=request.getParameter("audcap")!=null?request.getParameter("audcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Auditorio"/>
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<% request.getAttribute("estado"); %>
</body>
</html>