<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.Vector" %>
    <%@page import="Clases.PuntoReferencia" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Puntos de Referencia</title>
<style type="text/css">
    #map { height: 300px; }
    </style>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<form action ="PuntoReferenciaControlador" method="post">
<br>Seleccione el Punto:<select name="puntos" onchange="info(this.value)">
<option value="1">Seleccione Punto de Referencia</option> 
				    <%ArrayList<PuntoReferencia> lista = (ArrayList<PuntoReferencia>)request.getAttribute("puntos");
                        for (PuntoReferencia h : lista) {
                    %>                    
                    <option value="<%=h.getPun_nombre()%>"><%=(h.getPun_nombre())%></option>                    
                    <%}
                    %>
                     </select>
                <br>  
      			<div id='map'>
      			<select name='map'>  
      			<option value='-1'></option>  
      			</select>    
      			</div>      			 

<script type="text/javascript">
function loadXMLDoc(url,cfunc)
{
	if (window.XMLHttpRequest){
	      xmlHttp= new XMLHttpRequest();
	      }
	      else {
	      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
	      }    
	    
	      xmlHttp.onreadystatechange = cfunc;
	      xmlHttp.open("GET", url, true);
	      xmlHttp.send();
}
function mostrar(){
        loadXMLDoc("PuntoReferenciaInfoDatosControlador",function()
	{
	if (xmlHttp.readyState==4 && xmlHttp.status==200){ 
		//alert("datos"+xmlHttp.responseText)
	    document.getElementById("map").innerHTML=xmlHttp.responseText 
	}
    });
}
</script>