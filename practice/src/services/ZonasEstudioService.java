package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import BD.ZonaEstudioRepositorio;
import Clases.ZonaEstudio;

@Path("/zonasEstudio")
public class ZonasEstudioService {
	@GET
	@Path("/{param}")
	public Response crearZonaEstudio(@PathParam("param") String nombreBloque) {
 
		ZonaEstudio nzonaestudio = new ZonaEstudio(nombreBloque, 4, "A");
		ZonaEstudioRepositorio.agregar(nzonaestudio); 
 
		return Response.status(200).entity(nombreBloque + "Creado exitosamente").build();
 
	}
}


