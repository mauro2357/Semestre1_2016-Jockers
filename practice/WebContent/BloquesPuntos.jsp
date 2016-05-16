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
['Bloque A', 6.149751, -75.367442 ],
['Bloque B', 6.149906, -75.366898 ],
['Bloque C', 6.149925, -75.366724 ],
['Bloque D', 6.149500, -75.366816  ],
['Bloque E', 6.149535, -75.366925 ],
['Bloque J', 6.150518, -75.366841 ],
['Edificio de la Ciencia', 6.151249, -75.366546 ],
['Bloque M', 6.149661, -75.365968 ],
['Colegio', 6.149929, -75.365858 ],
['Bloque Idiomas', 6.149490, -75.365844],
['Auditorio Principal', 6.149220, -75.366073 ]
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