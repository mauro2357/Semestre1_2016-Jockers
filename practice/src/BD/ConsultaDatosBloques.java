package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.Bloque;

public class ConsultaDatosBloques {

	public static ArrayList<Bloque> consultar(String nombre) throws Exception{
		ArrayList<Bloque> retorno= new ArrayList<Bloque>();	
        Connection con = new Conexion().obtenerConexion(); 
        PreparedStatement pst = null;
        pst = con.prepareStatement("Select * from bloques where blo_nombre=?"); 
        pst.setString(1, nombre);
        ResultSet rs = pst.executeQuery();         	
        pst.setString(1, nombre);
        System.out.println(pst);
        while (rs.next()){
        	Bloque bloqueRetorno = new Bloque(null, rs.getString("blo_nombre"), rs.getInt("blo_aulas"), rs.getInt("blo_pisos"), rs.getInt("blo_banos"), rs.getInt("blo_salas_laboratorios"), rs.getInt("blo_oficinas_facultades"), rs.getString("blo_oratorio"), rs.getString("blo_parqueadero"), rs.getString("blo_zona_estudio"));
            retorno.add(bloqueRetorno);
        }            
        System.out.println("Conexion establecida en DatosBloques");          
        rs.close();      
        if(con != null)try{con.close();}catch(SQLException e){};
        return retorno;
	}
}