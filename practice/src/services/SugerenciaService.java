package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import BD.ReporteSugerenciaRepositorio;
import Clases.Reporte;
import Clases.Sugerencia;

@Path("/sugerencia")
public class SugerenciaService {
	@GET
	@Path("/{param1}/{param2}/{param3}/{param4}")
	public int crearZonaEstudio(@PathParam("param1") String reporte_nombre, @PathParam("param2") String reporte_reporte, @PathParam("param3") String reporte_correo, @PathParam("param4") String reporte_usuario) throws Exception{ 
		int i = 1;
		Reporte nsugerencia = new Sugerencia(new ReporteSugerenciaRepositorio(), reporte_nombre, reporte_reporte, reporte_correo, reporte_usuario);
    	nsugerencia.agregar(); 
    	return i;

	}
}
