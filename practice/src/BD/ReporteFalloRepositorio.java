package BD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Fallo;
import Clases.Reporte;

public class ReporteFalloRepositorio implements IReporteRepositorio{

	@Override
	public void agregar(Reporte Reporte1) {
		Connection con;
        Statement st;    
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
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
		
	}catch (IOException e) {
		System.out.println("La clase no existe");	
		System.err.println("No se ha podido crear el archivo" + e );
		System.out.println("NOOO Se ha creado el archivo");	
	}catch (SQLException e){
		throw new RuntimeException(e);
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
