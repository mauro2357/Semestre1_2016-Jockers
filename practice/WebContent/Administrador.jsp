<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingreso Administrador</title>
<link rel="stylesheet" type="text/css" href="estilo1.css" media="screen"/>
</head>
<body>
<form action="AdministradorControlador" method="post">        
            <h2> Ingreso de Administradores </h2><br>
              <fieldset style="width:300px"> 
            <table>  
                <tr>  
                    <td>Nombre de Usuario</td>  
                    <td><input type="text" name="adminuser" value="<%=request.getParameter("adminuser")!=null?request.getParameter("adminuser"):""%>"  /></td>  
                </tr>  
                <tr>  
                    <td>Password</td>  
                    <td><input type="password" name="adminpass" value="<%=request.getParameter("adminpass")!=null?request.getParameter("adminpass"):""%>"  /></td>  
                </tr>  
                <tr> 
                    <td><input type="submit" value="Ingresar" /></td>  
                </tr>  
            </table>  
        </fieldset><br>
	  <a href="VistaPrincipalControlador">Regrese al Menu Principal</a>
    </form>
</body>
</html>