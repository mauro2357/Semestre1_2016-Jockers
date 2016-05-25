<!DOCTYPE html>
<html>

	<head>
	<p>Bienvenido Estudiante...</p>
		<title>Usuarios</title>
		<style type="text/css">
			
			* {
				margin:0px;
				padding:0px;
			}
			
			#header {
				margin:auto;
				width:500px;
				font-family:cursive, Helvetica, sans-serif;
				font-size: 15px;
			}
			
			ul, ol {
				list-style:none;
			}
			
			.nav > li {
				float:left;
			}
			
			.nav li a {
				background-color:green;
				color:black;
				text-decoration:inherit;
				padding:5px 10px;
				display:block;
				font-size: 20px;
			}
			
			.nav li a:hover {
				background-color:yellow;
			}
			
			.nav li ul {
				display:none;
				position:absolute;
				min-width:140px;
			}
			
			.nav li:hover > ul {
				display:block;
				
			}
			
			.nav li ul li {
				position:relative;
			}
			
			.nav li ul li ul {
				right:-140px;
				top:0px;
			}			
		</style>		
	</head>
	<body>
			<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
			<div id="header">
			<ul class="nav">
				<li><a>Mapa: </a>
				<ul>
				<li><a href="BloquesPuntos.jsp">Bloques</a></li>
				<li><a href="PorteriasPuntos.jsp">Porterias</a></li>
				<li><a href="parqueaderosubicacion.jsp">parqueaderos -- UCO</a></li>
				</ul>				
				<li><a>Consultar: </a>
					<ul>
					<li><a href="ConsultaOficinasControlador">Horarios Oficinas</a>
					<li><a href="ConsultaSalasControlador">Horarios Salas</a>
					<li><a href="ConsultaLaboratoriosControlador">Horarios Laboratorios</a>
					<li><a href="BloquesInfoControlador">Caracteristicas Bloques</a></li>
					<li><a href="AulasInfoControlador">Bloque de un Aula</a></li>
					</ul>					
				</li>
				<li><a>Rutas:</a>
				<ul>				
				<li><a>Escenarios Deportivos: </a>
				<ul>
				<li><a href="canchasintetica.jsp">cancha sintetica</a></li>
				<li><a href="coliseo.jsp">coliseo</a></li>
				<li><a href="canchavoleybol.jsp">cancha de voleybol</a></li>
				</ul>
				<li><a>Bloques: </a>
				<ul>
				<li><a href="rutasj.jsp" >ruta porteria -- bloque j </a></li>
				<li><a href="rutam.jsp" >ruta porteria -- bloque m </a></li>
				<li><a href="rutasl.jsp" >ruta porteria -- bloque de la ciencia  </a></li>
				<li><a href="rutacol.jsp" >ruta porteria -- colegio  </a></li>
				<li><a href="rutaauditorio.jsp" >ruta porteria -- Auditorio Monseñor Flavio Calle  </a></li>
				<li><a href="rutaIdiomas.jsp" >ruta porteria -- Bloque Idiomas  </a></li>
				<li><a href="rutaaspirante.jsp" >ruta porteria -- bloque m oficinas </a></li>
				</ul>
				</ul>	
				<li><a>Anuncios: </a>
				<ul>
				<li><a href="Anuncios.jsp">Enviar Anuncios</a></li>
				<li><a href="ConsultaAnunciosControlador">Ver Anuncios</a></li>
				</ul>
				
				
				
							
				<li><a href="ReporteControlador">Envie Sugerencias</a>												
				<li><a href="Administrador.jsp">Login</a></li>
			</ul>
		</div>
	</body>
</html>