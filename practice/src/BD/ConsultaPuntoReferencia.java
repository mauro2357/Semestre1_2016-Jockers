package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.PuntoReferencia;

public class ConsultaPuntoReferencia {
	public static ArrayList<PuntoReferencia> getPuntos() throws Exception{
		ArrayList<PuntoReferencia> listaPuntos = new ArrayList<PuntoReferencia>();	
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from puntos_referencia group by pun_ruta");  
        while (rs.next()){
        PuntoReferencia PuntoReferencia = new PuntoReferencia(rs.getString("pun_nombre"), rs.getString("pun_ruta"), rs.getInt("pun_latitud"), rs.getInt("pun_longitud"));
        listaPuntos.add(PuntoReferencia);
        }
        System.out.println("Conexion establecida en Puntos de Referencia");	
        rs.close();  
        return listaPuntos; 
	}
	public static ArrayList<PuntoReferencia> consultar(String ruta) throws Exception{
	ArrayList<PuntoReferencia> listaPuntos = new ArrayList<PuntoReferencia>();	
	Connection con = new Conexion().obtenerConexion(); 
    PreparedStatement pst = null;
    pst = con.prepareStatement("Select * from puntos_referencia where pun_ruta=?"); 
    pst.setString(1, ruta);
    ResultSet rs = pst.executeQuery();         	
    while (rs.next()){
        PuntoReferencia PuntoReferencia = new PuntoReferencia(rs.getString("pun_ruta"), rs.getString("pun_nombre"), rs.getInt("pun_latitud"), rs.getInt("pun_longitud"));
        listaPuntos.add(PuntoReferencia);
    }            
    System.out.println("Conexion establecida en Datos Puntos");          
    rs.close();  
    return listaPuntos; 
	}
	 public String GetVectorScript() throws Exception{
		 Connection con = new Conexion().obtenerConexion();
		 PreparedStatement pst = null;
	        pst = con.prepareStatement("Select * from puntos_referencia"); 
	        ResultSet  rs=pst.executeQuery();
	        rs.next();
	        String Retorno ="[";
	        while(rs.getRow() != 0){  
	        	String punto = rs.getString(1);
	            Double latitud = rs.getDouble(2);
	            Double longitud = rs.getDouble(3);
	            Retorno = Retorno+"[\""+punto+"\""+", "+latitud+", "+longitud+"],";
	                rs.next();
	            } 
	        Retorno += "]";
	        return Retorno;	       
	 }
	 public String GetVectorPuntos(String ruta) throws Exception{		 
		 Connection con = new Conexion().obtenerConexion();
		 PreparedStatement pst= con.prepareStatement("Select * from puntos_referencia where pun_ruta=?");
		 pst.setString(1, ruta);
		 ResultSet rs = pst.executeQuery();
		 rs.next();
		 String retorno = "[";
		 while(rs.getRow() != 0){
			// String punto = rs.getString(1);
	         Double latitud = rs.getDouble(2);
	         Double longitud = rs.getDouble(3);
	         retorno = retorno+"{lat: "+latitud+", "+"lng: "+longitud+"},";
             rs.next();
		 }
		retorno += "]";
		System.out.println(retorno);
		return retorno;
	 }
}



