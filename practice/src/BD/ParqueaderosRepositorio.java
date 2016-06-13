package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Parqueadero;

public class ParqueaderosRepositorio {
	public ParqueaderosRepositorio(Parqueadero Parqueaderos1){
	}
	public static void agregar(Parqueadero Parqueaderos1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO parqueaderos (`blo_nombre`, `par_nombre`, `par_capacidad`) VALUES ('"+ Parqueaderos1.getNombre_bloque()+ "','"+ Parqueaderos1.getPar_nombre()+ "'," + Parqueaderos1.getPar_capacidad() +")"; 
        System.out.println(i);
        st.executeUpdate(i);
        st.close();        
    }
}