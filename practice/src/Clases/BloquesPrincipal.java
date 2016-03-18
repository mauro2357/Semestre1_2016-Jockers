package Clases;

public class BloquesPrincipal {
	public String nombre_bloque;

	public String getNombre_bloque() {
		return nombre_bloque;
	}
	public void setNombre_bloque(String nombre_bloque) {
		this.nombre_bloque = nombre_bloque;
	}
	public BloquesPrincipal(String nombre_bloque){
		this.nombre_bloque=nombre_bloque;
	}
	public BloquesPrincipal(){
		super();
	}	
}
