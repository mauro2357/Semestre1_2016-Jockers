package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.LaboratoriosAgregar;

public class LaboratoriosRepositorio {
	public LaboratoriosRepositorio(LaboratoriosAgregar Laboratorios1){
	}
	public static void agregar(LaboratoriosAgregar Laboratorios1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO laboratorios (`blo_nombre`, `lab_nombre`, `lab_descripcion`, `hor_nombre`, `lab_videobeam_tv`) VALUES ('"+ Laboratorios1.getNombre_bloque()+ "','"+ Laboratorios1.getLab_nombre()+ "','" + Laboratorios1.getLab_descripcion()+ "','" +Laboratorios1.getHorario_nombre()+ "','" + Laboratorios1.getLab_videobeam() +"')"; 
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