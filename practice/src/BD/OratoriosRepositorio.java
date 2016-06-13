package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Oratorio;

public class OratoriosRepositorio {
	public OratoriosRepositorio(Oratorio Oratorios1){
	}
	public static void agregar(Oratorio Oratorios1) throws Exception{
		Connection con = new Conexion().obtenerConexion() ;
        Statement st = con.createStatement();
        String i = "INSERT INTO oratorios (`blo_nombre`, `ora_nombre`, `ora_capacidad`) VALUES ('"+ Oratorios1.getNombre_bloque() + "','"+ Oratorios1.getOra_nombre()+ "'," + Oratorios1.getOra_capacidad() + ")";
        System.out.println(i);
        st.executeUpdate(i);
        st.close();
	}    
}