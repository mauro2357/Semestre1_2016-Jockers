package Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import BD.ConsultaBloques;
import BD.KioscosRepositorio;
import Clases.Kiosco;

/**
 * Servlet implementation class KioscosControlador
 */
@WebServlet("/KioscosControlador")
public class KioscosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Kioscos.jsp");
        try{
        	String nombre_bloque=request.getParameter("kiobloque");
        	String kio_nombre= request.getParameter("kionombre");
        	int kio_capacidad=Integer.parseInt(request.getParameter("kiocap"));
        	
        	Kiosco nkioscos= new Kiosco(nombre_bloque, kio_nombre, kio_capacidad);
        	KioscosRepositorio.agregar(nkioscos);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
             rd.forward(request, response);
     }
}      
        
    public KioscosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Kioscos.jsp");	
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
