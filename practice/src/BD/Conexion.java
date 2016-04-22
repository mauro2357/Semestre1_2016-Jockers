package BD;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Conexion {
	private Connection con = null;
	private Statement consulta = null;
	private ResultSet datos = null;
	
	public void con(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		     con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ucomaps","root", "root");
		}
		catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexion(){
		return con;
	}
	
	public void cerrarConexion(){
		try {
			con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public ResultSet getDatos(String com){
		try {
			this.con();
			this.datos = this.consulta.executeQuery(com);			
		} catch (Exception e) {
			System.out.println("Error de la consulta "+e.getMessage());
		}
		return datos;
	}
}



