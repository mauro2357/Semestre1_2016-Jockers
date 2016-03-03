package Clases;

public class Salas {
	private String sal_bloque;
	private String sal_nombre;
	private int sal_equipos;
	private String sal_videobeam;
	
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
	public int getSal_equipos() {
		return sal_equipos;
	}
	public void setSal_equipos(int sal_equipos) {
		this.sal_equipos = sal_equipos;
	}
	public String getSal_videobeam() {
		return sal_videobeam;
	}
	public void setSal_videobeam(String sal_videobeam) {
		this.sal_videobeam = sal_videobeam;
	} 
	public Salas(String sal_bloque, String sal_nombre, int sal_equipos, String sal_videobeam){
		this.sal_bloque=sal_bloque;
		this.sal_nombre=sal_nombre;
		this.sal_equipos=sal_equipos;
		this.sal_videobeam=sal_videobeam;
	}
}	