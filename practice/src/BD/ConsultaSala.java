package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import Clases.Salas;

public class ConsultaSala {
	@SuppressWarnings("finally")
	public static ArrayList<Salas> getSalas() {
        ArrayList<Salas> lista = new ArrayList<Salas>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select  * from salas");
            while (rs.next()) {
                Salas h = new Salas(rs.getString("sal_bloque"), rs.getString("sal_nombre"), rs.getInt("sal_numero_equipos"), rs.getString("sal_horario_apertura"), rs.getString("sal_horario_cierre"), rs.getString("sal_videobeam"));
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
