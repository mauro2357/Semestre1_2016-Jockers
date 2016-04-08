package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Facultad;

public class ConsultaFacultades {
	public static ArrayList<Facultad> getFacultades(){
		ArrayList<Facultad> listaFacultades = new ArrayList<Facultad>();	
        Connection con = null;
        Statement sql = null;
        {        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from facultades");  
            while (rs.next()){
            	Facultad Facultad = new Facultad(rs.getString("blo_nombre"), rs.getString("fac_nombre"), rs.getInt("fac_telefono"), rs.getString("fac_horario"), rs.getString("fac_descripcion"));
            	Facultad.setNombre_bloque(rs.getString("fac_nombre"));            	
            	listaFacultades.add(Facultad);
            	}
            System.out.println("Conexion establecida en Facultades");	
            rs.close();       
            } catch (Exception e) {
            System.out.println("error en la conexion" + e);
            }
        }
		return listaFacultades; 
	}
}



