<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Aula"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Informacion en UcoMaps</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h1>Consulte Informacion de Aulas</h1>
<form action ="AulasInfoControlador" method="post">
<br>Seleccione el Aula:<select name="aulabloque" onchange="infoaula(this.value)">
<option value="1">Seleccione un Aula</option> 
				    <%ArrayList<Aula> lista = (ArrayList<Aula>)request.getAttribute("aulas");
                        for (Aula h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                     </select>
                <br>  
      			<div id='infoaulas'>  
      			<select name='infoaulas'>  
      			<option value='-1'></option>  
      			</select>  
      			</div> 
<script>
function infoaula(str)
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
	      var url="AulasInfoDatosControlador";
	      url +="?aulas=" +str;
	      xmlHttp.onreadystatechange = stateChange;
	      xmlHttp.open("GET", url, true);
	      xmlHttp.send(null);
}
function stateChange(){
	if (xmlHttp.readyState==4 || xmlHttp.readyState=="completa"){ 
		//alert("datos"+xmlHttp.responseText)
	    document.getElementById("infoaulas").innerHTML=xmlHttp.responseText  
	}
}
</script>