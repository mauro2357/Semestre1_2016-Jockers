<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="Clases.PuntoReferencia" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Lugares</title>
<style type="text/css">
    #map { height: 500px; }
    </style>
</head>
<body>
<%ArrayList<PuntoReferencia> lugares = new ArrayList<>();
	lugares=(ArrayList<PuntoReferencia>)request.getAttribute("puntos");
	for (int i=0;i<lugares.size();i++){
 	String nombre = lugares.get(i).getPun_nombre();
 	double latitud = lugares.get(i).getPun_latitud();
 	double longitud = lugares.get(i).getPun_longitud();
 	%>
<table style="whidht:100%";>
<th>Lugar</th>
<th><button onclick="inicializar_mapa()"><%=nombre %></button>
<input type="hidden" id="nombre" value=<%=nombre%>>
<input type="hidden" id="latitud" value=<%=latitud%>>
<input type="hidden" id="longitud" value=<%=longitud%>>
	</th>
</table>
<%}%>
<script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDdXWWU2BPWI7i2_6UPhZM9Ru5nfGtU23w"></script>
<script type="text/javascript">
var latitud = document.getElementById("latitud").value;
var longitud = document.getElementById("longitud").value;
var nombre = document.getElementById("nombre").value;  

function inicializar_mapa() {
	
	var pos= new google.maps.LatLng(latitud, longitud)
	var mapOptions = {
    		
      center:new google.maps.LatLng(6.150503, -75.366396),
      zoom: 17,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
	
    var map = new google.maps.Map(document.getElementById("map"),
        mapOptions);
    var coorde = latitud+", "+longitud;
    
    var contentString = "Nombre: "+nombre+'</br>'+"Latitud: "+latitud+" Longitud: "+longitud+'</br>'+"Telefono: "+telefono+'</br>'+"Descripcion: "+descripcion+'</br>'+"Categoria: "+categoria;
    var infowindow = new google.maps.InfoWindow({
        content: contentString
      });
    
    marker = new google.maps.Marker({
        position: pos,
        map: map,
        title:"Esto es un marcador",
        animation: google.maps.Animation.BOUNCE
    }); 
    marker.addListener('click', function() {
        infowindow.open(map, marker);
      });
    marker.addListener('click', toggleBounce);
  }
function toggleBounce() {
	  if (marker.getAnimation() !== null) {
	    marker.setAnimation(null);
	  } else {
	    marker.setAnimation(google.maps.Animation.BOUNCE);
	  }
	}

var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 17,
    center: new google.maps.LatLng(6.150503, -75.366396),
    mapTypeId: google.maps.MapTypeId.ROADMAP
  });

google.maps.event.addDomListener(window, 'load', inicializar_mapa);
</script>
  <div id="map"></div>
  </body>
</html>