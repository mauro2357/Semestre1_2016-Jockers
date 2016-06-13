package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Facultad;

public class FacultadesRepositorio {
	public FacultadesRepositorio(Facultad Facultades1){
	}
	public static void agregar(Facultad Facultades1) throws Exception{
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO facultades (`blo_nombre`, `fac_nombre`, `fac_telefono`, `fac_horario`, `fac_descripcion`) VALUES ('"+ Facultades1.getNombre_bloque() + "','"+ Facultades1.getFacultades_nombre() + "'," + Facultades1.getFacultades_telefono() +" ,'"+ Facultades1.getFacultades_horario()+ "','" + Facultades1.getFacultades_descripcion() +"')";
            System.out.println(i);
            st.executeUpdate(i);
            st.close();        
    }
}