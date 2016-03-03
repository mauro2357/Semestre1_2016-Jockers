package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Facultades;

public class AgregarFacultades {
	public AgregarFacultades(Facultades Facultades1){
	}
	public static void agregar(Facultades Facultades1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO facultades (`fac_bloque`, `fac_nombre`, `fac_telefono`,`fac_horario`, `fac_descripcion`) VALUES ('"+ Facultades1.getFacu_bloque() + "','"+ Facultades1.getFac_nombre()+ "'," + Facultades1.getFac_telefono() +",'"+ Facultades1.getFac_horario() + "','"+ Facultades1.getFac_descripcion() + "')";
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