package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Cafeteria;

public class CafeteriasRepositorio {
	public CafeteriasRepositorio(Cafeteria Cafeterias1){
	}
	public static void agregar(Cafeteria Cafeterias1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
             String i = "INSERT INTO cafeterias (`blo_nombre`, `caf_nombre`, `caf_capacidad`) VALUES ('"+ Cafeterias1.getNombre_bloque()+ "','"+ Cafeterias1.getCaf_nombre()+ "'," + Cafeterias1.getCaf_capacidad()+ ")"; 
            System.out.println(i);
            st.executeUpdate(i);
            st.close();     
    }
}