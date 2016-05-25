package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import Clases.Imagen;

public class ConsultaImagenes {
	public static LinkedList<Imagen> getImagenes(){
		LinkedList<Imagen> ListaImagenes = new LinkedList<Imagen>();
        Connection con = null;
        Statement sql = null;
        {        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "root");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from imagenes");  
            while (rs.next()){
            	Imagen Imagen1 = new Imagen(rs.getString("ima_nombre"), rs.getBinaryStream("ima_imagen"));
            	ListaImagenes.add(Imagen1);
            }
            System.out.println("Conexion establecida en Anuncio");          
            rs.close();       
            } catch (Exception e) {
            System.out.println("error en la conexion" + e);
            }
        }
		return ListaImagenes; 
	}	
}
           


