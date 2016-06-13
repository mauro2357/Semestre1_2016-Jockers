package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaDatosPuntos;

/**
 * Servlet implementation class PuntosReferenciaInfoDatosControlador
 */
@WebServlet("/PuntosReferenciaInfoDatosControlador")
public class PuntosReferenciaInfoDatosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PuntosReferenciaInfoDatosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rs=request.getRequestDispatcher("MapaA.jsp");
		try {
			String punto = "Porteria Principal Arriba";
			//String punto=request.getParameter("puntos");
			request.setAttribute("info",ConsultaDatosPuntos.consultar(punto));
			rs.forward(request,response);
			System.out.println("Entro controlador 2 doget");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
