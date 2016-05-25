package Clases;

public class Anuncios {
	public String titulo_anuncio;
	public String descripcion_anuncio;
	
	public String getTitulo_anuncio() {
		return titulo_anuncio;
	}
	public void setTitulo_anuncio(String titulo_anuncio) {
		this.titulo_anuncio = titulo_anuncio;
	}
	public String getDescripcion_anuncio() {
		return descripcion_anuncio;
	}
	public void setDescripcion_anuncio(String descripcion_anuncio) {
		this.descripcion_anuncio = descripcion_anuncio;
	}
	public Anuncios(String titulo_anuncio,
			String descripcion_anuncio) {
		super();
		this.titulo_anuncio = titulo_anuncio;
		this.descripcion_anuncio = descripcion_anuncio;
	}
}
