package Clases;

import java.io.FileInputStream;


import BD.IImagenesRepositorio;


public class Imagen {
private IImagenesRepositorio imagenesRepositorio;
	
	public Imagen(IImagenesRepositorio ImagenesRepositorio) {
		this.imagenesRepositorio=ImagenesRepositorio; 
	}

	private String nombre;
	private FileInputStream direccion;
	
	
	
	
	
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

	
	public Imagen (BD.ImagenesRepositorio imagenesRepositorio ,String nombre, FileInputStream direccion) {
		super();
		this.imagenesRepositorio=imagenesRepositorio;	
		this.nombre=nombre;
		this.direccion=direccion;
		
	}
	
	public void agregar() {
		imagenesRepositorio.agregar(this);  
		}
}