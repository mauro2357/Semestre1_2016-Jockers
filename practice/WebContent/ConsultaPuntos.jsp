<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Genere Puntos en UCOMAPS</title>
</head>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
<body>
<h2>Genere los Puntos</h2><br>	
<form action ="PuntoReferenciaControlador" method="post">
Seleccione puntos: <select name="rutas">                                    
                    <option value="Bloque">Bloques</option> 
                    <option value="Cancha">Escenarios Deportivos</option> 
                    <option value="Porteria">Porterias</option> 
                    <option value="Parqueadero">Parqueaderos</option>                   
                    </select><br>
                <br>
                <p><input type="submit" name="Generar" value="Generar"/><br><br>
                <a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
                </body>
</html>