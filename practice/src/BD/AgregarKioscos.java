package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Kioscos;

public class AgregarKioscos {
	public AgregarKioscos(Kioscos Kioscos1){
	}
	public static void agregar(Kioscos Kioscos1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO kioscos (`kio_bloque`, `kio_nombre`, `kio_capacidad`) VALUES ('"+ Kioscos1.getKio_bloque() + "','"+ Kioscos1.getKio_nombre()+ "'," + Kioscos1.getKio_capacidad() + ")";
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