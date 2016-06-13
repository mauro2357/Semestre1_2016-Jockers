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
var fotocopiadoracole=new google.maps.LatLng(6.149941, -75.366107);
var canchavoleybol=new google.maps.LatLng(6.149915, -75.366281);


function initialize()
{
var mapProp = {
  center:x,
  zoom:17,
  mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  
var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
var marker = new google.maps.Marker({
    position: canchavoleybol,
    map: map,
    title : "cancha voleybol",
    icon : 'http://pbs.twimg.com/profile_images/897377792/pomeps-globe_normal.png'
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
    infowindow.setContent("cancha vobeybol");
    infowindow.open(map, marker);
  }
}))

var myTrip=[porteria,cafeteriap,parqueadero,fotocopiadoracole,canchavoleybol];
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