package Clases;

public class Aulas {	
	private String nombre_aula;
	private String nombre_bloque;
	private int capacidad;
	private String videobeam;
	
	public String getNombre_aula() {
		return nombre_aula;
	}
	public void setNombre_aula(String nombre_aula) {
		this.nombre_aula = nombre_aula;
	}
	public String getNombre_bloque() {
		return nombre_bloque;
	}
	public void setNombre_bloque(String nombre_bloque) {
		this.nombre_bloque = nombre_bloque;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getVideobeam() {
		return videobeam;
	}
	public void setVideobeam(String videobeam) {
		this.videobeam = videobeam;
	}
	public Aulas(String nombre_aula,String nombre_bloque,String videobeam,int capacidad){
		this.nombre_aula=nombre_aula;
		this.nombre_bloque=nombre_bloque;
		this.capacidad=capacidad;
		this.videobeam=videobeam;
	}
}
