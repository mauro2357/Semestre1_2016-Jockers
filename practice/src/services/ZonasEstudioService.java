package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import BD.ConsultaBloques;
import BD.ZonaEstudioRepositorio;
import Clases.ZonaEstudio;

@Path("/zonasEstudio")
public class ZonasEstudioService {
	@GET
	@Path("/{param1}/{param2}/{param3}")
	public Response crearZonaEstudio(@PathParam("param1") String nombre, @PathParam("param2") int capacidad, @PathParam("param3") String nombreBloque) throws Exception {
		if (ConsultaBloques.bloqueExiste(nombreBloque)){
		ZonaEstudio nzonaestudio = new ZonaEstudio(nombre, capacidad, nombreBloque);
		ZonaEstudioRepositorio.agregar(nzonaestudio); 
		return Response.status(200).entity(nombreBloque + "Creado exitosamente").build();
		}
		System.out.println("Bloque no existe");
		return Response.status(400).entity("La Zona de Estudio no se puede agregar, el bloque no existe.").build();
 	}
}


