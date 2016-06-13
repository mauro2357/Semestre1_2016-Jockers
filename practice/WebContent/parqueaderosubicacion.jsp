<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <style type="text/css">
    #mapa { height: 500px; }
    </style>
    <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
    <script type="text/javascript">
    function initialize() {
      	var marcadores = [
['Parqueadero A', 6.149592, -75.367253],
['Parqueadero B', 6.149187, -75.366565],
['Parqueadero C', 6.150030, -75.365857],
['Parqueadero D', 6.150595, -75.366088],
['Parqueadero E', 6.151144, -75.366464],
['Parqueadero Cancha Sintética', 6.150467, -75.367758]
];
      var map = new google.maps.Map(document.getElementById('mapa'), {
        zoom: 17,
        center: new google.maps.LatLng(6.150503, -75.366396),
        mapTypeId: google.maps.MapTypeId.ROADMAP
      });
      var infowindow = new google.maps.InfoWindow();
      var marker, i;
      for (i = 0; i < marcadores.length; i++) {  
        marker = new google.maps.Marker({
          position: new google.maps.LatLng(marcadores[i][1], marcadores[i][2]),
          map: map,
          icon : 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABkAAAAZCAMAAADzN3VRAAAA5FBMVEX///9QTk8iHh8cGBkUEBGFgoP7+/ssJyizsrLYJi73Exv+9PQXExTcJi3yHyf2HSUmIiP93t/zcHWpHSS2ISX96erxNjz/+frzZmv4EBnLMDembnC1iYzm4eHh2dnxDxf3k5fAv8DtLTT6ycv6v8Dx8vJfXV2Ylpe/b3L4pqnxIivDlJbwS1LRwsPBp6ikJyu2YWW9Vlr3en7WMDjxVFo6NjhRWVq7kpTHJi3Kj5L5sLPyXWP94eLIpKbXzs7PPUPSXWKioaLFgYTfv8GYREihPkHisrTMsbPRSlGigIL1hotHQ0P8vOcYAAABa0lEQVQokWXQ2XaCMBAG4BFxYYBEVESsGIugNWpdiq3F4tK9+v7v07C4nON/NXM+kpkAkKbz/bVSdKX++aHCdZz3FrWRMUTkv1HxAj9barvBIfSGi4Ag35knGLlIukZaW96a4XaTNhHHsXe5wAopbp242igYmDAopNmLz0OCOx/An6ErblpqmpxEGhTBYyQCmHA6FCdzUiUfR5PkMkDV3vowx7GaiLQvi/Ql7ehAj9A/0FkXUkmm+ke5tAErwClw9nYtzjIWOOAKCLcyGYjL9v281hd7eUwB2jAzyaeR70Xbi8VVM9HkePNKDIlwkkmlMBApJ9NgKERnXiqlq18MVaxBHau3YjbwDtqUGDfSRb0DTstuir1z+cpFDI4PonuhbAHwXFqeRQ3wqRMXMyQL1fL9E7ytGY+Syp8jaxrnA2ED+WvW+DNi86ZnihjDMbX10WWXUYsiI27DJQzJfHL1MOi0azoR4cr0MRv4DwhwJWt1HsyxAAAAAElFTkSuQmCC'
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
  <body>
    <div id="mapa"></div>
  </body>
</html>