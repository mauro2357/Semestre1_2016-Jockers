package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Clases.Imagen;

public class ConsultaImagenesRepositorio {
	public static Imagen consultar(String nombre) throws Exception{
		Imagen ImagenRetorno = null;
        Connection con = new Conexion().obtenerConexion(); 
        PreparedStatement pst = con.prepareStatement("Select * from imagenes where nombre= (?)" ); 
        ResultSet rs = pst.executeQuery();        	
        System.out.println(pst);
        rs.next();
        ImagenRetorno = new Imagen(null, rs.getString("nombre"),rs.getBinaryStream("direccion"));
        System.out.println("Conexion establecida en Imagenes");          
        rs.close();       
        if(con != null)try{con.close();}catch(SQLException e){};
        return ImagenRetorno;
	}
}






