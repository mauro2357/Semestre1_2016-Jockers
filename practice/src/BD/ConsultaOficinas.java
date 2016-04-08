package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import Clases.Oficina;
public class ConsultaOficinas {
	@SuppressWarnings("finally")
	public static ArrayList<Oficina> getOficinas() {
        ArrayList<Oficina> lista = new ArrayList<Oficina>();
        Connection con = null;
        Statement sql = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps", "root", "");
            sql = con.createStatement();
            ResultSet rs = sql.executeQuery("Select * from oficinas");
            while (rs.next()) {
                Oficina h = new Oficina(rs.getString("bloque_nombre"), rs.getString("ofi_nombre"), rs.getInt("ofi_telefono"), rs.getString("horario_nombre"), rs.getString("ofi_descripcion"));
                lista.add(h);
            }
            System.out.println("Conexion establecida en Oficinas");
        } catch (Exception e) {
            System.out.println("error en la conexion" + e);
        } finally {
            return lista;
        }
}
}
