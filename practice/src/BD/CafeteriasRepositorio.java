package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Cafeteria;

public class CafeteriasRepositorio {
	public CafeteriasRepositorio(Cafeteria Cafeterias1){
	}
	public static void agregar(Cafeteria Cafeterias1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO cafeterias (`blo_nombre`, `caf_nombre`, `caf_capacidad`) VALUES ('"+ Cafeterias1.getNombre_bloque()+ "','"+ Cafeterias1.getCaf_nombre()+ "'," + Cafeterias1.getCaf_capacidad()+ ")"; 
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