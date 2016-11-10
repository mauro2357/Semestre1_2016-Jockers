<%@page import="java.util.ArrayList"%>
<%@page import="Clases.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Consulte Informacion</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />

</head>
<body>
<div id="wrapper">
<div id="page-bgtop">
<div id="content" style="padding-top:170px;padding-right:150px">
		<div id="sidebar">			
			<h2>Informacion Bloques</h2>
<form action ="BloquesInfoControlador" method="post">
<br>Seleccione el Bloque:
<select name="bloques" onchange="infobloques(this.value)">
				    <option value="1">Seleccione un bloque</option> 
				    <%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option value="<%=h.getNombre_bloque()%>"><%=(h.getNombre_bloque())%></option>                    
                    <%}
                    %>
                 </select>
                 <br> <br> 
      			<div id='infobloque'>  
      			<select name='infobloque'>  
      			<option value='-1'></option>  
      			</select>  
      			</div>
      			<br><a href="index.jsp">Regrese al menu principal</a>                  
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
	      var url="BloquesInfoDatosControlador";
	      url +="?bloques=" +str;
	      xmlHttp.onreadystatechange = stateChange;
	      xmlHttp.open("GET", url, true);
	      xmlHttp.send(null);
}
function stateChange(){
	if (xmlHttp.readyState==4 || xmlHttp.readyState=="completa"){ 
		//alert("datos"+xmlHttp.responseText)
	    document.getElementById("infobloque").innerHTML=xmlHttp.responseText  
	}
}
</script>



	
			</div>
			
		<div id="sidebar">			
			<h2>Informacion Aulas</h2>
<form action ="AulasInfoControlador" method="post">
<br>Seleccione el Aula:<select name="aulabloque" onchange="infoaula(this.value)">
<option value="1">Seleccione un Aula</option> 
				    <%ArrayList<Aula> listab = (ArrayList<Aula>)request.getAttribute("aulas");
                        for (Aula h : listab) {
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
	       <p>
            </div>
		<div style="clear: both;">&nbsp;</div>
	</div>
	</div>
</body>
</html>