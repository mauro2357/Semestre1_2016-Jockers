package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaDatosBloques;

/**
 * Servlet implementation class BloquesInfoDatosControlador
 */
@WebServlet("/BloquesInfoDatosControlador")
public class BloquesInfoDatosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloquesInfoDatosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bloques=request.getParameter("bloques");
		request.setAttribute("InfoBloques", ConsultaDatosBloques.consultar(bloques));
		RequestDispatcher rs=request.getRequestDispatcher("InfoBloques.jsp");
		rs.forward(request, response);
		System.out.println("Entro al Controlador2 doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
