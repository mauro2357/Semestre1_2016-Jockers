package Controlador;

import BD.AdministradorRepositorio;
import Clases.Administrador;

public class FacadeAdministrador {
	public static boolean ingresar(Administrador nadministrador){
		if(AdministradorRepositorio.validate(nadministrador)){ 
			return true;
		}
		return false;
	}
public static String orquestador(Administrador nadministrador){
	if (ingresar (nadministrador))return "Ingreso";
	return "NoIngreso";
	}
}



			