package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.BloquesRepositorio;
import Clases.BloquesAgregar;

/**
 * Servlet implementation class BloquesControlador
 */
@WebServlet("/BloquesControlador")
public class BloquesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Bloques.jsp");
       try{
        	String nombre=request.getParameter("nombloque");
            int pisos = Integer.parseInt(request.getParameter("numpiso"));
            int aulas = Integer.parseInt(request.getParameter("numaulas"));            
            int laboratorio_salas = Integer.parseInt(request.getParameter("numlabsalas")); 
            int oficinas_facultades = Integer.parseInt(request.getParameter("oficinasfacultades"));            
            int banos = Integer.parseInt(request.getParameter("numbanos"));
            String oratorio =request.getParameter("oratorios");
            String parqueadero =request.getParameter("parqueo");
            String zona_estudio =request.getParameter("estudio");
          
            BloquesAgregar nbloque=new BloquesAgregar(nombre, pisos, aulas, laboratorio_salas, oficinas_facultades, banos, oratorio, parqueadero, zona_estudio);
                BloquesRepositorio.agregar(nbloque);                
         }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
         }
    }
	
    public BloquesControlador() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request, response);
	}

}
