package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Materia;
import Clases.MateriaHorarioA;
import Clases.MateriaHorarioAA;
import Clases.MateriaHorarioAAA;

public class MateriaRepositorio {
	public MateriaRepositorio(Materia Materia1){
	}
	public static boolean agregar(Materia Materia1) throws Exception{
		Connection con = new Conexion().obtenerConexion() ;
        Statement st = con.createStatement();
        	if(Materia1 instanceof MateriaHorarioA){ 
            	String i = "INSERT INTO materias (`mat_nombre`, `mat_creditos`, `hor_nombre`, `blo_nombre`, `aul_nombre`, `fac_nombre` ) VALUES ('"+ Materia1.getMateria_nombre()+ "',"+ Materia1.getMateria_creditos()+ ",'" + Materia1.getHorario_nombre() +"','" + Materia1.getNombre_bloque()+ "','" + Materia1.getAula_nombre()+"','" + Materia1.getFacultad_nombre()+ "')"; 
            	System.out.println("Horario A " + i);
            	st.executeUpdate(i);
            	st.close();
            	}        		
            if(Materia1 instanceof MateriaHorarioAA){
            	String i = "INSERT INTO materias (`mat_nombre`, `mat_creditos`, `hor_nombre`, `blo_nombre`, `aul_nombre`, `fac_nombre` ) VALUES ('"+ Materia1.getMateria_nombre()+ "',"+ Materia1.getMateria_creditos()+ ",'" + Materia1.getHorario_nombre() +"','" + Materia1.getNombre_bloque()+ "','" + Materia1.getAula_nombre()+"','" + Materia1.getFacultad_nombre()+ "')"; 
                System.out.println("Horario AA "+ i);
                st.executeUpdate(i);
                st.close();
                }
            if(Materia1 instanceof MateriaHorarioAAA){            			
            	String i = "INSERT INTO materias (`mat_nombre`, `mat_creditos`, `hor_nombre`, `blo_nombre`, `aul_nombre`, `fac_nombre` ) VALUES ('"+ Materia1.getMateria_nombre()+ "',"+ Materia1.getMateria_creditos()+ ",'" + Materia1.getHorario_nombre() +"','" + Materia1.getNombre_bloque()+ "','" + Materia1.getAula_nombre()+"','" + Materia1.getFacultad_nombre()+ "')"; 
                System.out.println("Horario AAA " + i);
                st.executeUpdate(i);
                st.close();
                }     			
            return true;
    }
}


