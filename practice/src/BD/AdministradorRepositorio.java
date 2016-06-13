package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Clases.Administrador;

public class AdministradorRepositorio {
	public static boolean validate(Administrador Administrador1) throws Exception{          
        boolean status = false;  
		Connection con = new Conexion().obtenerConexion();	
		PreparedStatement pst = con.prepareStatement("select * from administradores where adminuser=? and adminpass=?");  
        ResultSet rs = null;  
    
        try {  
            pst.setString(1, Administrador1.getAdminuser());  
            pst.setString(2, Administrador1.getAdminpass()); 
            System.out.println(pst);
  
            rs = pst.executeQuery();  
            status = rs.next();  
            System.out.println(status);
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
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