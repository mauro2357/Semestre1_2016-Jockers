package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Clases.ImagenesSugeridas;

public class ImagenesSugeridasRepositorio {
	

	public static boolean guardar (ImagenesSugeridas imagenA) {          
        boolean status = false;  
        Connection conn = null;  
        PreparedStatement pst = null;  
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "ucomaps";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "root";  
        try {  
            Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
  
            pst = conn.prepareStatement("insert into imagenes_sugeridas values(?,?,?,?)");  
            pst.setString(1, imagenA.getNombre());  
            pst.setBlob(2, imagenA.getdireccion());
            pst.setString(3, imagenA.getCorreo());
            pst.setString(4, imagenA.getUsuario());
            System.out.println(pst);
            pst.execute();
         
            pst.close();
            
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
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
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
        return status;  
    }

	
}
