package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Aula;

public class ConsultaAulas {
	public static ArrayList <Aula> getAula() throws Exception{
		ArrayList<Aula> ListaAulas= new ArrayList<Aula>();
		Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from aulas");
        while(rs.next()){
        	Aula Aula=new Aula(rs.getString("blo_nombre"),rs.getString("aul_nombre"),rs.getString("aul_videobeam_tv"),rs.getInt("aul_capacidad"));
            Aula.setNombre_aula(rs.getString("aul_nombre"));
            ListaAulas.add(Aula);
        }
        System.out.println("Conexion establecida en Aulas");
        rs.close();        
        return ListaAulas;
	}
}
    