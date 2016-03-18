package Clases;

public class ParqueaderosAgregar extends BloquesPrincipal {
	private String par_nombre;
	private int par_capacidad;
	
	public String getPar_nombre() {
		return par_nombre;
	}
	public void setPar_nombre(String par_nombre) {
		this.par_nombre = par_nombre;
	}
	public int getPar_capacidad() {
		return par_capacidad;
	}
	public void setPar_capacidad(int par_capacidad) {
		this.par_capacidad = par_capacidad;
	}
	public ParqueaderosAgregar(String nombre_bloque, String par_nombre, int par_capacidad){
		super(nombre_bloque);
		this.par_nombre=par_nombre;
		this.par_capacidad=par_capacidad;
	}
}