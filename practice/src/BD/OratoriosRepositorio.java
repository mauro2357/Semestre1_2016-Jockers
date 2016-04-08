package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Oratorio;

public class OratoriosRepositorio {
	public OratoriosRepositorio(Oratorio Oratorios1){
	}
	public static void agregar(Oratorio Oratorios1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO oratorios (`ora_bloque`, `ora_nombre`, `ora_capacidad`) VALUES ('"+ Oratorios1.getNombre_bloque() + "','"+ Oratorios1.getOra_nombre()+ "'," + Oratorios1.getOra_capacidad() + ")";
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