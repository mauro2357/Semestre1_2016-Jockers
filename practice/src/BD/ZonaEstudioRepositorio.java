package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.ZonaEstudio;

public class ZonaEstudioRepositorio {
	public ZonaEstudioRepositorio(ZonaEstudio ZonaEstudio1){
	}
	public static void agregar(ZonaEstudio ZonaEstudio1) throws Exception{
		Connection con = new Conexion().obtenerConexion();;
        Statement st = con.createStatement();
        String i = "INSERT INTO zona_estudio (`zon_nombre`, `zon_capacidad`, `blo_nombre`) VALUES ('"+ ZonaEstudio1.getZona_nombre() + "',"+ ZonaEstudio1.getZona_capacidad() + ",'" + ZonaEstudio1.getNombre_bloque() +"')";
        System.out.println(i);
        st.executeUpdate(i);
        st.close();
        
    }
}