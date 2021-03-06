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
import BD.LaboratoriosRepositorio;
import Clases.Laboratorio;

/**
 * Servlet implementation class LaboratoriosControlador
 */
@WebServlet("/LaboratoriosControlador")
public class LaboratoriosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Laboratorios.jsp");
        try{
        	String nombre_bloque=request.getParameter("blolab");
        	String lab_nombre=request.getParameter("nomlab");
        	String horario_nombre=request.getParameter("horalab");
        	String lab_descripcion=request.getParameter("labdesc");
        	String lab_videobeam=request.getParameter("labvideobeam");
        	
        	Laboratorio nlaboratorios= new Laboratorio(nombre_bloque, lab_nombre, horario_nombre, lab_descripcion, lab_videobeam);
        	LaboratoriosRepositorio.agregar(nlaboratorios);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
        	 request.setAttribute("Horario", ConsultaHorarios.getHorario());
             rd.forward(request, response);
        	}
	}
        
    public LaboratoriosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Laboratorios.jsp");	
		try {
			request.setAttribute("bloques", ConsultaBloques.getBloques());
			request.setAttribute("Horario", ConsultaHorarios.getHorario());
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
