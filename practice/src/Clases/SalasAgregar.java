package Clases;

public class SalasAgregar extends BloquesPrincipal {
	public String sal_nombre;
	public int sal_equipos;
	public String sal_videobeam;
	public String horario_nombre;;
	
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
	public String getHorario_nombre() {
		return horario_nombre;
	}
	public void setHorario_nombre(String horario_nombre) {
		this.horario_nombre = horario_nombre;
	}
	public SalasAgregar(String nombre_bloque, String sal_nombre, int sal_equipos, String horario_nombre, String sal_videobeam){
		super(nombre_bloque);
		this.sal_nombre=sal_nombre;
		this.sal_equipos=sal_equipos;
		this.sal_videobeam=sal_videobeam;
		this.horario_nombre=horario_nombre;
	}
}		