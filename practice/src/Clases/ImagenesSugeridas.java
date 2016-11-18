package Clases;

import BD.ImagenesSugeridasRepositorio;

public class ImagenesSugeridas {	
		private String nombre;
		private String direccion;
		private String correo;
		private String usuario;
		
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
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}		
		public ImagenesSugeridas (String nombre ,String direccion,String correo,String usuario){
		    super();
			this.nombre=nombre;
			this.direccion=direccion;
			this.correo=correo;
			this.usuario=usuario;
		}
		public void agregar() throws Exception {
			ImagenesSugeridasRepositorio.agregar(this);			
		}
}