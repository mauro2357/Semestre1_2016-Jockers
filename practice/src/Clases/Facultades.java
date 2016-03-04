package Clases;

public class Facultades {
	private String facultades_bloque;
	private String facultades_nombre;
	private int facultades_telefono;
	private String facultades_hora_apertura;
	private String facultades_hora_cierre;
	private String facultades_descripcion;
	
	public String getFacultades_bloque() {
		return facultades_bloque;
	}
	public void setFacultades_bloque(String facultades_bloque) {
		this.facultades_bloque = facultades_bloque;
	}
	public String getFacultades_nombre() {
		return facultades_nombre;
	}
	public void setFacultades_nombre(String facultades_nombre) {
		this.facultades_nombre = facultades_nombre;
	}
	public int getFacultades_telefono() {
		return facultades_telefono;
	}
	public void setFacultades_telefono(int facultades_telefono) {
		this.facultades_telefono = facultades_telefono;
	}	
	public String getFacultades_hora_apertura() {
		return facultades_hora_apertura;
	}
	public void setFacultades_hora_apertura(String facultades_hora_apertura) {
		this.facultades_hora_apertura = facultades_hora_apertura;
	}
	public String getFacultades_hora_cierre() {
		return facultades_hora_cierre;
	}
	public void setFacultades_hora_cierre(String facultades_hora_cierre) {
		this.facultades_hora_cierre = facultades_hora_cierre;
	}
	public String getFacultades_descripcion() {
		return facultades_descripcion;
	}
	public void setFacultades_descripcion(String facultades_descripcion) {
		this.facultades_descripcion = facultades_descripcion;
	}
	public Facultades(String facultades_bloque, String facultades_nombre, int facultades_telefono, String facultades_hora_apertura, String facultades_hora_cierre, String facultades_descripcion){
		this.facultades_bloque=facultades_bloque;
		this.facultades_nombre=facultades_nombre;
		this.facultades_telefono=facultades_telefono;
		this.facultades_hora_apertura=facultades_hora_apertura;
		this.facultades_hora_cierre=facultades_hora_cierre;
		this.facultades_descripcion=facultades_descripcion;
	}
}