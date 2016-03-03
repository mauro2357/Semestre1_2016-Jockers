package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Laboratorios;

public class AgregarLaboratorios {
	public AgregarLaboratorios(Laboratorios Laboratorios1){
	}
	public static void agregar(Laboratorios Laboratorios1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO laboratorios (`lab_bloque`, `lab_nombre`, `lab_descripcion`,`lab_videobeam_tv`) VALUES ('"+ Laboratorios1.getLab_bloque()+ "','"+ Laboratorios1.getLab_nombre()+ "','" + Laboratorios1.getLab_descripcion()+ "','" + Laboratorios1.getLab_videobeam() +"')"; 
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