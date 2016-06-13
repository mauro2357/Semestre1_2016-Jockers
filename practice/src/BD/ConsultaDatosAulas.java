package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Clases.Aula;

public class ConsultaDatosAulas {
	public static ArrayList<Aula> Consultar(String aula) throws Exception{
		ArrayList<Aula> AulaUbicacion=new ArrayList<Aula>();
		Connection con = new Conexion().obtenerConexion(); 
		PreparedStatement pst = null;
		pst = con.prepareStatement("Select * from aulas where aul_nombre=?"); 
		pst.setString(1, aula);
	    ResultSet rs = pst.executeQuery();         	
	    System.out.println(pst);
        while(rs.next()){
            Aula Aulas=new Aula(rs.getString("blo_nombre"),rs.getString("aul_nombre"),rs.getString("aul_videobeam_tv"),rs.getInt("aul_capacidad"));
            Aulas.setNombre_bloque(rs.getString("blo_nombre")); 
            AulaUbicacion.add(Aulas);
        }
        System.out.println("Conexion establecida en NombreAulas");
        rs.close();
        return AulaUbicacion;
	}
}

