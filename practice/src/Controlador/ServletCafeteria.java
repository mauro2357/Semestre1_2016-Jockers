package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarCafeterias;
import Clases.Cafeterias;

/**
 * Servlet implementation class ServletCafeteria
 */
@WebServlet("/ServletCafeteria")
public class ServletCafeteria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Cafeteria.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String caf_bloque= request.getParameter("cafbloque");
        	String caf_nombre= request.getParameter("cafnombre");
        	int caf_capacidad= Integer.parseInt(request.getParameter("cafcap"));
        	
        	Cafeterias ncafeterias = new Cafeterias(caf_bloque, caf_nombre, caf_capacidad);
        	AgregarCafeterias.agregar(ncafeterias);
        	out.println("Se ha ingresado correctamente la cafeteria");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }        
    
    public ServletCafeteria() {
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
