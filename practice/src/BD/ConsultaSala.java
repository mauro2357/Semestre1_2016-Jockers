package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Sala;

public class ConsultaSala {
	public static ArrayList<Sala> getSalas() throws Exception {
        ArrayList<Sala> lista = new ArrayList<Sala>();
        Connection con = new Conexion().obtenerConexion();
        Statement sql = con.createStatement();
        ResultSet rs = sql.executeQuery("Select  * from salas");
        while (rs.next()) {
        	Sala h = new Sala(rs.getString("blo_nombre"), rs.getString("sal_nombre"), rs.getInt("sal_numero_equipos"), rs.getString("hor_nombre"), rs.getString("sal_videobeam"));
            lista.add(h);
        }
        System.out.println("Conexion establecida en Salas");
        return lista;
        }
    }   
