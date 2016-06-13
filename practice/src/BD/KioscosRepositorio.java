package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Kiosco;

public class KioscosRepositorio {
	public KioscosRepositorio(Kiosco Kioscos1){
	}
	public static void agregar(Kiosco Kioscos1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO kioscos (`blo_nombre`, `kio_nombre`, `kio_capacidad`) VALUES ('"+ Kioscos1.getNombre_bloque() + "','"+ Kioscos1.getKio_nombre()+ "'," + Kioscos1.getKio_capacidad() + ")";
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
       }
}