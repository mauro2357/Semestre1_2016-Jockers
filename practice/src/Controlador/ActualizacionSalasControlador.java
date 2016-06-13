package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ActualizacionSalasRepositorio;
import BD.ConsultaHorarios;
import BD.ConsultaSala;

/**
 * Servlet implementation class ActualizacionSalasControlador
 */
@WebServlet("/ActualizacionSalasControlador")
public class ActualizacionSalasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("ActualizarHorarioSala.jsp");
        PrintWriter out = response.getWriter(); 
        try{
			String horario = request.getParameter("horario");
			String sala = request.getParameter("salas");     	
			
			if(ActualizacionSalasRepositorio.actualizar(horario, sala)){ 
				out.print("<p style=\"color:red\">Usuario y/o Contraseña Invalidos</p>"); 
			}
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
            request.setAttribute("salas", ConsultaSala.getSalas());
            request.setAttribute("horario", ConsultaHorarios.getHorario());
            rd.forward(request, response);              
        }
    }   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizacionSalasControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("ActualizarHorarioSala.jsp");
        try {
        	request.setAttribute("horario", ConsultaHorarios.getHorario());
        	request.setAttribute("salas", ConsultaSala.getSalas());
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
