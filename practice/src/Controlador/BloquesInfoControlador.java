package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaBloques;
import BD.ConsultaDatosBloques;

/**
 * Servlet implementation class BloquesInfoControlador
 */
@WebServlet("/BloquesInfoControlador")
public class BloquesInfoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloquesInfoControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("BloquesInfo.jsp");
		try {
			request.setAttribute("bloques", ConsultaBloques.getBloques());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rd.forward(request, response);
		System.out.println("Entro al Controlador1 doGet");
		}		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("bloques");		        
		try {
			ConsultaDatosBloques.consultar(nombre);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Entro al Controlador1 doPost");

		}	
	}