package Clases;

public class ZonaEstudio extends Lugar{
	private String zona_nombre;
	private int zona_capacidad;
		
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
	public ZonaEstudio(String zona_nombre, int zona_capacidad, String nombre_bloque){
		super(nombre_bloque);
		this.zona_nombre=zona_nombre;
		this.zona_capacidad=zona_capacidad;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}
		

	