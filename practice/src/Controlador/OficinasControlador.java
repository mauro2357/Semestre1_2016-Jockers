package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.OficinasRepositorio;
import Clases.OficinasAgregar;

/**
 * Servlet implementation class ServletOficinas
 */
@WebServlet("/ServletOficinas")
public class OficinasControlador extends HttpServlet {
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
        	String ofi_hora_apertura = request.getParameter("ofiape");
        	String ofi_hora_cierre = request.getParameter("oficie");
        	String ofi_descripcion = request.getParameter("ofidesc");
        	
        	OficinasAgregar noficinas = new OficinasAgregar(ofi_bloque, ofi_nombre, ofi_telefono, ofi_hora_apertura, ofi_hora_cierre, ofi_descripcion);
        	OficinasRepositorio.agregar(noficinas);
        	out.println("Se ha agregado la oficina correctamente" );
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }           	       
            
    public OficinasControlador() {
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
