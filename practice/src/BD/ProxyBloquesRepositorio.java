package BD;

import Clases.Bloque;

public class ProxyBloquesRepositorio implements IBloquesRepositorio{
	public ProxyBloquesRepositorio() {
    }
    public void agregar(Bloque Bloque1){
    	BloquesRepositorio bloquerepositorio = new BloquesRepositorio();
        if (!Bloque1.getNombre_bloque().equals("null")){
        	bloquerepositorio.agregar(Bloque1);
        }else{
        	System.out.println("No se puede agregar Bloque, su nombre no puede ser nulo");
        }
    }
   
}