package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.HorarioO;

public class ConsultaHorarios {
	public static ArrayList<HorarioO> getHorario() throws Exception{
		ArrayList<HorarioO> listaHorarios = new ArrayList<HorarioO>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from horario");  
        while (rs.next()){
           HorarioO Horario = new HorarioO(rs.getString("hor_nombre"), rs.getString("hor_hora_inicio"), rs.getString("hor_hora_fin"));
           Horario.setHorario_nombre(rs.getString("hor_nombre"));            	
           listaHorarios.add(Horario);                	
        }
        System.out.println("Conexion establecida en Horario");
        rs.close();       
        return listaHorarios; 
	}
}
