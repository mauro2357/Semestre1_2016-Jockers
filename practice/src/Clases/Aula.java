package Clases;

public class Aula extends Lugar {	
	private String nombre_aula;
	private int capacidad;
	private String videobeam;
	
	public String getNombre_aula() {
		return nombre_aula;
	}
	public void setNombre_aula(String nombre_aula) {
		this.nombre_aula = nombre_aula;
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
	public Aula(String nombre_aula,String nombre_bloque,String videobeam,int capacidad){
		super(nombre_bloque);
		this.nombre_aula=nombre_aula;
		this.capacidad=capacidad;
		this.videobeam=videobeam;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}