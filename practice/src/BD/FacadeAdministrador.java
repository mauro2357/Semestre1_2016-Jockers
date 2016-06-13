package BD;

import Clases.Administrador;

public class FacadeAdministrador {
	public static boolean ingresar(Administrador nadministrador) throws Exception{
		if(AdministradorRepositorio.validate(nadministrador)){ 
			return true;
		}
		return false;
	}
public static String orquestador(Administrador nadministrador) throws Exception{
	if (ingresar (nadministrador))return "Ingreso";
	return "NoIngreso";
	}
}


