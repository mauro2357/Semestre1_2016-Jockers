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
['Porteria Principal Abajo', 6.149538, -75.367442 ],
['Porteria Principal Arriba', 6.148871, -75.366144 ],
['Porteria Salida', 6.150892, -75.367061],
['Porteria Entrada Peatonal', 6.150634, -75.367124]
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
          icon : 'http://es.downloadicons.net/sites/default/files/icono-de-edificio-de-oficina-24421.png'
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