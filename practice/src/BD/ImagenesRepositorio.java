package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Clases.Imagen;

public class ImagenesRepositorio implements IImagenesRepositorio {
	public void agregar (Imagen imagen1) throws Exception {          

        Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("insert into imagenes values(?,?)");  
        pst.setString(1, imagen1.getNombre());  
        pst.setBlob(2, imagen1.getdireccion()); 
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
        return;  
    }
}
	