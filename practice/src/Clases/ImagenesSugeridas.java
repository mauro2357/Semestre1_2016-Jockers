package Clases;

import java.io.FileInputStream;

public class ImagenesSugeridas {
	
		private String nombre;
		private FileInputStream direccion;
		private String correo;
		private String  usuario;
		
		
		
		public FileInputStream getdireccion() {
			return direccion;
		}
		public void setDireccion_imagen(FileInputStream direccion) {
			this.direccion = direccion;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
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
		
		public  ImagenesSugeridas (String nombre ,FileInputStream direccion,String correo,String usuario){
		    super();
			this.nombre=nombre;
			this.direccion=direccion;
			this.correo=correo;
			this.usuario=usuario;
			
			
			
		}
			
				
		}



