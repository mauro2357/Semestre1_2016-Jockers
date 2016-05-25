package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import Clases.Anuncios;

public class ConsultaAnuncios {

	public static LinkedList<Anuncios> getAnuncios(){
		LinkedList<Anuncios> ListaAnuncios = new LinkedList<Anuncios>();
        Connection con = null;
        Statement sql = null;
        {        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from anuncios");  
            while (rs.next()){
            	Anuncios Anuncio1 = new Anuncios(rs.getInt("empresa_anuncio"), rs.getString("titulo_anuncio"), rs.getString("descripcion_anuncio"));
            	ListaAnuncios.add(Anuncio1);
            }
            System.out.println("Conexion establecida en Anuncio");          
            rs.close();       
            } catch (Exception e) {
            System.out.println("error en la conexion" + e);
            }
        }
		return ListaAnuncios; 
	}	
}
           
