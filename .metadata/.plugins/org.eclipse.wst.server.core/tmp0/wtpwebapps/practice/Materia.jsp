<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@page import="Clases.Facultad"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Materia</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Agregue una nueva materia</h1>
	<form action ="MateriasControlador" method="post">
	<p>Ingrese el nombre de la Materia: <input type="text" name="matnombre" value="<%=request.getParameter("matnombre")!=null?request.getParameter("matnombre"):""%>"  />	
	<p>Ingrese el numero de creditos de la Materia: <input type="text" name="matcreditos" value="<%=request.getParameter("matcreditos")!=null?request.getParameter("matcreditos"):""%>"  />	
	<br>
	<br>Seleccione la Facultad a la que pertenece la Materia: <select name="matfacultad"> 
                    <%ArrayList<Facultad> lista = (ArrayList<Facultad>)request.getAttribute("facultad");
                        for (Facultad h : lista) {
                    %>                    
                    <option value="<%=h.getFacultades_nombre()%>"><%=(h.getFacultades_nombre())%></option>                    
                    <%
                    }
                    %>
                    </select><br>
    <br>Seleccione el Bloque donde se dictara la Materia: <select name="matbloque"> 
                    <%ArrayList<Bloque> listab = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : listab) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%
                    }
                    %>
                    </select><br>                	
    <p>Ingrese el Aula: <input type="text" name="mataula" value="<%=request.getParameter("mataula")!=null?request.getParameter("mataula"):""%>"  />	
    <br>
	<br>Seleccione el Horario de la Materia:<br>
Horario A: <input type="radio" name="horario" value="A" value="<%=request.getParameter("horario")!=null && request.getParameter("horario").equals("A")?"selected='selected'":""%>" checked="checked"/><br>    
Horario AA: <input type="radio" name="horario" value="AA" value="<%=request.getParameter("horario")!=null?request.getParameter("horario"):""%>" /><br>	
Horario AAA: <input type="radio" name="horario" value="AAA" value="<%=request.getParameter("horario")!=null?request.getParameter("horario"):""%>" /><br>	
	<p><input type="submit" name="Ingresar" value="Ingresar Materia"/>
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
<%request.getAttribute("estado"); %>
</body>
</html>