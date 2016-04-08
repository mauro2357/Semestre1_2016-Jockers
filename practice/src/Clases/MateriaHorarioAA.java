package Clases;

public class MateriaHorarioAA extends Materia{
	public MateriaHorarioAA (String horario_nombre, String materia_nombre, int materia_creditos, String nombre_bloque, String aula_nombre, String facultad_nombre ){
		super(horario_nombre, materia_creditos , materia_nombre,  nombre_bloque, aula_nombre, facultad_nombre);
	 }
	@Override
	public boolean validar() {
		String facultad= getFacultad_nombre();
		 if(facultad.equals("Ingenieria"))return true;
		 return false;		
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}
}

