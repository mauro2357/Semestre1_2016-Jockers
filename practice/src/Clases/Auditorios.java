package Clases;

public class Auditorios {
	private String aud_bloque;
	private String aud_nombre;
	private int aud_capacidad;
	
	public String getAud_bloque() {
		return aud_bloque;
	}
	public void setAud_bloque(String aud_bloque) {
		this.aud_bloque = aud_bloque;
	}
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
	public Auditorios(String aud_bloque, String aud_nombre, int aud_capacidad){
		this.aud_bloque=aud_bloque;
		this.aud_nombre=aud_nombre;
		this.aud_capacidad=aud_capacidad;
	}
}