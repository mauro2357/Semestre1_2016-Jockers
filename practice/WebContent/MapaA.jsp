<div id="map"></div> 
<%@page import="Clases.PuntoReferencia"%>
<%@page import="java.util.ArrayList" %>

 <%ArrayList<PuntoReferencia> lugares = new ArrayList<>();
	lugares=(ArrayList<PuntoReferencia>)request.getAttribute("info");
	for (int i=0;i<lugares.size();i++){
 	String nombre = lugares.get(i).getPun_nombre();
 	double latitud = lugares.get(i).getPun_latitud();
 	double longitud = lugares.get(i).getPun_longitud();
 	%>
<input type="hidden" id="nombre" value=<%=nombre%>>
<input type="hidden" id="latitud" value=<%=latitud%>>
<input type="hidden" id="longitud" value=<%=longitud%>>
<%System.out.println("Llego al Mapa"); %> 
<%
}
%>
 <head>
   	<style type="text/css">
    #map { height: 400px; width:500px } 
    </style><%System.out.println("Mapa Estilo"); %>
    <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDdXWWU2BPWI7i2_6UPhZM9Ru5nfGtU23w"></script>
    <script type="text/javascript">
		var latitud = document.getElementById("latitud").value;
		var longitud = document.getElementById("longitud").value;
		var nombre = document.getElementById("nombre").value;  
		console.log("Ensayo");
    	function initialize() {
    		alert("Mapa");
        var map = new google.maps.Map(document.getElementById('map'), {
        zoom: 17,
        center: new google.maps.LatLng(6.150503, -75.366396),
        mapTypeId: google.maps.MapTypeId.ROADMAP });
      	var infowindow = new google.maps.InfoWindow();
      	var marker;      
        marker = new google.maps.Marker({
          position: new google.maps.LatLng(latitud, longitud),
          map: map,
    	  icon : 'https://maps.google.com/mapfiles/kml/shapes/parking_lot_maps.png' 
    	  });
        google.maps.event.addListener(marker, 'click', (function(marker) {
        return function() {
            infowindow.setContent(nombre);
            infowindow.open(map, marker);
            }
        })(marker));
      }    
    google.maps.event.addDomListener(window, 'load', initialize);
    </script>
  </head> 