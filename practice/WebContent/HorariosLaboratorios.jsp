<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Laboratorio"%>
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
<h1>Consulte los horarios de los Laboratorios</h1>

	<br>Seleccione Laboratorio:<select name="laboratorios"> 
                    <%ArrayList<Laboratorio> lista =  (ArrayList<Laboratorio>)request.getAttribute("laboratorios");
                        for (Laboratorio h : lista) {
                    %>
                    
                    <option value="<%=h.getLab_nombre()%>"><%=(h.getLab_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                  	<%}
                    %>
                </select><br>
                <br>
                <a href="Usuarios.jsp">Regrese al Menu Principal</a>
                </body>
</html>