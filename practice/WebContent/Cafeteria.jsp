<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCOMAPS en construccion</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
	<h2>Registre la cafeteria en la aplicacion</h2>
	<form action="CafeteriaControlador" method ="post">
	<p>Ingrese el nombre de la cafeteria: <input type="text" name="cafnombre" value="<%=request.getParameter("cafnombre")!=null?request.getParameter("cafnombre"):""%>"  />	
	<br>	
	<br>Selecciones el Bloque:<select name="cafbloque"> 
                    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>	
	<p>Ingrese la capacidad de la cafeteria: <input type="text" name="cafcap" value="<%=request.getParameter("cafcap")!=null?request.getParameter("cafcap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Cafeteria"/>
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>