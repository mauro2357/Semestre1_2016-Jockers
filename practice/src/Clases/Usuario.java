package Clases;

public class Usuario {
	int id;
	String nombre;
	String direccion;
	int telefono;
	String correo;
	String password;
	String fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int gettelefono() {
		return telefono;
	}
	public void settelefono(int telefono) {
		this.telefono =telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public Usuario(int id, String nombre, String direccion, int telefono,
			String correo, String password, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.fecha = fecha;
	}

}

