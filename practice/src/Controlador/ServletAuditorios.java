package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarAuditorios;
import Clases.Auditorios;

/**
 * Servlet implementation class ServletAuditorios
 */
@WebServlet("/ServletAuditorios")
public class ServletAuditorios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Auditorios.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String aud_bloque = request.getParameter("audbloque");
        	String aud_nombre = request.getParameter("audnombre");
        	int aud_capacidad = Integer.parseInt(request.getParameter("audcap"));
        	
        	Auditorios nauditorios= new Auditorios(aud_bloque, aud_nombre, aud_capacidad);
        	AgregarAuditorios.agregar(nauditorios);
        	out.println("Se ha ingresado el auditorio correctamente");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }        
    
    public ServletAuditorios() {
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
