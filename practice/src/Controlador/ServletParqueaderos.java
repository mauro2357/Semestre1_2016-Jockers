package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarParqueaderos;
import Clases.Parqueaderos;

/**
 * Servlet implementation class ServletParqueaderos
 */
@WebServlet("/ServletParqueaderos")
public class ServletParqueaderos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Parqueadero.jsp");
       
        PrintWriter out = response.getWriter();
        try{
        	String par_bloque=request.getParameter("parbloque");
        	String par_nombre=request.getParameter("parnombre");
        	int par_capacidad=Integer.parseInt(request.getParameter("parcap"));
        	
        	Parqueaderos nparqueaderos = new Parqueaderos(par_bloque, par_nombre, par_capacidad);
        	AgregarParqueaderos.agregar(nparqueaderos);
        	out.println("Se ha agregado el parqueadero correctamente");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }
   
    public ServletParqueaderos() {
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
