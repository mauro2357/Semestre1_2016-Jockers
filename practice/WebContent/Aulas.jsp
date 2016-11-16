<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicacion UCO-Maps en construccion..</title>
	</head>
	<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
	<body>
	<h2>Registrar nueva aula en UCO-Maps</h2>
	<form action="AulasControlador" method ="post">
	<p>Ingrese el nombre del aula: <input type="text" name="nomaula" value="<%=request.getParameter("nomaula")!=null?request.getParameter("nomaula"):""%>"  />
	<br>
	<br>Selecciones el Bloque:<select name="aulabloque"> 
                   <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>	
	<p>Cuenta el aula con VideoBeam o TV:
		Si:<input type="radio" name="videobeamtv" value="s" value="<%=request.getParameter("videobeamtv")!=null && request.getParameter("videobeamtv").equals("n")?"selected='selected'":""%>" checked="checked"/>
		No:<input type="radio" name="videobeamtv" value="n" value="<%=request.getParameter("videobeamtv")!=null?request.getParameter("videobeamtv"):""%>" /> 
	<p>Ingrese la capacidad del aula: <input type="text" name="aulacap" value="<%=request.getParameter("aulacap")!=null?request.getParameter("aulacap"):""%>"  />
	<p><input type="submit" name="Ingresar" value="Ingresar Aula"/>	
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>