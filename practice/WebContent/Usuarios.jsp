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
				
				<li><a>Consultar Horarios</a>
					<ul>
					<li><a href="ConsultaOficinasControlador">Horarios Oficinas</a>
					<li><a href="ConsultaSalasControlador">Horarios Salas</a>
					<li><a href="ConsultaLaboratoriosControlador">Horarios Laboratorios</a>
					</ul>					
				</li>			
				<li><a href="ReporteControlador">Envie Sugerencias</a>
				<li><a href="ImagenesUsuario.jsp">Envie Imágenes</a></li>
				<li><a href="BloquesInfoControlador">Caracteristicas Bloques</a></li>
				<li><a href="Administrador.jsp">Login</a></li>
			</ul>
		</div>
	</body>
</html>