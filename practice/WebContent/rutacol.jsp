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
var parqueadero=new google.maps.LatLng(6.149656, -75.366310);
var fotocopiadora=new google.maps.LatLng(6.149934, -75.366165);
var colegio=new google.maps.LatLng(6.149961, -75.365838);

function initialize()
{
var mapProp = {
  center:x,
  zoom:17,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({
    position: colegio,
    map: map,
    title : "Colegio",
    icon : 'http://es.downloadicons.net/sites/default/files/icono-de-edificio-de-oficina-24421.png'
});
var marker = new google.maps.Marker({
    position: porteria,
    map: map,
    title : "Porteria",
    icon : 'https://maps.google.com/mapfiles/kml/shapes/parking_lot_maps.png',
    text: 'm'
});
google.maps.event.addListener(marker, 'click', (function(marker, i) {
  return function() {
    infowindow.setContent("Colegio");
    infowindow.open(map, marker);
  }
}))

var myTrip=[porteria,cafeteriap,parqueadero,fotocopiadora,colegio];
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