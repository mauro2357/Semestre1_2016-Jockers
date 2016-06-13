package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.PuntoReferencia;

public class ConsultaPuntoReferencia {
	public static ArrayList<PuntoReferencia> getPuntos() throws Exception{
		ArrayList<PuntoReferencia> listaPuntos = new ArrayList<PuntoReferencia>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from puntos_referencia");  
        while (rs.next()){
        PuntoReferencia PuntoReferencia = new PuntoReferencia(rs.getString("pun_nombre"), rs.getInt("pun_latitud"), rs.getInt("pun_longitud"));
        PuntoReferencia.setPun_nombre(rs.getString("pun_nombre"));            	
        listaPuntos.add(PuntoReferencia);
        }
        System.out.println("Conexion establecida en Puntos de Referencia");	
        rs.close();  
        return listaPuntos; 
	}
}



