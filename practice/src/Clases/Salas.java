package Clases;

public class Salas {
	public String sal_bloque;
	public String sal_nombre;
	public int sal_telefono;
	public String sal_horario;
	public String sal_descripcion;
	
	public String getSal_bloque() {
		return sal_bloque;
	}
	public void setSal_bloque(String sal_bloque) {
		this.sal_bloque = sal_bloque;
	}
	public String getSal_nombre() {
		return sal_nombre;
	}
	public void setSal_nombre(String sal_nombre) {
		this.sal_nombre = sal_nombre;
	}
	public int getSal_telefono() {
		return sal_telefono;
	}
	public void setSal_telefono(int sal_telefono) {
		this.sal_telefono = sal_telefono;
	}
	public String getSal_horario() {
		return sal_horario;
	}
	public void setSal_horario(String sal_horario) {
		this.sal_horario = sal_horario;
	}
	public String getSal_descripcion() {
		return sal_descripcion;
	}
	public void setSal_descripcion(String sal_descripcion) {
		this.sal_descripcion = sal_descripcion;
	}
	public Salas(String sal_bloque,String sal_nombre, int sal_telefono, String sal_horario, String sal_descripcion){
		this.sal_bloque=sal_bloque;
		this.sal_nombre=sal_nombre;
		this.sal_telefono=sal_telefono;
		this.sal_horario=sal_horario;
		this.sal_descripcion=sal_descripcion;
	}
}