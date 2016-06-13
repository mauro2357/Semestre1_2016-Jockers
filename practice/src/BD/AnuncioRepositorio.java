package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Anuncios;

public class AnuncioRepositorio {
	public static void agregar(Anuncios Anuncio1) throws Exception{
		Connection con = new Conexion().obtenerConexion();			
        Statement st = con.createStatement();
        String i = "INSERT INTO anuncios (`titulo_anuncio`, `descripcion_anuncio`) VALUES ('"+ Anuncio1.getTitulo_anuncio()+ "','" + Anuncio1.getDescripcion_anuncio()+ "')"; 
        System.out.println(i);
        st.executeUpdate(i);
        st.close();
	}
}
