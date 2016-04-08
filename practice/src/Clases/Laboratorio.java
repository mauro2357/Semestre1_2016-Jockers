package Clases;

public class Laboratorio extends Lugar {
	private String lab_nombre;
	private String horario_nombre;
	private String lab_descripcion;
	private String lab_videobeam;
	
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
	public String getHorario_nombre() {
		return horario_nombre;
	}
	public void setHorario_nombre(String horario_nombre) {
		this.horario_nombre = horario_nombre;
	}
	public Laboratorio(String nombre_bloque, String lab_nombre, String horario_nombre, String lab_descripcion, String lab_videobeam){
		super(nombre_bloque);
		this.lab_nombre=lab_nombre;
		this.horario_nombre=horario_nombre;
		this.lab_descripcion=lab_descripcion;
		this.lab_videobeam=lab_videobeam;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}
