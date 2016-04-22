<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizacion de datos de bloques de UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Actualice Horario del Laboratorio</h1>
<form action ="ActualizacionBloquesControlador" method="post">
<br>Selecciones el Bloque:<select name="bloques"> 
                   <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                </select><br>
<p>Ingrese el numero de pisos: <input type="text" name="numpiso" value="<%=request.getParameter("numpisos")!=null?request.getParameter("numpisos"):""%>"  />
<p>Ingrese el numero de aulas: <input type="text" name="numaulas" value="<%=request.getParameter("numaulas")!=null?request.getParameter("numaulas"):""%>"  />
<p>Ingrese el numero de laboratorios y/o salas: <input type="text" name="numlabsalas" value="<%=request.getParameter("numlabsalas")!=null?request.getParameter("numlabsalas"):""%>"  />
<p>Ingrese el numero de oficinas y facultades que tiene:<input type="text" name="oficinasfacultades" value="<%=request.getParameter("oficinasfacultades")!=null?request.getParameter("oficinasfacultades"):""%>"  />
<p>Ingrese el numero de ba�os:<input type="text" name="numbanos" value="<%=request.getParameter("numbanos")!=null?request.getParameter("numbanos"):""%>"  />
<p>Cuenta con oratorios:
			Si:<input type="radio" name="oratorios" value="s" value="<%=request.getParameter("oratorios")!=null && request.getParameter("oratorios").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="oratorios" value="n" value="<%=request.getParameter("oratorios")!=null?request.getParameter("oratorios"):""%>" />
<p>Cuenta con zonas de parqueo:
			Si:<input type="radio" name="parqueo" value="s" value="<%=request.getParameter("parqueo")!=null && request.getParameter("parqueo").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="parqueo" value="n" value="<%=request.getParameter("parqueo")!=null?request.getParameter("parqueo"):""%>" />		
<p>Cuenta con zonas de estudio:
			Si:<input type="radio" name="estudio" value="s" value="<%=request.getParameter("estudio")!=null && request.getParameter("estudio").equals("n")?"selected='selected'":""%>" checked="checked"/>
			No:<input type="radio" name="estudio" value="n" value="<%=request.getParameter("estudio")!=null?request.getParameter("estudio"):""%>" />
<p><input type="submit" name="ingresar" value="Actualizar Bloque" />
</form>
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>
</body>
</html>                	



</body>
</html>