package BD;

import java.sql.Connection;
import java.sql.Statement;

import Clases.Bloque;

public class BloquesRepositorio implements IBloquesRepositorio{
	public BloquesRepositorio() {
    }
    public void agregar(Bloque Bloque1) throws Exception{
        Connection con = new Conexion().obtenerConexion();
        Statement st = con.createStatement();
        String i = "INSERT INTO bloques (blo_nombre, blo_aulas, blo_pisos,blo_banos, blo_salas_laboratorios, blo_oficinas_facultades, blo_oratorio,blo_parqueadero, blo_zona_estudio) VALUES ('"+ Bloque1.getNombre_bloque() + "',"+ Bloque1.getAulas() + ","+ Bloque1.getPisos() +"," + Bloque1.getBanos() +","+ Bloque1.getLaboratorios_salas() +","+ Bloque1.getOficinas_facultades() +",'"+ Bloque1.getOratorios() + "','" + Bloque1.getParqueaderos() +"','"+ Bloque1.getZonas_estudio() + "')";
        System.out.println(i);
        st.executeUpdate(i);
    }
}

