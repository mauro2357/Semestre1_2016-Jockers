package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

import Clases.Imagen;

public class VistaImagenesRepositorio {
	public static ArrayList<Imagen> getImagen() throws Exception{
		ArrayList<Imagen> listaImagen = new ArrayList<Imagen>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from imagenes");  
        while (rs.next()){
        Imagen imagen = new Imagen(null, rs.getString("ima_nombre"), rs.getString("ima_imagen"));
        listaImagen.add(imagen);                
        }
        System.out.println("Conexion establecida en Imagen");          
        rs.close();       
        return listaImagen; 
	}
	public static LinkedList<Imagen> getImagenTabla() throws Exception{
		LinkedList<Imagen> listaImagen = new LinkedList<Imagen>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from imagenes");  
        while (rs.next()){
        Imagen imagen = new Imagen(null, rs.getString("ima_nombre"), rs.getString("ima_imagen"));
        listaImagen.add(imagen);                
        }
        System.out.println("Conexion establecida en Imagen");          
        rs.close();       
        return listaImagen; 
	}
}
