package Clases;

public class OratoriosAgregar {
	private String ora_bloque;
	private String ora_nombre;
	private int ora_capacidad;
	
	public String getOra_bloque() {
		return ora_bloque;
	}
	public void setOra_bloque(String ora_bloque) {
		this.ora_bloque = ora_bloque;
	}
	public String getOra_nombre() {
		return ora_nombre;
	}
	public void setOra_nombre(String ora_nombre) {
		this.ora_nombre = ora_nombre;
	}
	public int getOra_capacidad() {
		return ora_capacidad;
	}
	public void setOra_capacidad(int ora_capacidad) {
		this.ora_capacidad = ora_capacidad;
	}
	public OratoriosAgregar(String ora_bloque, String ora_nombre, int ora_capacidad){
		this.ora_bloque=ora_bloque;
		this.ora_nombre=ora_nombre;
		this.ora_capacidad=ora_capacidad;
	}
}