package Clases;

public class Laboratorios {
	private String lab_bloque;
	private String lab_nombre;
	private String lab_descripcion;
	private String lab_videobeam;
	
	public String getLab_bloque() {
		return lab_bloque;
	}
	public void setLab_bloque(String lab_bloque) {
		this.lab_bloque = lab_bloque;
	}
	public String getLab_nombre() {
		return lab_nombre;
	}
	public void setLab_nombre(String lab_nombre) {
		this.lab_nombre = lab_nombre;
	}
	public String getLab_descripcion() {
		return lab_descripcion;
	}
	public void setLab_descripcion(String lab_descripcion) {
		this.lab_descripcion = lab_descripcion;
	}
	public String getLab_videobeam() {
		return lab_videobeam;
	}
	public void setLab_videobeam(String lab_videobeam) {
		this.lab_videobeam = lab_videobeam;
	}
	public Laboratorios(String lab_bloque, String lab_nombre, String lab_descripcion, String lab_videobeam){
		this.lab_bloque=lab_bloque;
		this.lab_nombre=lab_nombre;
		this.lab_descripcion=lab_descripcion;
		this.lab_videobeam=lab_videobeam;
	}
}
