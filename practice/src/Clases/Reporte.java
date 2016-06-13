package Clases;

import BD.IReporteRepositorio;


public abstract class Reporte {
	private IReporteRepositorio reporteRepositorio;
	
	public Reporte(IReporteRepositorio reporteRepositorio){
		this.reporteRepositorio=reporteRepositorio;
	}
	public String reporte_nombre;
	public String reporte_reporte;
	public String reporte_correo;
	public String reporte_usuario;	
	
	public Reporte(IReporteRepositorio reporteRepositorio, String reporte_nombre, String reporte_reporte,
			String reporte_correo, String reporte_usuario) {
		super();
		this.reporteRepositorio=reporteRepositorio;		
		this.reporte_nombre = reporte_nombre;
		this.reporte_reporte = reporte_reporte;
		this.reporte_correo = reporte_correo;
		this.reporte_usuario = reporte_usuario;
	}
	public String getReporte_nombre() {
		return reporte_nombre;
	}
	public void setReporte_nombre(String reporte_nombre) {
		this.reporte_nombre = reporte_nombre;
	}
	public String getReporte_reporte() {
		return reporte_reporte;
	}
	public void setReporte_reporte(String reporte_reporte) {
		this.reporte_reporte = reporte_reporte;
	}
	public String getReporte_correo() {
		return reporte_correo;
	}
	public void setReporte_correo(String reporte_correo) {
		this.reporte_correo = reporte_correo;
	}
	public String getReporte_usuario() {
		return reporte_usuario;
	}
	public void setReporte_usuario(String reporte_usuario) {
		this.reporte_usuario = reporte_usuario;
	}	
	public void agregar() throws Exception {
		reporteRepositorio.agregar(this);		
	}
		
}
