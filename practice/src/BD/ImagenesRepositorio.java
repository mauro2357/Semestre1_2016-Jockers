package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Clases.Imagen;

public class ImagenesRepositorio implements IImagenesRepositorio {
	public void agregar (Imagen imagen1) throws Exception {   
		Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("INSERT INTO imagenes (ima_nombre,ima_imagen) VALUES ('"+ imagen1.getNombre()+ "','"+ imagen1.getPhoto()+ "')");
        pst.execute();
        pst.close();
	}
}
               
  
       