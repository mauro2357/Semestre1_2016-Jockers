package Clases;

public class OficinasAgregar {
	private String ofi_bloque;
	private String ofi_nombre;
	private int ofi_telefono;
	private String ofi_hora_apertura;
	private String ofi_hora_cierre;
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
	 
	public String getOfi_hora_apertura() {
		return ofi_hora_apertura;
	}
	public void setOfi_hora_apertura(String ofi_hora_apertura) {
		this.ofi_hora_apertura = ofi_hora_apertura;
	}
	public String getOfi_hora_cierre() {
		return ofi_hora_cierre;
	}
	public void setOfi_hora_cierre(String ofi_hora_cierre) {
		this.ofi_hora_cierre = ofi_hora_cierre;
	}
	public String getOfi_descripcion() {
		return ofi_descripcion;
	}
	public void setOfi_descripcion(String ofi_descripcion) {
		this.ofi_descripcion = ofi_descripcion;
	}
	public OficinasAgregar(String ofi_bloque, String ofi_nombre, int ofi_telefono, String ofi_hora_apertura, String ofi_hora_cierre, String ofi_descripcion){
		this.ofi_bloque=ofi_bloque;
		this.ofi_nombre=ofi_nombre;
		this.ofi_telefono=ofi_telefono;
		this.ofi_hora_apertura=ofi_hora_apertura;
		this.ofi_hora_cierre=ofi_hora_cierre;
		this.ofi_descripcion=ofi_descripcion;
	}
}