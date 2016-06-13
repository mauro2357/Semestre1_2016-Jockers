package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Sala;

public class SalasRepositorio {
	public SalasRepositorio(Sala Salas1){
	}
	public static void agregar(Sala Salas1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO salas (`blo_nombre`, `sal_nombre`, `sal_numero_equipos`, `hor_nombre`, `sal_videobeam`) VALUES ('"+ Salas1.getNombre_bloque()+ "','"+ Salas1.getSal_nombre()+ "'," + Salas1.getSal_equipos()+",'" + Salas1.getHorario_nombre()+"','"+ Salas1.getSal_videobeam()+  "')";
        System.out.println(i);
        st.executeUpdate(i);
        st.close();
        
    }
}	