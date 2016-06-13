<!DOCTYPE html>
<html>
<head>
<script
src="http://maps.googleapis.com/maps/api/js">
</script>

<script>
var x=new google.maps.LatLng(6.150163, -75.366729);
var porteria=new google.maps.LatLng(6.149555, -75.367437);
var cafeteriap=new google.maps.LatLng(6.149768, -75.367201);
var bloquej=new google.maps.LatLng(6.150323, -75.366944);
var escalerasj= new google.maps.LatLng(6.150475, -75.366999);
var pasillo= new google.maps.LatLng(6.150608, -75.366846);
var anden= new google.maps.LatLng(6.151171, -75.366760);
var bloquel= new google.maps.LatLng(6.151212, -75.366658);


function initialize()
{
var mapProp = {
  center:x,
  zoom:17,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker = new google.maps.Marker({
    position: bloquel,
    map: map,
    title : "Bloque L, biblioteca",
    icon : 'http://es.downloadicons.net/sites/default/files/icono-de-edificio-de-oficina-24421.png'
});

var marker = new google.maps.Marker({
    position: porteria,
    map: map,
    title : "Porteria",
    icon : 'https://maps.google.com/mapfiles/kml/shapes/parking_lot_maps.png',
    text: 'J'
});
google.maps.event.addListener(marker, 'click', (function(marker, i) {
  return function() {
    infowindow.setContent("bloquel");
    infowindow.open(map, marker);
  }
}))

var myTrip=[porteria,cafeteriap,bloquej,escalerasj,pasillo,anden,bloquel];
var flightPath=new google.maps.Polyline({
  path:myTrip,
  strokeColor:"#0000FF",
  strokeOpacity:0.8,
  strokeWeight:2
  });
flightPath.setMap(map);
}


google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>

<body>
<div id="googleMap" style="width:500px;height:380px;"></div>
</body>
</html>
