package Clases;

public class MateriaAgregar extends BloquesPrincipal{
	public String materia_nombre;
	public int materia_creditos;
	public String aula_nombre;
	public String facultad_nombre;
	public String horario_nombre;
	
	public String getMateria_nombre() {
		return materia_nombre;
	}
	public void setMateria_nombre(String materia_nombre) {
		this.materia_nombre = materia_nombre;
	}
	public int getMateria_creditos() {
		return materia_creditos;
	}
	public void setMateria_creditos(int materia_creditos) {
		this.materia_creditos = materia_creditos;
	}
	public String getAula_nombre() {
		return aula_nombre;
	}
	public void setAula_nombre(String aula_nombre) {
		this.aula_nombre = aula_nombre;
	}
	public String getFacultad_nombre() {
		return facultad_nombre;
	}
	public void setFacultad_nombre(String facultad_nombre) {
		this.facultad_nombre = facultad_nombre;
	}
	public String getHorario_nombre() {
		return horario_nombre;
	}
	public void setHorario_nombre(String horario_nombre) {
		this.horario_nombre = horario_nombre;
	}
	public MateriaAgregar(String materia_nombre, int materia_creditos, String nombre_bloque, String aula_nombre, String facultad_nombre, String horario_nombre){
		super(nombre_bloque);
		this.materia_nombre=materia_nombre;
		this.materia_creditos=materia_creditos;
		this.aula_nombre=aula_nombre;
		this.facultad_nombre=facultad_nombre;
		this.horario_nombre=horario_nombre;
	}
	
	
	
	

}