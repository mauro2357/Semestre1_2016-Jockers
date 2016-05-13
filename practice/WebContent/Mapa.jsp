<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="Clases.PuntoReferencia" %>

<!doctype html>
<html lang="es">
<head>
<meta charset="UTF-8">
<style type="text/css">
</style>
</head>
<body>
<div id="map" style="height:400px"></div>
<script type="text/javascript" src="http://maps.google.com/maps/api/js"></script>
<script type="text/javascript">

    
    ArrayList<PuntoReferencia> marcadores = new ArrayList<>();
    marcadores=(ArrayList<PuntoReferencia>)request.getAttribute("puntos");
    	
    	for (i = 0; i < marcadores.size; i++) {  
    		String nombre = marcadores.get(i).getPun_nombre();
    		double latitud = marcadores.get(i).getPun_latitud();
    		double longitud = marcadores.get(i).getPun_longitud();
    	}
   	  
    
    var map = null;
	var infoWindow = null;

	function openInfoWindow(marker) {
		var markerLatLng = marker.getPosition();
		infoWindow.setContent(
			"La posicion del marcador es: "+'</br>'+"Latitud: "+markerLatLng.lat()+" Longitud: "+markerLatLng.lng()+'</br>'+"Haz click en el marcador para actualizar"
			
		);
		infoWindow.open(map, marker);
	}

	function initialize() {
		var myLatlng = new google.maps.LatLng(6.148699, -75.356351);
		var myOptions = {
		  zoom: 13,
		  center: myLatlng,
		  mapTypeId: google.maps.MapTypeId.ROADMAP
		}

		map = new google.maps.Map(document.getElementById("map"), myOptions);

		infoWindow = new google.maps.InfoWindow();

		var marker = new google.maps.Marker({
		    position: myLatlng,
		    draggable: true,
		    map: map,
		    title:"Ejemplo marcador arrastrable"
		});

		google.maps.event.addListener(marker, 'click', function(){
			openInfoWindow(marker);
		});
	}
    }
	       
    </script>
    <script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBRHzn9G_iNQggnEwwM_m7QCZiAH0C7S8U&libraries=places&callback=initialize">
    </script>
</body>
</html>