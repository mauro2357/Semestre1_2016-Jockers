package Clases;

public class Oficinas {
	private String ofi_bloque;
	private String ofi_nombre;
	private int ofi_telefono;
	private String ofi_horario;
	private String ofi_descripcion;
	
	public String getOfi_bloque() {
		return ofi_bloque;
	}
	public void setOfi_bloque(String ofi_bloque) {
		this.ofi_bloque = ofi_bloque;
	}
	public String getOfi_nombre() {
		return ofi_nombre;
	}
	public void setOfi_nombre(String ofi_nombre) {
		this.ofi_nombre = ofi_nombre;
	}
	public int getOfi_telefono() {
		return ofi_telefono;
	}
	public void setOfi_telefono(int ofi_telefono) {
		this.ofi_telefono = ofi_telefono;
	}
	public String getOfi_horario() {
		return ofi_horario;
	}
	public void setOfi_horario(String ofi_horario) {
		this.ofi_horario = ofi_horario;
	} 
	public String getOfi_descripcion() {
		return ofi_descripcion;
	}
	public void setOfi_descripcion(String ofi_descripcion) {
		this.ofi_descripcion = ofi_descripcion;
	}
	public Oficinas(String ofi_bloque, String ofi_nombre, int ofi_telefono, String ofi_horario, String ofi_descripcion){
		this.ofi_bloque=ofi_bloque;
		this.ofi_nombre=ofi_nombre;
		this.ofi_telefono=ofi_telefono;
		this.ofi_horario=ofi_horario;
		this.ofi_descripcion=ofi_descripcion;
	}
}