package Clases;

public class LaboratoriosAgregar {
	private String lab_bloque;
	private String lab_nombre;
	private String lab_hora_apertura;
	private String lab_hora_cierre;
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
	public String getLab_hora_apertura() {
		return lab_hora_apertura;
	}
	public void setLab_hora_apertura(String lab_hora_apertura) {
		this.lab_hora_apertura = lab_hora_apertura;
	}
	public String getLab_hora_cierre() {
		return lab_hora_cierre;
	}
	public void setLab_hora_cierre(String lab_hora_cierre) {
		this.lab_hora_cierre = lab_hora_cierre;
	}
	public LaboratoriosAgregar(String lab_bloque, String lab_nombre, String lab_hora_apertura, String lab_hora_cierre, String lab_descripcion, String lab_videobeam){
		this.lab_bloque=lab_bloque;
		this.lab_nombre=lab_nombre;
		this.lab_hora_apertura=lab_hora_apertura;
		this.lab_hora_cierre=lab_hora_cierre;
		this.lab_descripcion=lab_descripcion;
		this.lab_videobeam=lab_videobeam;
	}
}
