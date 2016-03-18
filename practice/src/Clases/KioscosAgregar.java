package Clases;

public class KioscosAgregar extends BloquesPrincipal {
	private String kio_nombre;
	private int kio_capacidad;
		
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
	public KioscosAgregar(String nombre_bloque, String kio_nombre, int kio_capacidad){
		super(nombre_bloque);
		this.kio_nombre=kio_nombre;
		this.kio_capacidad=kio_capacidad;
	}
}