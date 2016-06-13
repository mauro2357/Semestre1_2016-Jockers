package BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Laboratorio;
public class ConsultaLaboratorios {
	public static ArrayList<Laboratorio> getLaboratorios() throws Exception {
        ArrayList<Laboratorio> lista = new ArrayList<Laboratorio>();
        Connection con = new Conexion().obtenerConexion();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("Select * from laboratorios");
        while (rs.next()) {
        Laboratorio h = new Laboratorio(rs.getString("blo_nombre"), rs.getString("lab_nombre"), rs.getString("lab_descripcion"), rs.getString("lab_videobeam_tv"), rs.getString("hor_nombre"));
        h.setLab_nombre(rs.getString("lab_nombre"));  
        h.setHorario_nombre(rs.getString("hor_nombre"));
        lista.add(h);
        }
        System.out.println("Conexion establecida en Laboratorios");
        return lista;       
	}
}
