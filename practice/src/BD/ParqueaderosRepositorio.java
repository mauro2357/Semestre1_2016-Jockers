package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.ParqueaderosAgregar;

public class ParqueaderosRepositorio {
	public ParqueaderosRepositorio(ParqueaderosAgregar Parqueaderos1){
	}
	public static void agregar(ParqueaderosAgregar Parqueaderos1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO parqueaderos (`par_bloque`, `par_nombre`, `par_capacidad`) VALUES ('"+ Parqueaderos1.getNombre_bloque()+ "','"+ Parqueaderos1.getPar_nombre()+ "'," + Parqueaderos1.getPar_capacidad() +")"; 
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