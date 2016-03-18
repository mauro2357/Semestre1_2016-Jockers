package Clases;

public class CafeteriasAgregar extends BloquesPrincipal {
	private String caf_nombre;
	private int caf_capacidad;
		
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
	public CafeteriasAgregar(String nombre_bloque, String caf_nombre, int caf_capacidad){
		super(nombre_bloque);
		this.caf_nombre=caf_nombre;
		this.caf_capacidad=caf_capacidad;
	}
}