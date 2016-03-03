package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarSalas;
import Clases.Salas;

/**
 * Servlet implementation class ServletSalas
 */
@WebServlet("/ServletSalas")
public class ServletSalas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Salas.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String sal_bloque = request.getParameter("blosala");
        	String sal_nombre = request.getParameter("nomsala");
        	int sal_equipos = Integer.parseInt(request.getParameter("equisala"));
        	String sal_videobeam= request.getParameter("salavideobeam");
        	
        	
        	Salas nsalas= new Salas(sal_bloque, sal_nombre, sal_equipos, sal_videobeam);
        	AgregarSalas.agregar(nsalas);
        	out.println("Se ha registrado correctamente el centro informatico");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }       	
        
    public ServletSalas() {
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
