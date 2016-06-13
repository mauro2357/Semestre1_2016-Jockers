package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Oficina;

public class OficinasRepositorio {
	public OficinasRepositorio(Oficina Oficinas1){
	}
	public static void agregar(Oficina Oficinas1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO oficinas (`blo_nombre`, `ofi_nombre`, `ofi_telefono`, `hor_nombre`, `ofi_descripcion`) VALUES ('"+ Oficinas1.getNombre_bloque()+ "','"+ Oficinas1.getOfi_nombre()+ "'," + Oficinas1.getOfi_telefono()+",'"+ Oficinas1.getHorario_nombre()+ "','"+ Oficinas1.getOfi_descripcion()+ "')"; 
        System.out.println(i);
        st.executeUpdate(i);
        st.close();
        
    }
}