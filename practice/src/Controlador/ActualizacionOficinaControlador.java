package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ActualizacionOficinasRepositorio;
import BD.ConsultaHorarios;
import BD.ConsultaOficinas;

/**
 * Servlet implementation class ActualizacionOficinaControlador
 */
@WebServlet("/ActualizacionOficinaControlador")
public class ActualizacionOficinaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("ActualizarHorarioOficina.jsp");
        PrintWriter out = response.getWriter(); 
        try{
			String horario = request.getParameter("horario");
			String oficina = request.getParameter("oficina");     	
			
			if(ActualizacionOficinasRepositorio.actualizar(horario, oficina)){ 
				out.print("<p style=\"color:red\">Usuario y/o Contraseņa Invalidos</p>"); 
			}
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("oficina", ConsultaOficinas.getOficinas());
        	request.setAttribute("horario", ConsultaHorarios.getHorario());
            rd.forward(request, response);              
        }
    }       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizacionOficinaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("ActualizarHorarioOficina.jsp");
        try {
        	request.setAttribute("horario", ConsultaHorarios.getHorario());
        	request.setAttribute("oficina", ConsultaOficinas.getOficinas());
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
