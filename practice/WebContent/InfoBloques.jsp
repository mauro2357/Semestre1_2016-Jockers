<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Clases.Bloque"%>
<%@page import="BD.ConsultaDatosBloques"%>

<table style = "width:50%">      
	<tbody>
	<%Bloque bloque = (Bloque) request.getAttribute("bloque");{				  
	out.println("<br>"+"Aulas: " +bloque.getAulas()+"</td>");
	out.println("<br>"+"Baños: "+bloque.getBanos()+"</td>");
	out.println("<br>"+"Laboratorios y Salas: "+bloque.getLaboratorios_salas()+"</td>");
	out.println("<br>"+"Oficinas y Facultades: "+bloque.getOficinas_facultades()+"</td>");
	out.println("<br>"+"Oratorio: "+bloque.getOratorios()+"</td>");
	out.println("<br>"+"Parqueadero: "+bloque.getParqueaderos()+"</td>");
	out.println("<br>"+"Pisos: "+bloque.getPisos()+"</td>");
	out.println("<br>"+"Zonas de Estudio: "+bloque.getZonas_estudio()+"</td>");
	}%>
	</tbody>
</table>