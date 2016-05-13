<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Bloque"%>
<%@page import="Clases.Facultad"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de datos de bloques de UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Consulte Informacion de Bloques</h1>
<form action ="BloquesInfoControlador" method="post">
<br>Seleccione el Bloque:<select name="bloques" onchange="infobloques(this.value)">
				    <option value="1">Seleccione un bloque</option> 
				    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloque");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                 </select>
                 <br>  
      			<div id='infobloque'>  
      			<select name='infobloque' >  
      			<option value='-1'></option>  
      			</select>  
      			</div>                   
<script>
function infobloques(str)
{
	if (typeof XMLHttpRequest != "indefinido"){
	      xmlHttp= new XMLHttpRequest();
	      }
	      else if (window.ActiveXObject){
	      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
	      }
	      if (xmlHttp==null){
	      alert("Navegador no soportado")
	      return;
	      } 
	      var url="InfoBloques.jsp";
	      url +="?bloques=" +str;
	      xmlHttp.onreadystatechange = stateChange;
	      xmlHttp.open("GET", url, true);
	      xmlHttp.send(null);
}
function stateChange(){
	if (xmlHttp.readyState==4 || xmlHttp.readyState=="completa"){   
	    document.getElementById("infobloque").innerHTML=xmlHttp.responseText  
	}
}
</script>



