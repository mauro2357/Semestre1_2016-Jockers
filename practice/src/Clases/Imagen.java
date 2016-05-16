package Clases;

import java.io.FileInputStream;
import java.io.InputStream;

import BD.IImagenesRepositorio;


public class Imagen {
private IImagenesRepositorio imagenesRepositorio;
	
	public Imagen(IImagenesRepositorio ImagenesRepositorio) {
		this.imagenesRepositorio=ImagenesRepositorio; 
	}

	private String nombre;
	private InputStream direccion;
	
	
	
	
	
	public InputStream getdireccion() {
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

	
	public Imagen (BD.ImagenesRepositorio imagenesRepositorio ,String nombre, InputStream direccion) {
		super();
		this.imagenesRepositorio=imagenesRepositorio;	
		this.nombre=nombre;
		this.direccion=direccion;
		
	}
	
	public Imagen(String string, InputStream unicodeStream) {
		// TODO Auto-generated constructor stub
	}
	public void agregar() {
		imagenesRepositorio.agregar(this);  
		}
}