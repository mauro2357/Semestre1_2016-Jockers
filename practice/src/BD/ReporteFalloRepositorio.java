package BD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.Statement;

import Clases.Fallo;
import Clases.Reporte;

public class ReporteFalloRepositorio implements IReporteRepositorio{

	@Override
	public void agregar(Reporte Reporte1) throws Exception {
		Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        if(Reporte1 instanceof Fallo){
        	String i = "INSERT INTO reportes (`rep_tipo`, `rep_descripcion`, `rep_usuario`, `rep_correo`) VALUES ('"+ Reporte1.getReporte_nombre()+ "','"+ Reporte1.getReporte_reporte()+ "','" + Reporte1.getReporte_usuario()+ "','" + Reporte1.getReporte_correo()+ "')"; 
        	System.out.println(i);
            st.executeUpdate(i);
            st.close();            	

            String escribir = "Fallo: " + Reporte1.getReporte_reporte();
            	
            File archivo = new File ("C:\\0NuevaFuncionalidad\\archivo.txt");
            	
            if (!archivo.exists()) {
            	archivo.createNewFile();
    				System.out.println("Se ha creado el archivo");    				
    			}            	
            FileWriter w = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(w);

            bw.write(escribir);                
            System.out.println(escribir);          
            bw.close();
          }
	}
}
