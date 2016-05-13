package Clases;

public class PuntoReferencia {
	private String pun_nombre;
	private double pun_latitud;
	private double pun_longitud;
	public String getPun_nombre() {
		return pun_nombre;
	}
	public void setPun_nombre(String pun_nombre) {
		this.pun_nombre = pun_nombre;
	}
	public double getPun_latitud() {
		return pun_latitud;
	}
	public void setPun_latitud(double pun_latitud) {
		this.pun_latitud = pun_latitud;
	}
	public double getPun_longitud() {
		return pun_longitud;
	}
	public void setPun_longitud(double pun_longitud) {
		this.pun_longitud = pun_longitud;
	}
	public PuntoReferencia(String pun_nombre, double pun_latitud,
			double pun_longitud) {
		super();
		this.pun_nombre = pun_nombre;
		this.pun_latitud = pun_latitud;
		this.pun_longitud = pun_longitud;
	}	
}
