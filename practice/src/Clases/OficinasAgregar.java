package Clases;

public class OficinasAgregar extends BloquesPrincipal {
	private String ofi_nombre;
	private int ofi_telefono;
	private String horario_nombre;
	private String ofi_descripcion;
	
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
	 
	public String getHorario_nombre() {
		return horario_nombre;
	}
	public void setHorario_nombre(String horario_nombre) {
		this.horario_nombre = horario_nombre;
	}
	public String getOfi_descripcion() {
		return ofi_descripcion;
	}
	public void setOfi_descripcion(String ofi_descripcion) {
		this.ofi_descripcion = ofi_descripcion;
	}
	public OficinasAgregar(String nombre_bloque, String ofi_nombre, int ofi_telefono, String horario_nombre, String ofi_descripcion){
		super(nombre_bloque);
		this.ofi_nombre=ofi_nombre;
		this.ofi_telefono=ofi_telefono;
		this.horario_nombre=horario_nombre;
		this.ofi_descripcion=ofi_descripcion;
	}
}