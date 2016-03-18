package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.AulasRepositorio;
import BD.ConsultaBloques;
import Clases.AulasAgregar;

/**
 * Servlet implementation class AulasControlador
 */
@WebServlet("/AulasControlador")
public class AulasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Aulas.jsp");
		try{
        	String nombre_aula=request.getParameter("nomaula");
        	String nombre_bloque=request.getParameter("aulabloque");
        	String videobeam=request.getParameter("videobeamtv");
        	int capacidad=Integer.parseInt(request.getParameter("aulacap"));
        	        	
        	AulasAgregar naulas= new AulasAgregar(nombre_aula,nombre_bloque,videobeam,capacidad);
        	AulasRepositorio.agregar(naulas);       	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("bloques", ConsultaBloques.getBloques());
            rd.forward(request, response);         }
    }
	
    public AulasControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Aulas.jsp");
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