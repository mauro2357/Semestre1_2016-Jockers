package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Clases.Bloque;

public class ConsultaDatosBloques {

	public static Bloque consultar(String nombre){
		Bloque bloqueRetorno = null;
        Connection con = null; 
        PreparedStatement pst = null;  
        ResultSet rs = null;        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            pst = con.prepareStatement("Select * from bloques where blo_nombre=?"); 
            pst.setString(1, nombre);
           
            System.out.println(pst);
            
            rs = pst.executeQuery();  
  
            rs.next();
            bloqueRetorno = new Bloque(null, rs.getString("blo_nombre"), rs.getInt("blo_aulas"), rs.getInt("blo_pisos"), rs.getInt("blo_banos"), rs.getInt("blo_salas_laboratorios"), rs.getInt("blo_oficinas_facultades"), rs.getString("blo_oratorio"), rs.getString("blo_parqueadero"), rs.getString("blo_zona_estudio"));
            
            System.out.println("Conexion establecida en Bloques");          
            rs.close();       
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        }finally{
        	if(con != null)try{con.close();}catch(SQLException e){};
        }
        
		return bloqueRetorno;
	}
}