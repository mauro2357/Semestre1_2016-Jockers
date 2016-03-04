package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;




import Clases.Oficinas;

public class ConsultasOficinas {
	@SuppressWarnings("finally")
	public static ArrayList<Oficinas> getOficinas() {
        ArrayList<Oficinas> lista = new ArrayList<Oficinas>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select  * from oficinas");
            while (rs.next()) {
                Oficinas h = new Oficinas(rs.getString("ofi_bloque"), rs.getString("ofi_nombre"), rs.getInt("ofi_telefono"), rs.getString("ofi_horario_apertura"), rs.getString("ofi_horario_cierre"), rs.getString("ofi_descripcion"));
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
