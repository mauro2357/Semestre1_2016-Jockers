package Clases;

public abstract class Lugar{
	public String nombre_bloque;

	public String getNombre_bloque() {
		return nombre_bloque;
	}
	public void setNombre_bloque(String nombre_bloque) {
		this.nombre_bloque = nombre_bloque;
	}
	public Lugar(String nombre_bloque){
		this.nombre_bloque=nombre_bloque;
	}
	public Lugar(){
		super();
	}
	public abstract void agregar() throws Exception;
}
