package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Clases.Imagen;

public class ConsultaImagenesRepositorio {
	public static Imagen consultar(String nombre){
		Imagen ImagenRetorno = null;
        Connection con = null; 
        java.sql.PreparedStatement pst = null;  
        ResultSet rs = null;        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "root");
            pst = con.prepareStatement("Select * from imagenes where nombre= (?)" ); 
           
           
            System.out.println(pst);
            
            rs = pst.executeQuery();  
  
            rs.next();
            ImagenRetorno = new Imagen(null, rs.getString("nombre"),rs.getBinaryStream("direccion"));
            
            System.out.println("Conexion establecida en Bloques");          
            rs.close();       
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        }finally{
        	if(con != null)try{con.close();}catch(SQLException e){};
        }
        
		return ImagenRetorno;
	}
}






