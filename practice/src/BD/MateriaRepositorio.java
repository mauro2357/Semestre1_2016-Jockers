package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.MateriaAgregar;

public class MateriaRepositorio {
	public MateriaRepositorio(MateriaAgregar Materia1){
	}
	public static void agregar(MateriaAgregar Materia1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO materias (`mat_nombre`, `mat_creditos`, `hor_nombre`, `blo_nombre`, `aul_nombre`, `fac_nombre` ) VALUES ('"+ Materia1.getMateria_nombre()+ "',"+ Materia1.getMateria_creditos()+ ",'" + Materia1.getHorario_nombre() +"','" + Materia1.getNombre_bloque()+ "','" + Materia1.getAula_nombre()+"','" + Materia1.getFacultad_nombre()+ "')"; 
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


