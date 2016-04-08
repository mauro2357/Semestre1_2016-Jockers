package Clases;

public abstract class Horario extends Lugar{
	public String horario_nombre;
	
	public String getHorario_nombre() {
		return horario_nombre;
	}
	public void setHorario_nombre(String horario_nombre) {
		this.horario_nombre = horario_nombre;
	}	
	public Horario(String horario_nombre, String nombre_bloque){
		super (nombre_bloque);
		this.horario_nombre=horario_nombre;		
	}
	public abstract boolean validar();		
	
}	
	