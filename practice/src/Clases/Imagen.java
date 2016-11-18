package Clases;

import BD.IImagenesRepositorio;

public class Imagen {
	private String nombre;
	private String photo;
	private IImagenesRepositorio imagenesRepositorio;
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public IImagenesRepositorio getImagenesRepositorio() {
		return imagenesRepositorio;
	}
	public void setImagenesRepositorio(IImagenesRepositorio imagenesRepositorio) {
		this.imagenesRepositorio = imagenesRepositorio;
	}
	public Imagen(IImagenesRepositorio ImagenesRepositorio, String nombre, String photo) {
		this.imagenesRepositorio=ImagenesRepositorio;
		this.nombre=nombre;
		this.photo=photo;
	}
	public void agregar() throws Exception {
		imagenesRepositorio.agregar(this);
	}
}