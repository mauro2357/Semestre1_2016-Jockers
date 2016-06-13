package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Laboratorio;

public class LaboratoriosRepositorio {
	public LaboratoriosRepositorio(Laboratorio Laboratorios1){
	}
	public static void agregar(Laboratorio Laboratorios1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO laboratorios (`blo_nombre`, `lab_nombre`, `lab_descripcion`, `hor_nombre`, `lab_videobeam_tv`) VALUES ('"+ Laboratorios1.getNombre_bloque()+ "','"+ Laboratorios1.getLab_nombre()+ "','" + Laboratorios1.getLab_descripcion()+ "','" +Laboratorios1.getHorario_nombre()+ "','" + Laboratorios1.getLab_videobeam() +"')"; 
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
    }
}