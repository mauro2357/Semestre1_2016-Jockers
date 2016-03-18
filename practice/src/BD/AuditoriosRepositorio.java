package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.AuditoriosAgregar;

public class AuditoriosRepositorio {
	public AuditoriosRepositorio(AuditoriosAgregar Auditorios1){
	}
	public static void agregar (AuditoriosAgregar Auditorios1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO auditorios (`blo_nombre`, `aud_nombre`, `aud_capacidad`) VALUES ('"+ Auditorios1.getNombre_bloque()+ "','"+ Auditorios1.getAud_nombre()+ "'," + Auditorios1.getAud_capacidad()+ ")"; 
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