package Clases;

public class MateriaHorarioAAA extends Materia{
	public MateriaHorarioAAA (String horario_nombre, String materia_nombre, int materia_creditos, String nombre_bloque, String aula_nombre, String facultad_nombre){
		super(horario_nombre, materia_creditos , materia_nombre,  nombre_bloque, aula_nombre, facultad_nombre);
	 }	 
	@Override
	public boolean validar() {
		int creditos = getMateria_creditos();
		if(creditos < 7)return true;
		return false;
	}
	@Override
	public void agregar() {
		// TODO Auto-generated method stub
	}	

}
