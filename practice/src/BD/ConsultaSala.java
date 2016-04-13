package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import Clases.Sala;

public class ConsultaSala {
	@SuppressWarnings("finally")
	public static ArrayList<Sala> getSalas() {
        ArrayList<Sala> lista = new ArrayList<Sala>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select  * from salas");
            while (rs.next()) {
                Sala h = new Sala(rs.getString("blo_nombre"), rs.getString("sal_nombre"), rs.getInt("sal_numero_equipos"), rs.getString("hor_nombre"), rs.getString("sal_videobeam"));
                lista.add(h);
            }
            System.out.println("Conexion establecida en Salas");
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        } finally {
            return lista;
        }
    }   


}
