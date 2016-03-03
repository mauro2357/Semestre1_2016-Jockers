package Clases;

public class Cafeterias {
	private String caf_bloque;
	private String caf_nombre;
	private int caf_capacidad;
	
	public String getCaf_bloque() {
		return caf_bloque;
	}
	public void setCaf_bloque(String caf_bloque) {
		this.caf_bloque = caf_bloque;
	}
	public String getCaf_nombre() {
		return caf_nombre;
	}
	public void setCaf_nombre(String caf_nombre) {
		this.caf_nombre = caf_nombre;
	}
	public int getCaf_capacidad() {
		return caf_capacidad;
	}
	public void setCaf_capacidad(int caf_capacidad) {
		this.caf_capacidad = caf_capacidad;
	}
	public Cafeterias(String caf_bloque, String caf_nombre, int caf_capacidad){
		this.caf_bloque=caf_bloque;
		this.caf_nombre=caf_nombre;
		this.caf_capacidad=caf_capacidad;
	}
}