package BD;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.Bloque;

public class BloquesRepositorio implements IBloquesRepositorio{
	public BloquesRepositorio() {
    }
    public void agregar(Bloque Bloque1){
        Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "");
            st = con.createStatement();
            String i = "INSERT INTO bloques (blo_nombre, blo_aulas, blo_pisos,blo_banos, blo_salas_laboratorios, blo_oficinas_facultades, blo_oratorio,blo_parqueadero, blo_zona_estudio) VALUES ('"+ Bloque1.getNombre_bloque() + "',"+ Bloque1.getAulas() + ","+ Bloque1.getPisos() +"," + Bloque1.getBanos() +","+ Bloque1.getLaboratorios_salas() +","+ Bloque1.getOficinas_facultades() +",'"+ Bloque1.getOratorios() + "','" + Bloque1.getParqueaderos() +"','"+ Bloque1.getZonas_estudio() + "')";
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
            File archivo;
            FileWriter w;
            BufferedWriter bw;
            PrintWriter wr;
            try {
                archivo = new File ("C:\\0NuevaFuncionalidad\\archivo.txt");
                w = new FileWriter(archivo);
                bw = new BufferedWriter (w);
                wr = new PrintWriter (bw);
                
                wr.write("Esta es ");
                wr.append("segu");

				if(archivo.createNewFile()){
					System.out.println("Se ha creado el archivo");
					wr.close();
					bw.close();
				}
			} catch (IOException e) {
				System.err.println("No se ha podido crear el archivo" + e );
				System.out.println("NOOO Se ha creado el archivo");				
			}
            
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}

