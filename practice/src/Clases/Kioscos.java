package Clases;

public class Kioscos {
	private String kio_bloque;
	private String kio_nombre;
	private int kio_capacidad;
	
	public String getKio_bloque() {
		return kio_bloque;
	}
	public void setKio_bloque(String kio_bloque) {
		this.kio_bloque = kio_bloque;
	}
	public String getKio_nombre() {
		return kio_nombre;
	}
	public void setKio_nombre(String kio_nombre) {
		this.kio_nombre = kio_nombre;
	}
	public int getKio_capacidad() {
		return kio_capacidad;
	}
	public void setKio_capacidad(int kio_capacidad) {
		this.kio_capacidad = kio_capacidad;
	}
	public Kioscos(String kio_bloque, String kio_nombre, int kio_capacidad){
		this.kio_bloque=kio_bloque;
		this.kio_nombre=kio_nombre;
		this.kio_capacidad=kio_capacidad;
	}
}