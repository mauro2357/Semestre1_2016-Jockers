package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ManagerFitnesRepositorio;
import Clases.Usuario;

/**
 * Servlet implementation class ServicioControlador
 */
@WebServlet("/ServicioControlador")
public class ServicioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Servicio.jsp");
       try{
    	   int id = Integer.parseInt(request.getParameter("id"));
        	String nombre=request.getParameter("nombre");
        	String direccion=request.getParameter("direccion");
     	   int telefono = Integer.parseInt(request.getParameter("telefono"));
     	  String correo=request.getParameter("correo");
     	 String password=request.getParameter("password");
     	String fecha=request.getParameter("fecha");
     

            
            Usuario nusuario=new Usuario( id,  nombre,  direccion, telefono,
        			 correo,  password,  fecha);
            ManagerFitnesRepositorio.crearUsuario(nusuario);
         }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
         }
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicioControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			responder(request,response);	
			}catch(Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
