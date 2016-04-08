package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Oficina;

public class OficinasRepositorio {
	public OficinasRepositorio(Oficina Oficinas1){
	}
	public static void agregar(Oficina Oficinas1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO oficinas (`blo_nombre`, `ofi_nombre`, `ofi_telefono`, `hor_nombre`, `ofi_descripcion`) VALUES ('"+ Oficinas1.getNombre_bloque()+ "','"+ Oficinas1.getOfi_nombre()+ "'," + Oficinas1.getOfi_telefono()+",'"+ Oficinas1.getHorario_nombre()+ "','"+ Oficinas1.getOfi_descripcion()+ "')"; 
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