package Clases;

public class SalasAgregar {
	public String blo_nombre;
	public String sal_nombre;
	public int sal_equipos;
	public String sal_videobeam;
	public String sal_hora_apertura;
	public String sal_hora_cierre;
	
	public String getBlo_nombre() {
		return blo_nombre;
	}
	public void setBlo_nombre(String blo_nombre) {
		this.blo_nombre = blo_nombre;
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
	public String getSal_hora_apertura() {
		return sal_hora_apertura;
	}
	public void setSal_hora_apertura(String sal_hora_apertura) {
		this.sal_hora_apertura = sal_hora_apertura;
	}
	public String getSal_hora_cierre() {
		return sal_hora_cierre;
	}
	public void setSal_hora_cierre(String sal_hora_cierre) {
		this.sal_hora_cierre = sal_hora_cierre;
	}
	public SalasAgregar(String blo_nombre, String sal_nombre, int sal_equipos, String sal_hora_apertura, String sal_hora_cierre, String sal_videobeam){
		this.blo_nombre=blo_nombre;
		this.sal_nombre=sal_nombre;
		this.sal_equipos=sal_equipos;
		this.sal_videobeam=sal_videobeam;
		this.sal_hora_apertura=sal_hora_apertura;
		this.sal_hora_cierre=sal_hora_cierre;
	}
}		