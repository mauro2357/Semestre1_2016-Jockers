package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarKioscos;
import Clases.Kioscos;

/**
 * Servlet implementation class ServletKioscos
 */
@WebServlet("/ServletKioscos")
public class ServletKioscos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Kioscos.jsp");
       
        PrintWriter out = response.getWriter();
        try{
        	String kio_bloque=request.getParameter("kiobloque");
        	String kio_nombre=request.getParameter("kionombre");
        	int kio_capacidad=Integer.parseInt(request.getParameter("kiocap"));
        	
        	Kioscos nkioscos= new Kioscos(kio_bloque, kio_nombre, kio_capacidad);
        	AgregarKioscos.agregar(nkioscos);
        	out.println("Se ha agregado correctamente el kiosco");
        	
        }catch (NumberFormatException e) {
    		request.setAttribute("estado", "error");
        	}finally {
        	rd.forward(request, response);
        	out.close();
     }
}      
        
    public ServletKioscos() {
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
