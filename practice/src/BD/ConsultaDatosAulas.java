package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Clases.Aula;

public class ConsultaDatosAulas {
	public static ArrayList<Aula> Consultar(String aula){
		ArrayList<Aula> AulaUbicacion=new ArrayList<Aula>();
		Connection con = null; 
        PreparedStatement pst = null;  
        ResultSet rs = null;        	
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            pst = con.prepareStatement("Select * from aulas where aul_nombre=?"); 
            pst.setString(1, aula);
            System.out.println(pst);
            rs=pst.executeQuery();
            while(rs.next()){
            	Aula Aulas=new Aula(rs.getString("blo_nombre"),rs.getString("aul_nombre"),rs.getString("aul_videobeam_tv"),rs.getInt("aul_capacidad"));
            	Aulas.setNombre_bloque(rs.getString("blo_nombre"));
            	AulaUbicacion.add(Aulas);
            }
            System.out.println("Conexion establecida en NombreAulas");
            rs.close();
        }
        catch (Exception e){
        	System.out.println("Error en la conexion + e");
        }	
	return AulaUbicacion;
}
}

