package Clases;

public class Auditorio extends Lugar {
	private String aud_nombre;
	private int aud_capacidad;
	
	public String getAud_nombre() {
		return aud_nombre;
	}
	public void setAud_nombre(String aud_nombre) {
		this.aud_nombre = aud_nombre;
	}
	public int getAud_capacidad() {
		return aud_capacidad;
	}
	public void setAud_capacidad(int aud_capacidad) {
		this.aud_capacidad = aud_capacidad;
	}
	public Auditorio(String nombre_bloque,String aud_nombre, int aud_capacidad){
		super(nombre_bloque);
		this.aud_nombre=aud_nombre;
		this.aud_capacidad=aud_capacidad;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub		
	}
}