package Clases;

public class Facultades {
	private String facu_bloque;
	private String fac_nombre;
	private int fac_telefono;
	private String fac_horario;
	private String fac_descripcion;
	
	public String getFacu_bloque() {
		return facu_bloque;
	}
	public void setFacu_bloque(String facu_bloque) {
		this.facu_bloque = facu_bloque;
	}
	public String getFac_nombre() {
		return fac_nombre;
	}
	public void setFac_nombre(String fac_nombre) {
		this.fac_nombre = fac_nombre;
	}
	public int getFac_telefono() {
		return fac_telefono;
	}
	public void setFac_telefono(int fac_telefono) {
		this.fac_telefono = fac_telefono;
	}
	public String getFac_horario() {
		return fac_horario;
	}
	public void setFac_horario(String fac_horario) {
		this.fac_horario = fac_horario;
	}
	public String getFac_descripcion() {
		return fac_descripcion;
	}
	public void setFac_descripcion(String fac_descripcion) {
		this.fac_descripcion = fac_descripcion;
	}
	public Facultades(String facu_bloque, String fac_nombre, int fac_telefono, String fac_horario, String fac_descripcion){
		this.facu_bloque=facu_bloque;
		this.fac_nombre=fac_nombre;
		this.fac_telefono=fac_telefono;
		this.fac_horario=fac_horario;
		this.fac_descripcion=fac_descripcion;		
	}
}
