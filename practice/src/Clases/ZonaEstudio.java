package Clases;

public class ZonaEstudio {
	private String zona_nombre;
	private int zona_capacidad;
	private String zona_bloque;
	
	public String getZona_nombre() {
		return zona_nombre;
	}
	public void setZona_nombre(String zona_nombre) {
		this.zona_nombre = zona_nombre;
	}
	public int getZona_capacidad() {
		return zona_capacidad;
	}
	public void setZona_capacidad(int zona_capacidad) {
		this.zona_capacidad = zona_capacidad;
	}
	public String getZona_bloque() {
		return zona_bloque;
	}
	public void setZona_bloque(String zona_bloque) {
		this.zona_bloque = zona_bloque;
	}
	public ZonaEstudio(String zona_nombre, int zona_capacidad, String zona_bloque){
		this.zona_nombre=zona_nombre;
		this.zona_capacidad=zona_capacidad;
		this.zona_bloque=zona_bloque;
	}
}
	