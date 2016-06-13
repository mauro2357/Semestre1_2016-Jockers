package services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import BD.ProxyBloquesRepositorio;
import Clases.Bloque;

@Path("/bloque")
public class BloqueService {
	@GET
	@Path("/{param1}/{param2}/{param3}/{param4}/{param5}/{param6}/{param7}/{param8}/{param9}")
	public int crearBloque(@PathParam("param1") String nombre, @PathParam("param2") int pisos, @PathParam("param3") int aulas, @PathParam("param4") int laboratorio_salas, @PathParam("param5") int oficinas_facultades, @PathParam("param6") int banos, @PathParam("param7") String oratorio, @PathParam("param8") String parqueadero, @PathParam("param9") String zona_estudio) throws Exception{ 
		int i = 1;
		Bloque nbloque=new Bloque(new ProxyBloquesRepositorio(), nombre, pisos, aulas, laboratorio_salas, oficinas_facultades, banos, oratorio, parqueadero, zona_estudio);
        nbloque.agregar(); 
		return i ;
 	}
}
