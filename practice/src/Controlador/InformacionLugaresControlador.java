package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaAulas;
import BD.ConsultaBloques;
import BD.ConsultaDatosAulas;
import BD.ConsultaDatosBloques;

/**
 * Servlet implementation class InformacionLugaresControlador
 */
@WebServlet("/InformacionLugaresControlador")
public class InformacionLugaresControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionLugaresControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			RequestDispatcher rs= request.getRequestDispatcher("consultaInformacion.jsp");
			request.setAttribute("bloques", ConsultaBloques.getBloques());
			request.setAttribute("aulas", ConsultaAulas.getAula());		
			rs.forward(request, response);
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
		String aula=request.getParameter("aulabloque");
		String bloque=request.getParameter("bloques");

		try {
			ConsultaDatosAulas.Consultar(aula);
			ConsultaDatosBloques.consultar(bloque);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
