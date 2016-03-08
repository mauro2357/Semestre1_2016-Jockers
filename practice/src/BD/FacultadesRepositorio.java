package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.FacultadesAgregar;

public class FacultadesRepositorio {
	public FacultadesRepositorio(FacultadesAgregar Facultades1){
	}
	public static void agregar(FacultadesAgregar Facultades1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO facultades (`blo_nombre`, `fac_nombre`, `fac_telefono`, `fac_horario_apertura`, `fac_horario_cierre`, `fac_descripcion`) VALUES ('"+ Facultades1.getFacultades_bloque() + "','"+ Facultades1.getFacultades_nombre() + "'," + Facultades1.getFacultades_telefono() +" ,'"+ Facultades1.getFacultades_hora_apertura()+ "','"+ Facultades1.getFacultades_hora_cierre()+ "','" + Facultades1.getFacultades_descripcion() +"')";
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