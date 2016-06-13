package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Bloque;

public class ConsultaBloques {
	public static ArrayList<Bloque> getBloques() throws Exception{
		ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from bloques");  
        while (rs.next()){
        Bloque Bloque = new Bloque(null, rs.getString("blo_nombre"), rs.getInt("blo_aulas"), rs.getInt("blo_pisos"), rs.getInt("blo_banos"), rs.getInt("blo_salas_laboratorios"), rs.getInt("blo_oficinas_facultades"), rs.getString("blo_oratorio"), rs.getString("blo_parqueadero"), rs.getString("blo_zona_estudio"));
        Bloque.setNombre_bloque(rs.getString("blo_nombre"));            	
        listaBloques.add(Bloque);                
        }
        System.out.println("Conexion establecida en Bloques");          
        rs.close();       
        return listaBloques; 
	}

	public static boolean bloqueExiste(String bloque) throws Exception{
        boolean status = false;  
		Connection con = new Conexion().obtenerConexion();
        PreparedStatement pst = con.prepareStatement("select * from bloques where blo_nombre=?");  
        ResultSet rs = null;
        pst.setString(1, bloque);  
        System.out.println(pst);
        rs = pst.executeQuery();  
        status = rs.next();  
		return status;	
	}  
}