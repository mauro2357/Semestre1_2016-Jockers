package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.AuditoriosRepositorio;
import BD.ConsultaBloques;
import Clases.AuditoriosAgregar;

/**
 * Servlet implementation class AuditoriosControlador
 */
@WebServlet("/AuditoriosControlador")
public class AuditoriosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Auditorios.jsp");
		try{
        	String nombre_bloque = request.getParameter("audbloque");
        	String aud_nombre = request.getParameter("audnombre");
        	int aud_capacidad = Integer.parseInt(request.getParameter("audcap"));
        	
        	AuditoriosAgregar nauditorios= new AuditoriosAgregar(nombre_bloque, aud_nombre, aud_capacidad);
        	AuditoriosRepositorio.agregar(nauditorios);        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("bloques", ConsultaBloques.getBloques());
            rd.forward(request, response);         
            }
    }        
    
    public AuditoriosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Auditorios.jsp");
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
