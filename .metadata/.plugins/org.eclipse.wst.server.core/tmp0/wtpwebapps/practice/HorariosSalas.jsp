<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Sala"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Horarios de salas en UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Consulte los horarios de los Centros de Informática</h1>

	<br>Seleccione Sala:<select name="sala"> 
                    <%ArrayList<Sala> lista =  (ArrayList<Sala>)request.getAttribute("salas");
                        for (Sala h : lista) {
                    %>
                    
                    <option value="<%=h.getSal_nombre()%>"><%=(h.getSal_nombre()+", Horario: "+ h.getHorario_nombre())%></option>
                  	<%}
                    %>
                </select><br>
                <br>
                <a href="Usuarios.jsp">Regrese al Menu Principal</a>
                </body>
</html>