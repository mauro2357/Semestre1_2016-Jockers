package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ActualizacionBloquesRepositorio;
import BD.ConsultaBloques;
import Clases.Bloque;

/**
 * Servlet implementation class ActualizacionBloquesControlador
 */
@WebServlet("/ActualizacionBloquesControlador")
public class ActualizacionBloquesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("ActualizacionDatosBloques.jsp");
        try{
        	int aulas = Integer.parseInt(request.getParameter("numaulas")); 
            int pisos = Integer.parseInt(request.getParameter("numpiso"));                       
            int laboratorio_salas = Integer.parseInt(request.getParameter("numlabsalas")); 
            int oficinas_facultades = Integer.parseInt(request.getParameter("oficinasfacultades"));            
            int banos = Integer.parseInt(request.getParameter("numbanos"));
            String oratorio =request.getParameter("oratorios");
            String parqueadero =request.getParameter("parqueo");
            String zona_estudio =request.getParameter("estudio");
            String nombre=request.getParameter("bloques");
            
            Bloque nbloque=new Bloque(new ActualizacionBloquesRepositorio(), nombre, pisos, aulas, laboratorio_salas, oficinas_facultades, banos, oratorio, parqueadero, zona_estudio);
            nbloque.actualizar();
            
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("bloques", ConsultaBloques.getBloques());            
            rd.forward(request, response);              
        }
    }       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizacionBloquesControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("ActualizacionDatosBloques.jsp");
		request.setAttribute("bloques", ConsultaBloques.getBloques());
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
