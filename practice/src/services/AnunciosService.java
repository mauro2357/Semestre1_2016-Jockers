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
	@Path("/{param1}/{param2}/{param3}")
	public Response crearZonaEstudio(@PathParam("param1") int empresa, @PathParam("param2") String anuncio, @PathParam("param3") String descripcion){ 
		Anuncios nanuncio = new Anuncios(empresa, anuncio, descripcion);
		AnuncioRepositorio.agregar(nanuncio); 
 
		return Response.status(200).entity("Su anuncio '"+anuncio +", "+ descripcion +"' fue enviado exitosamente").build();
 	}
}


