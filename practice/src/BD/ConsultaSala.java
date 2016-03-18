package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import Clases.SalasAgregar;

public class ConsultaSala {
	@SuppressWarnings("finally")
	public static ArrayList<SalasAgregar> getSalas() {
        ArrayList<SalasAgregar> lista = new ArrayList<SalasAgregar>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select  * from salas");
            while (rs.next()) {
                SalasAgregar h = new SalasAgregar(rs.getString("blo_nombre"), rs.getString("sal_nombre"), rs.getInt("sal_numero_equipos"), rs.getString("hor_nombre"), rs.getString("sal_videobeam"));
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
