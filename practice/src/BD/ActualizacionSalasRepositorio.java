package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActualizacionSalasRepositorio {
	public static boolean actualizar (String horario, String sala) throws Exception{
		boolean status = false;  
        Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("UPDATE salas SET hor_nombre=? WHERE sal_nombre=?"); 
        pst.setString(1, horario);
        pst.setString(2, sala);  
        System.out.println(pst);
        pst.executeUpdate();     
  
        if (con != null) {  
                try {  
                    con.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (pst != null) {  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
              
           
        }  
        return status;  
    }  
}  


