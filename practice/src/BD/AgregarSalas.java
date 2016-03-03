package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Salas;

public class AgregarSalas {
	public AgregarSalas(Salas Salas1){
	}
	public static void agregar(Salas Salas1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO salas (`sal_bloque`, `sal_nombre`, `sal_numero_equipos`, `sal_videobeam`) VALUES ('"+ Salas1.getSal_bloque()+ "','"+ Salas1.getSal_nombre()+ "'," + Salas1.getSal_equipos()+",'"+ Salas1.getSal_videobeam()+ "')";
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