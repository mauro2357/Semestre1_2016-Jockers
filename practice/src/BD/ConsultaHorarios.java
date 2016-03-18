package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.HorarioAgregar;

public class ConsultaHorarios {
	public static ArrayList<HorarioAgregar> getHorario(){
		ArrayList<HorarioAgregar> listaHorarios = new ArrayList<HorarioAgregar>();	
        Connection con = null;
        Statement sql = null;
        {        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from horario");  
            while (rs.next()){
            	HorarioAgregar Horario = new HorarioAgregar(rs.getString("hor_nombre"), rs.getString("hor_hora_inicio"), rs.getString("hor_hora_fin"));
            	Horario.setHorario_nombre(rs.getString("hor_nombre"));            	
            	listaHorarios.add(Horario);
                System.out.println("conexion establecida ");	
            	}
            rs.close();       
            } catch (Exception e) {
            System.out.println("error en la conexion" + e);
            }
        }
		return listaHorarios; 
	}
}
