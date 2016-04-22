package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ReporteFalloRepositorio;
import BD.ReporteSugerenciaRepositorio;
import Clases.Fallo;
import Clases.Sugerencia;
import Clases.Reporte;

/**
 * Servlet implementation class SugerenciasControlador
 */
@WebServlet("/ReporteControlador")
public class ReporteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher("Reportes.jsp");
        try{
        	String reporte_nombre = request.getParameter("dato");
        	String reporte_reporte = request.getParameter("sugrep");
        	String reporte_correo = request.getParameter("sugcorreo");
        	String reporte_usuario = request.getParameter("datou");
        	
        	if(request.getParameter("dato").equals("Fallo")){
        		Reporte nfallo = new Fallo (new ReporteFalloRepositorio(), reporte_nombre, reporte_reporte, reporte_correo, reporte_usuario);
        	    nfallo.agregar();              	           		  	            	 
            	}else{
            			Reporte nsugerencia = new Sugerencia(new ReporteSugerenciaRepositorio(), reporte_nombre, reporte_reporte, reporte_correo, reporte_usuario);
                    	nsugerencia.agregar();             		       		
            	}      	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally{
        	rd.forward(request, response);	
        }        
	}
    public ReporteControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
