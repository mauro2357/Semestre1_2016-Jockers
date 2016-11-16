package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaPuntoReferencia;

/**
 * Servlet implementation class PuntoReferenciaControlador
 */
@WebServlet("/PuntoReferenciaControlador")
public class PuntoReferenciaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PuntoReferenciaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ruta = request.getParameter("rutas");
		try {
			if (ConsultaPuntoReferencia.consultar(ruta) != null){
				ConsultaPuntoReferencia consulta = new ConsultaPuntoReferencia();
				String VectorScript= consulta.GetVectorScript(ruta);
				request.setAttribute("VectorScript", VectorScript);	
				RequestDispatcher rd = request.getRequestDispatcher("Puntos.jsp");
		        rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
