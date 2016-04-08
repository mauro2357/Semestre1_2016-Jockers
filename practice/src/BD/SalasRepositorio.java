package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Sala;

public class SalasRepositorio {
	public SalasRepositorio(Sala Salas1){
	}
	public static void agregar(Sala Salas1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO salas (`blo_nombre`, `sal_nombre`, `sal_numero_equipos`, `hor_nombre`, `sal_videobeam`) VALUES ('"+ Salas1.getNombre_bloque()+ "','"+ Salas1.getSal_nombre()+ "'," + Salas1.getSal_equipos()+",'" + Salas1.getHorario_nombre()+"','"+ Salas1.getSal_videobeam()+  "')";
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