package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Reporte;
import Clases.Sugerencia;

public class ReporteSugerenciaRepositorio implements IReporteRepositorio{

	@Override
	public void agregar(Reporte Reporte1) {
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            if(Reporte1 instanceof Sugerencia){
            	String i = "INSERT INTO reportes (`rep_tipo`, `rep_descripcion`, `rep_usuario`, `rep_correo`) VALUES ('"+ Reporte1.getReporte_nombre()+ "','"+ Reporte1.getReporte_reporte()+ "','" + Reporte1.getReporte_usuario()+ "','" + Reporte1.getReporte_correo()+ "')"; 
            	System.out.println(i);
            	st.executeUpdate(i);
            	st.close();
            }   
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }		
}


