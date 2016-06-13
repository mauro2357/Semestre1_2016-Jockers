package BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Oficina;

public class ConsultaOficinas {
	public static ArrayList<Oficina> getOficinas() throws Exception {
        ArrayList<Oficina> lista = new ArrayList<Oficina>();
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select * from oficinas");
        while (rs.next()) {
        	Oficina h = new Oficina(rs.getString("blo_nombre"), rs.getString("ofi_nombre"), rs.getInt("ofi_telefono"), rs.getString("hor_nombre"), rs.getString("ofi_descripcion"));
            h.setOfi_nombre(rs.getString("ofi_nombre"));            	
            lista.add(h);
        }
        System.out.println("Conexion establecida en Oficinas");
         return lista;
        }
	}

