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
import Clases.SalasAgregar;

/**
 * Servlet implementation class SalasControlador
 */
@WebServlet("/SalasControlador")
public class SalasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Salas.jsp");
        try{
        	String nombre_bloque = request.getParameter("blosala");
        	String sal_nombre = request.getParameter("nomsala");
        	int sal_equipos = Integer.parseInt(request.getParameter("equisala"));        	
        	String horario_nombre= request.getParameter("horasala");
        	String sal_videobeam= request.getParameter("salavideobeam");
        	
        	SalasAgregar nsalas= new SalasAgregar(nombre_bloque, sal_nombre,  sal_equipos, horario_nombre, sal_videobeam);
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
        request.setAttribute("bloques", ConsultaBloques.getBloques());
   		request.setAttribute("Horario", ConsultaHorarios.getHorario());
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
