package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.CafeteriasRepositorio;
import BD.ConsultaBloques;
import Clases.Cafeteria;

/**
 * Servlet implementation class CafeteriaControlador
 */
@WebServlet("/CafeteriaControlador")
public class CafeteriaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Cafeteria.jsp");
		try{
        	String nombre_bloque= request.getParameter("cafbloque");
        	String caf_nombre= request.getParameter("cafnombre");
        	int caf_capacidad= Integer.parseInt(request.getParameter("cafcap"));
        	
        	Cafeteria ncafeterias = new Cafeteria(nombre_bloque, caf_nombre, caf_capacidad);
        	CafeteriasRepositorio.agregar(ncafeterias);
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("bloques", ConsultaBloques.getBloques());
            rd.forward(request, response);              
        }
    }        
    
    public CafeteriaControlador() {
        super();
        // TODO Auto-generated constructor stub        
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        RequestDispatcher rd = request.getRequestDispatcher("Cafeteria.jsp");
        try {
			request.setAttribute("bloques", ConsultaBloques.getBloques());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        rd.forward(request, response);
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			responder(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
