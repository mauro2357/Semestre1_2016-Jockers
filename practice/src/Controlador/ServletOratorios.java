package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarOratorios;
import Clases.Oratorios;

/**
 * Servlet implementation class ServletOratorios
 */
@WebServlet("/ServletOratorios")
public class ServletOratorios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Oratorios.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String ora_bloque=request.getParameter("orabloque");
        	String ora_nombre=request.getParameter("oranombre");
        	int ora_capacidad=Integer.parseInt(request.getParameter("oratcap"));
        	
        	Oratorios noratorios= new Oratorios(ora_bloque, ora_nombre, ora_capacidad);
        	AgregarOratorios.agregar(noratorios);
        	out.println("Se ha agregado el oratorio correctamente");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }        
    
    public ServletOratorios() {
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
