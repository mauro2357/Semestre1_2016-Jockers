package Clases;

public class Facultad extends Lugar {
	private String facultades_nombre;
	private int facultades_telefono;
	private String facultades_horario;
	private String facultades_descripcion;
	
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
	public String getFacultades_horario() {
		return facultades_horario;
	}
	public void setFacultades_horario(String facultades_horario) {
		this.facultades_horario = facultades_horario;
	}
	public String getFacultades_descripcion() {
		return facultades_descripcion;
	}
	public void setFacultades_descripcion(String facultades_descripcion) {
		this.facultades_descripcion = facultades_descripcion;
	}
	public Facultad(String nombre_bloque, String facultades_nombre, int facultades_telefono, String facultades_horario, String facultades_descripcion){
		super(nombre_bloque);
		this.facultades_nombre=facultades_nombre;
		this.facultades_telefono=facultades_telefono;
		this.facultades_horario=facultades_horario;
		this.facultades_descripcion=facultades_descripcion;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}