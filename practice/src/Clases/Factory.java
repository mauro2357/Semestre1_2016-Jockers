package Clases;

import javax.servlet.http.HttpServletRequest;

import BD.ReporteFalloRepositorio;
import BD.ReporteSugerenciaRepositorio;

public class Factory {
	private static Factory unicaInstancia;
	
	public static Factory getinstance(){
		if (unicaInstancia==null)unicaInstancia= new Factory();
		return unicaInstancia;
	}
	public void agregarReporte(HttpServletRequest request){
		if(request.getParameter("dato").equals("Fallo")){
			String reporte_nombre = request.getParameter("dato");
        	String reporte_reporte = request.getParameter("sugrep");
        	String reporte_correo = request.getParameter("sugcorreo");
        	String reporte_usuario = request.getParameter("datou");
        	Reporte nfallo = new Fallo (new ReporteFalloRepositorio(), reporte_nombre, reporte_reporte, reporte_correo, reporte_usuario);
    	    nfallo.agregar(); 
    	    ICommand enviofallo = new EnvioFallo(nfallo);
    		EnvioReporte envio = new EnvioReporte(enviofallo, enviofallo);
    		System.out.println("Enviado "+envio.ordenEnvioFallo);

		}else{
			String reporte_nombre = request.getParameter("dato");
        	String reporte_reporte = request.getParameter("sugrep");
        	String reporte_correo = request.getParameter("sugcorreo");
        	String reporte_usuario = request.getParameter("datou");
			Reporte nsugerencia = new Sugerencia(new ReporteSugerenciaRepositorio(), reporte_nombre, reporte_reporte, reporte_correo, reporte_usuario);
        	nsugerencia.agregar(); 
        	ICommand enviosugerencia = new EnvioSugerencia(nsugerencia);
        	EnvioReporte envio = new EnvioReporte(enviosugerencia, enviosugerencia);
        	System.out.println("Enviada "+envio.ordenEnvioSugerencia);
		}		
	}
}
