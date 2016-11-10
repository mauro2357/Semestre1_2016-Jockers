<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String Vector = (String)request.getAttribute("VectorScript");%>
<!DOCTYPE html>
<html>
<body onload="myMap()">
<div id="map" style="width:600px;height:400px"></div>
<script>
function myMap() {
  var m = <%=Vector%>;
  var mapCanvas = document.getElementById("map");
  var mapOptions = {center: new google.maps.LatLng(6.150503, -75.366396), zoom: 16};
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
<script src="https://maps.googleapis.com/maps/api/js?callback=myMap"></script>
</body>
</html>