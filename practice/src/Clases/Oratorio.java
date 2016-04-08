package Clases;

public class Oratorio extends Lugar {
	private String ora_nombre;
	private int ora_capacidad;
	
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
	public Oratorio(String nombre_bloque, String ora_nombre, int ora_capacidad){
		super(nombre_bloque);
		this.ora_nombre=ora_nombre;
		this.ora_capacidad=ora_capacidad;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}