package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Clases.Bloque;

public class ConsultaBloques {
	public static ArrayList<Bloque> getBloques(){
		ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();	
        Connection con = null;
        Statement sql = null;
        {        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from bloques");  
            while (rs.next()){
            	Bloque Bloque = new Bloque(null, rs.getString("blo_nombre"), rs.getInt("blo_aulas"), rs.getInt("blo_pisos"), rs.getInt("blo_banos"), rs.getInt("blo_salas_laboratorios"), rs.getInt("blo_oficinas_facultades"), rs.getString("blo_oratorio"), rs.getString("blo_parqueadero"), rs.getString("blo_zona_estudio"));
            	Bloque.setNombre_bloque(rs.getString("blo_nombre"));            	
            	listaBloques.add(Bloque);                
            	}
            System.out.println("Conexion establecida en Bloques");          
            rs.close();       
            } catch (Exception e) {
            System.out.println("error en la conexion" + e);
            }
        }
		return listaBloques; 
	}	
}
           
