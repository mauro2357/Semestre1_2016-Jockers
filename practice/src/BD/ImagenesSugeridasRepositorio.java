package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Clases.ImagenesSugeridas;

public class ImagenesSugeridasRepositorio {
	public static void agregar (ImagenesSugeridas imagen1) throws Exception {          
		Connection con = new Conexion().obtenerConexion();  
        PreparedStatement pst = con.prepareStatement("INSERT INTO imagenes_sugeridas(imasug_imagen,imasug_nombre,imasug_usuario,imasug_correo) VALUES ('"+ imagen1.getUsuario()+ "','"+ imagen1.getCorreo()+ "','"+ imagen1.getNombre()+ "','"+ imagen1.getDireccion()+ "')");
        pst.execute();
        pst.close();
	}
}