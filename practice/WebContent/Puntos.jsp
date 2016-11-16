<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String Vector = (String)request.getAttribute("VectorScript");%>
<!doctype html>
<html>
	<head>
  		<title>Puntos UcoMaps</title>
    	<script type="text/javascript" src="http://maps.google.com/maps/api/js?key=AIzaSyDV5oFu5MbU1yGLqU3YpIkiRIXANNSI61s"></script>
    	<script>
	    function initialize() {
	      	var marcadores = <%=Vector%>;
	      	var map = new google.maps.Map(document.getElementById('map'), {
	        zoom: 17,
	        center: new google.maps.LatLng(6.150503, -75.366396),
	        mapTypeId: google.maps.MapTypeId.ROADMAP
	      });
	      var infowindow = new google.maps.InfoWindow();
	      var marker, i;
	      for (i = 0; i < marcadores.length; i++) {  
	        marker = new google.maps.Marker({
	          position: new google.maps.LatLng(marcadores[i][1], marcadores[i][2]),
	          map: map
	        });
	        google.maps.event.addListener(marker, 'click', (function(marker, i) {
	          return function() {
	            infowindow.setContent(marcadores[i][0] +"</br> ");
	            infowindow.open(map, marker);
	          }
	        })(marker, i));
	      }
	    }
	    google.maps.event.addDomListener(window, 'load', initialize);
	  </script>
	  </head>
	  <link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
	  <body>
	  <h2>Puntos Generados</h2>
	  <div id="map" style="width:600px;height:300px;"></div><br>
	  <a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
	  </body>
</html>