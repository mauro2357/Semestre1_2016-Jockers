package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Aula;

public class AulasRepositorio {
	public AulasRepositorio(Aula Aulas1){
	}
	public static void agregar(Aula Aulas1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO aulas (`blo_nombre`, `aul_nombre`, `aul_videobeam_tv`, `aul_capacidad`) VALUES ('"+ Aulas1.getNombre_bloque() + "','"+ Aulas1.getNombre_aula() + "','" + Aulas1.getVideobeam() +"',"+ Aulas1.getCapacidad()+ ")";
        System.out.println(i);
        st.executeUpdate(i);
        st.close();       
    }
}

	
