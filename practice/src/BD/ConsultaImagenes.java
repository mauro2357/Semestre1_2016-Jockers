package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import Clases.Imagen;

public class ConsultaImagenes {
	public static LinkedList<Imagen> getImagenes() throws Exception{
		LinkedList<Imagen> ListaImagenes = new LinkedList<Imagen>();
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from imagenes");  
        while (rs.next()){
           Imagen Imagen1 = new Imagen(rs.getString("ima_nombre"), rs.getBinaryStream("ima_imagen"));
           ListaImagenes.add(Imagen1);
        }
        System.out.println("Conexion establecida en Imagenes");          
        rs.close();       
        return ListaImagenes; 
	}	
}
           


