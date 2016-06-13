package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Clases.Bloque;

public class ActualizacionBloquesRepositorio implements IBloquesRepositorio{
	public void agregar(Bloque Bloque1) throws Exception{
        Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("UPDATE bloques SET blo_aulas=?, blo_pisos=?, blo_banos=?, blo_salas_laboratorios=?, blo_oficinas_facultades=?, blo_oratorio=?, blo_parqueadero=?, blo_zona_estudio=? WHERE blo_nombre=?");  
        pst.setInt(1, Bloque1.getAulas());
        pst.setInt(2, Bloque1.getPisos());
        pst.setInt(3, Bloque1.getBanos());
        pst.setInt(4, Bloque1.getLaboratorios_salas());
        pst.setInt(5, Bloque1.getOficinas_facultades());
        pst.setString(6, Bloque1.getOratorios());
        pst.setString(7, Bloque1.getParqueaderos());
        pst.setString(8, Bloque1.getZonas_estudio());
        pst.setString(9, Bloque1.getNombre_bloque());
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
        }  
          
    }
 
  