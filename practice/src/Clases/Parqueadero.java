package Clases;

public class Parqueadero extends Lugar {
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
	public Parqueadero(String nombre_bloque, String par_nombre, int par_capacidad){
		super(nombre_bloque);
		this.par_nombre=par_nombre;
		this.par_capacidad=par_capacidad;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}