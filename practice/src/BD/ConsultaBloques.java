package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Clases.BloquesAgregar;

public class ConsultaBloques {
	@SuppressWarnings("finally")
	public static ArrayList<BloquesAgregar> getBloques() {
        ArrayList<BloquesAgregar> lista = new ArrayList<BloquesAgregar>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from bloques");
            while (rs.next()) {
                BloquesAgregar h = new BloquesAgregar(rs.getString("blo_nombre"), rs.getInt("blo_aulas"), rs.getInt("blo_pisos"), rs.getInt("blo_banos"), rs.getInt("blo_salas_laboratorios"), rs.getInt("blo_oficinas_facultades"), rs.getString("blo_oratorio"), rs.getString("blo_parqueadero"), rs.getString("blo_zona_estudio"));
                lista.add(h);
            }
            System.out.println("conexion establecida ");
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        } finally {
            return lista;
        }
	}
}

