package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Clases.ImagenesSugeridas;

public class ImagenesSugeridasRepositorio {	

	public static boolean guardar (ImagenesSugeridas imagenA) throws Exception {          
        boolean status = false;  
        Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("insert into imagenes_sugeridas values(?,?,?,?)");
        pst.setString(1, imagenA.getNombre());  
        pst.setBlob(2, imagenA.getdireccion());
        pst.setString(3, imagenA.getCorreo());
        pst.setString(4, imagenA.getUsuario());
        System.out.println(pst);
        pst.execute();
        pst.close();            
  
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
