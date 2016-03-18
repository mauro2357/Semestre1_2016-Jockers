package Clases;

public class AuditoriosAgregar extends BloquesPrincipal {
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
	public AuditoriosAgregar(String nombre_bloque,String aud_nombre, int aud_capacidad){
		super(nombre_bloque);
		this.aud_nombre=aud_nombre;
		this.aud_capacidad=aud_capacidad;
	}
}