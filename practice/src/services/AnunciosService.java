package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import BD.AnuncioRepositorio;
import Clases.Anuncios;

@Path("/anuncios")
public class AnunciosService {
	@GET
	@Path("/{param1}/{param2}")
	public Response crearZonaEstudio(@PathParam("param1") String anuncio, @PathParam("param2") String descripcion){ 
		Anuncios nanuncio = new Anuncios(anuncio, descripcion);
		AnuncioRepositorio.agregar(nanuncio); 
 
		return Response.status(200).entity("Su anuncio '"+anuncio +", "+ descripcion +"' fue enviado exitosamente").build();
 	}
}


