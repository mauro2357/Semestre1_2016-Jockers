package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Laboratorio;
public class ConsultaLaboratorios {
	@SuppressWarnings("finally")
	public static ArrayList<Laboratorio> getLaboratorios() {
        ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from laboratorios");
            while (rs.next()) {
                Laboratorio h = new Laboratorio(rs.getString("blo_nombre"), rs.getString("lab_nombre"), rs.getString("lab_descripcion"), rs.getString("lab_videobeam_tv"), rs.getString("hor_nombre"));
                h.setLab_nombre(rs.getString("lab_nombre"));            	
                lista.add(h);
            }
            System.out.println("Conexion establecida en Laboratorios");
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        } finally {
            return lista;
        }
}
}