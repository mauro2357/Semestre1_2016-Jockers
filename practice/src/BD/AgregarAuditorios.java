package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Auditorios;

public class AgregarAuditorios {
	public AgregarAuditorios(Auditorios Auditorios1){
	}
	public static void agregar (Auditorios Auditorios1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO auditorios (`aud_bloque`, `aud_nombre`, `aud_capacidad`) VALUES ('"+ Auditorios1.getAud_bloque()+ "','"+ Auditorios1.getAud_nombre()+ "'," + Auditorios1.getAud_capacidad()+ ")"; 
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}