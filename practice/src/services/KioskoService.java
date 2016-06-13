package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import BD.ConsultaBloques;
import BD.KioscosRepositorio;
import Clases.Kiosco;

@Path("/kiosko")
public class KioskoService {
	@GET
	@Path("/{param1}/{param2}/{param3}")
	public Response crearZonaEstudio(@PathParam("param1") String nombre_bloque, @PathParam("param2") String kio_nombre, @PathParam("param3") int kio_capacidad) throws Exception{ 
		if (ConsultaBloques.bloqueExiste(nombre_bloque)){
			Kiosco nkioscos= new Kiosco(nombre_bloque, kio_nombre, kio_capacidad);
	    	KioscosRepositorio.agregar(nkioscos);	 
			return Response.status(200).entity("El kiosko '"+kio_nombre +"' fue enviado exitosamente").build();	
		}
		System.out.println("Bloque no existe");
		return Response.status(400).entity("El kiosko no se puede agregar, el bloque no existe.").build();
 	}
}
