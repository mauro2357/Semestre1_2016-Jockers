package BD;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Conexion {
	private Connection con = null;
    public Conexion() {
    try {
     Class.forName("com.mysql.jdbc.Driver").newInstance();
     con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "root");
    } catch (InstantiationException | IllegalAccessException
      | ClassNotFoundException | SQLException e) {
     e.printStackTrace();
    }
   }

   public Connection getConexion(){
    return con;
   }

   public void cerrarConexion(){
    try {
     con.close();
    } catch (SQLException e) {
     e.printStackTrace();
    }
   }
}
    



