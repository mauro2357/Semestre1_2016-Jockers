package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import Clases.Anuncios;

public class ConsultaAnuncios {

	public static LinkedList<Anuncios> getAnuncios() throws Exception{
		LinkedList<Anuncios> ListaAnuncios = new LinkedList<Anuncios>();
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from anuncios");  
        while (rs.next()){
            Anuncios Anuncio1 = new Anuncios(rs.getString("titulo_anuncio"), rs.getString("descripcion_anuncio"));
            ListaAnuncios.add(Anuncio1);
        }
        System.out.println("Conexion establecida en Anuncio");          
        rs.close();   
        return ListaAnuncios; 
	}	
}
           
