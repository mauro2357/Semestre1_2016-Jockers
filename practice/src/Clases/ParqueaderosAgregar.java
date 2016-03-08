package Clases;

public class ParqueaderosAgregar {
	private String par_bloque;
	private String par_nombre;
	private int par_capacidad;
	
	public String getPar_bloque() {
		return par_bloque;
	}
	public void setPar_bloque(String par_bloque) {
		this.par_bloque = par_bloque;
	}
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
	public ParqueaderosAgregar(String par_bloque, String par_nombre, int par_capacidad){
		this.par_bloque=par_bloque;
		this.par_nombre=par_nombre;
		this.par_capacidad=par_capacidad;
	}
}