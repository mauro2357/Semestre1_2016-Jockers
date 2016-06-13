package BD;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
	private static Connection con;
	public Connection obtenerConexion() throws Exception {
		String driver ="com.mysql.jdbc.Driver";
		String connection = "jdbc:mysql://mysql12810-ucomap.j.facilcloud.com/Ucomaps";
		String user ="root";
		String password="POKfbx42384";
		
		/*String driver ="com.mysql.jdbc.Driver";
		String connection = "jdbc:mysql://localhost:3306/ucomaps";
		String user = "root";
		String password = "";*/
		Class.forName(driver);
		con = DriverManager.getConnection(connection, user, password);
		return con;
	}	
}



