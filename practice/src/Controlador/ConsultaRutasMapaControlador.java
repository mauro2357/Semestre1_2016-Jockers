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
 * Servlet implementation class ConsultaRutasMapaControlador
 */
@WebServlet("/ConsultaRutasMapaControlador")
public class ConsultaRutasMapaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaRutasMapaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("ConsultaRutas.jsp");
		try {
			request.setAttribute("rutas", ConsultaPuntoReferencia.getPuntos());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rd.forward(request, response);
		}			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ruta = request.getParameter("rutas");
		try {
			if (ConsultaPuntoReferencia.consultar(ruta) != null){
				ConsultaPuntoReferencia consulta = new ConsultaPuntoReferencia();
				String VectorScript= consulta.GetVectorPuntos(ruta);
				request.setAttribute("VectorScript", VectorScript);	
				RequestDispatcher rd = request.getRequestDispatcher("Rutas.jsp");
		        rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
