package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Anuncios;

public class AnuncioRepositorio {
	public static void agregar(Anuncios Anuncio1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO anuncios (`empresa_anuncio`, `titulo_anuncio`, `descripcion_anuncio`) VALUES ("+ Anuncio1.getEmpresa_anuncio()+ ",'"+ Anuncio1.getTitulo_anuncio()+ "','" + Anuncio1.getDescripcion_anuncio()+ "')"; 
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
