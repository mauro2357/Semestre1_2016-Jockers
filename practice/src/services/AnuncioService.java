package services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import BD.AnuncioRepositorio;
import Clases.Anuncios;

@Path("/anuncios")
public class AnuncioService {
	@GET
	@Path("/{param1}/{param2}")
	public int crearZonaEstudio(@PathParam("param1") String anuncio, @PathParam("param2") String descripcion) throws Exception{ 
		int i = 1;
		Anuncios nanuncio = new Anuncios(anuncio, descripcion);
		AnuncioRepositorio.agregar(nanuncio); 
 
		return i;
 	}
}
