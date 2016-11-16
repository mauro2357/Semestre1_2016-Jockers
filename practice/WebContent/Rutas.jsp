<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String Vector = (String)request.getAttribute("VectorScript");%>
<!DOCTYPE html>
<html>
	<head>
 		<title>Rutas UcoMaps</title>
		<script type="text/javascript" async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDV5oFu5MbU1yGLqU3YpIkiRIXANNSI61s&callback=initMap"></script>
		<script>
		function initMap(){
			var m = <%=Vector%>;
		  	var mapCanvas = document.getElementById("map");
		  	var mapOptions = {center: new google.maps.LatLng(6.150503, -75.366396), zoom: 17};
		  	var map = new google.maps.Map(mapCanvas,mapOptions);
	
		  	var flightPath = new google.maps.Polyline({
			    path: m,
			    strokeColor: "#0000FF",
			    strokeOpacity: 0.8,
			    strokeWeight: 2
			  });
		  	flightPath.setMap(map);
			}
		</script>
	</head>
	<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
	<body>
	<h2>Ruta Generada</h2>
	<div id="map" style="width:600px;height:300px;"></div><br>
	<a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
	</body>
</html>
