package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Clases.PuntoReferencia;

public class ConsultaDatosPuntos {

	public static ArrayList<PuntoReferencia> consultar(String punto) throws Exception{
		ArrayList<PuntoReferencia> listaPuntos = new ArrayList<PuntoReferencia>();	
		Connection con = new Conexion().obtenerConexion(); 
        PreparedStatement pst = null;
        pst = con.prepareStatement("Select * from puntos_referencia where pun_nombre=?"); 
        pst.setString(1, punto);
        ResultSet  rs=pst.executeQuery();         
        System.out.println(pst);
        while(rs.next()){
            PuntoReferencia Punto = new PuntoReferencia(rs.getString("pun_nombre"),rs.getDouble("pun_latitud"),rs.getDouble("pun_longitud"));
            listaPuntos.add(Punto);
        }
        System.out.println("Conexion establecida en Consultar Latitud y Longitud");        
        rs.close();
        return listaPuntos;
	}
}
