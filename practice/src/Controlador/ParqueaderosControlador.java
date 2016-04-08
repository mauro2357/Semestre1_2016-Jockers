package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.ConsultaBloques;
import BD.ParqueaderosRepositorio;
import Clases.Parqueadero;

/**
 * Servlet implementation class ParqueaderosControlador
 */
@WebServlet("/ParqueaderosControlador")
public class ParqueaderosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher rd = request.getRequestDispatcher("Parqueadero.jsp");
       try{
        	String nombre_bloque=request.getParameter("parbloque");
        	String par_nombre=request.getParameter("parnombre");
        	int par_capacidad=Integer.parseInt(request.getParameter("parcap"));
        	
        	Parqueadero nparqueaderos = new Parqueadero(nombre_bloque, par_nombre, par_capacidad);
        	ParqueaderosRepositorio.agregar(nparqueaderos);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
             rd.forward(request, response);
         }
    }
   
    public ParqueaderosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	      RequestDispatcher rd = request.getRequestDispatcher("Parqueadero.jsp");
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
