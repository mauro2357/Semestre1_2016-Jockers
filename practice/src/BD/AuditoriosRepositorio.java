package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Auditorio;

public class AuditoriosRepositorio {
	public AuditoriosRepositorio(Auditorio Auditorios1){
	}
	public static void agregar (Auditorio Auditorios1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO auditorios (`blo_nombre`, `aud_nombre`, `aud_capacidad`) VALUES ('"+ Auditorios1.getNombre_bloque()+ "','"+ Auditorios1.getAud_nombre()+ "'," + Auditorios1.getAud_capacidad()+ ")"; 
        System.out.println(i);
        st.executeUpdate(i);
        st.close();       
    }
}