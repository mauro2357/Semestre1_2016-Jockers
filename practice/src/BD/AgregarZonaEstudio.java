package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.ZonaEstudio;

public class AgregarZonaEstudio {
	public AgregarZonaEstudio(ZonaEstudio ZonaEstudio1){
	}
	public static void agregar(ZonaEstudio ZonaEstudio1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO zona_estudio (`zon_nombre`, `zon_capacidad`, `zon_bloque`) VALUES ('"+ ZonaEstudio1.getZona_nombre() + "',"+ ZonaEstudio1.getZona_capacidad() + ",'" + ZonaEstudio1.getZona_bloque() +"')";
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