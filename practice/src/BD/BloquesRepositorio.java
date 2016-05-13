package BD;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public void actualizar (Bloque Bloque1){
        Connection conn = null;  
        PreparedStatement pst = null;  
        ResultSet rs = null;  
  
        String url = "jdbc:mysql://localhost:3306/";  
        String dbName = "ucomaps";  
        String driver = "com.mysql.jdbc.Driver";  
        String userName = "root";  
        String password = "";  
        try {  
        	Class.forName(driver).newInstance();  
            conn = DriverManager.getConnection(url + dbName, userName, password);  
  
            pst = conn.prepareStatement("UPDATE bloques SET blo_aulas=? , blo_pisos=? , blo_banos=? , blo_salas_laboratorios=? , blo_oficinas_facultades=? , blo_oratorio=? , blo_parqueadero=? , blo_zona_estudio=? WHERE blo_nombre=?"); 
            pst.setInt(1,Bloque1.getAulas());
            pst.setInt(2, Bloque1.getPisos());
            pst.setInt(3, Bloque1.getBanos());
            pst.setInt(4, Bloque1.getLaboratorios_salas());
            pst.setInt(5, Bloque1.getOficinas_facultades());
            pst.setString(6, Bloque1.getOratorios());
            pst.setString(7, Bloque1.getParqueaderos());
            pst.setString(8, Bloque1.getZonas_estudio());   
            pst.setString(9, Bloque1.getNombre_bloque());
            System.out.println(pst);
  
            pst.executeUpdate();     
  
        } catch (Exception e) {  
            System.out.println(e);  
        } finally {  
            if (conn != null) {  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (pst != null) {  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  
        



