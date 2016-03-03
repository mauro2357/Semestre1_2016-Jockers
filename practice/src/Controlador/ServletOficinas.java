package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarOficinas;
import Clases.Oficinas;

/**
 * Servlet implementation class ServletOficinas
 */
@WebServlet("/ServletOficinas")
public class ServletOficinas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Oficinas.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String ofi_bloque = request.getParameter("ofibloque");
        	String ofi_nombre = request.getParameter("ofinombre");
        	int ofi_telefono = Integer.parseInt(request.getParameter("ofitel"));
        	String ofi_horario = request.getParameter("ofihora");
        	String ofi_descripcion = request.getParameter("ofidesc");
        	
        	Oficinas noficinas = new Oficinas(ofi_bloque, ofi_nombre, ofi_telefono, ofi_horario, ofi_descripcion);
        	AgregarOficinas.agregar(noficinas);
        	out.println("Se ha agregado la oficina correctamente" );
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }           	       
            
    public ServletOficinas() {
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
