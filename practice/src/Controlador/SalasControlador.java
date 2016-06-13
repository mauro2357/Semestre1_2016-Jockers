package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaBloques;
import BD.ConsultaHorarios;
import BD.SalasRepositorio;
import Clases.Sala;

/**
 * Servlet implementation class SalasControlador
 */
@WebServlet("/SalasControlador")
public class SalasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Salas.jsp");
        try{
        	String nombre_bloque = request.getParameter("blosala");
        	String sal_nombre = request.getParameter("nomsala");
        	int sal_equipos = Integer.parseInt(request.getParameter("equisala"));        	
        	String horario_nombre= request.getParameter("horasala");
        	String sal_videobeam= request.getParameter("salavideobeam");
        	
        	Sala nsalas= new Sala(nombre_bloque, sal_nombre,  sal_equipos, horario_nombre, sal_videobeam);
        	SalasRepositorio.agregar(nsalas);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
        	 request.setAttribute("Horario", ConsultaHorarios.getHorario());
             rd.forward(request, response);
         }
    }       	
        
    public SalasControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        RequestDispatcher rd = request.getRequestDispatcher("Salas.jsp");
        try {
        	request.setAttribute("Horario", ConsultaHorarios.getHorario());
        	request.setAttribute("bloques", ConsultaBloques.getBloques());
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
		try {
			responder(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
