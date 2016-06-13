package BD;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import Clases.PuntoReferencia;

public class JsonO {
	
	public static String getPunto() throws Exception, FileNotFoundException,IOException  {
		/*Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from puntos_referencia"); 
        
        JSONObject punto = new JSONObject();
        JSONArray ListaPuntos = new JSONArray();
	
	    while (rs.next()){
	    	PuntoReferencia PuntoReferencia = new PuntoReferencia(rs.getString("pun_nombre"), rs.getDouble("pun_latitud"), rs.getDouble("pun_longitud"));
	    	
	        punto.put("Nombre",PuntoReferencia.getPun_nombre());
	    	punto.put("Latitud",PuntoReferencia.getPun_latitud());
	    	punto.put("Longitud",PuntoReferencia.getPun_longitud());
	    	
	    	
	    	ListaPuntos.add(PuntoReferencia.getPun_nombre());
	    	ListaPuntos.add(PuntoReferencia.getPun_latitud());
	    	ListaPuntos.add(PuntoReferencia.getPun_longitud());
	    	
	    	punto.put("lugares", ListaPuntos);
	    }//System.out.println(ListaPuntos);
    	rs.close();

	    	try {
				FileWriter file = new FileWriter("C:\\0NuevaFuncionalidad\\PuntosReferencia.json");
				file.write(punto.toJSONString());
				file.flush();
				file.close();
				} catch (Exception e) {
					System.out.println("Error");
				}finally{
					
				}*/

	     

		
	

		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("C:\\0NuevaFuncionalidad\\PuntosReferencia.json"));
			JSONObject objeto = (JSONObject) obj;
			/*String Nombre=(String) objeto.get("Nombre");
			System.out.println("nombre:"+ Nombre);
			Double Latitud=(Double) objeto.get("Latitud");
			System.out.println("latitud:"+ Latitud);
			Double Longitud=(Double) objeto.get("Longitud");
			System.out.println("longitud:"+ Longitud);*/
			
		
			JSONArray lista = (JSONArray) objeto.get("lugares");
			
			System.out.println(lista.toJSONString());
			String texto = lista.toJSONString();
			
			System.out.println( "ensayo"+texto);
			
			return texto;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
		
	}
}
