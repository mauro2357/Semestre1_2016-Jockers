package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Reporte;
import Clases.Sugerencia;

public class ReporteSugerenciaRepositorio implements IReporteRepositorio{

	@Override
	public void agregar(Reporte Reporte1) throws Exception {
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        if(Reporte1 instanceof Sugerencia){
        	String i = "INSERT INTO reportes (`rep_tipo`, `rep_descripcion`, `rep_usuario`, `rep_correo`) VALUES ('"+ Reporte1.getReporte_nombre()+ "','"+ Reporte1.getReporte_reporte()+ "','" + Reporte1.getReporte_usuario()+ "','" + Reporte1.getReporte_correo()+ "')"; 
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
        }        
    }		
}


