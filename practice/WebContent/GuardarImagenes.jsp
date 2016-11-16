<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cargar_imagen</title>
</head>
<body>
<h2>guardar una nueva imagen </h2>
<div class="caja">
<form method="post"  action="ImagenesControlador"  enctype="multipar/form-data">
<p> nombre de la imagen <input type="text"  name ="nombre" value="<%=request.getParameter("nombre")!=null?request.getParameter("nombre"):""%>"  /><br/></p>
<p>buscar la direccion<input type ="file" name ="direccion"  value="<%=request.getParameter("direccion")!=null?request.getParameter("direccion"):""%>"  />/><br/> </p>
<input type="submit"name ="boton" >
<a href="MenuPrincipal.html">Regrese al Menu Principal</a>


</form>
 </div>

</body>
</html>