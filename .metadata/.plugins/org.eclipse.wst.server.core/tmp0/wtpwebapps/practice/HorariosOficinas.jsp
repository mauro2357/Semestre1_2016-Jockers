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
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Consulte los horarios de las oficinas</h1>

	<br>Seleccione Oficina:<select name="oficina"> 
                    <%ArrayList<OficinasAgregar> lista = (ArrayList<OficinasAgregar>)request.getAttribute("oficinas");
                        for (OficinasAgregar h : lista) {
                    %>
                    
                    <option value="<%=h.getOfi_nombre()%>"><%=(h.getOfi_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                    
                    <%}
                    %>
                </select><br>
                <br>
                <a href="MenuPrincipal.html">Regrese al Menu Principal</a>
                </body>
</html>