package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Aulas;

public class AgregarAulas {
	public AgregarAulas(Aulas Aulas1){
	}
	public static void agregar(Aulas Aulas1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO aulas (`aul_bloque`, `aul_nombre`, `aul_videobeam_tv`, `aul_capacidad`) VALUES ('"+ Aulas1.getNombre_bloque() + "','"+ Aulas1.getNombre_aula() + "','" + Aulas1.getVideobeam() +"',"+ Aulas1.getCapacidad()+ ")";
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

	
