package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ActualizacionBloquesRepositorio;
import BD.ConsultaBloques;


/**
 * Servlet implementation class ActualizacionBloquesControlador
 */
@WebServlet("/ActualizacionBloquesControlador")
public class ActualizacionBloquesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("ActualizacionDatosBloques.jsp");
        PrintWriter out = response.getWriter(); 
        try{
        	int aulas = Integer.parseInt(request.getParameter("numaulas")); 
            int pisos = Integer.parseInt(request.getParameter("numpiso"));                       
            int laboratorio_salas = Integer.parseInt(request.getParameter("numlabsalas")); 
            int oficinas_facultades = Integer.parseInt(request.getParameter("oficinasfacultades"));            
            int banos = Integer.parseInt(request.getParameter("numbanos"));
            String oratorio =request.getParameter("oratorios");
            String parqueadero =request.getParameter("parqueo");
            String zona_estudio =request.getParameter("estudio");
            String nombre=request.getParameter("bloques");
            
            if(ActualizacionBloquesRepositorio.actualizar(aulas,pisos,laboratorio_salas,oficinas_facultades,banos,oratorio,parqueadero,zona_estudio,nombre)){ 
				out.print("<p style=\"color:red\">Usuario y/o Contraseņa Invalidos</p>"); 
			}
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	request.setAttribute("bloques", ConsultaBloques.getBloques());            
            rd.forward(request, response);              
        }
    }       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizacionBloquesControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("ActualizacionDatosBloques.jsp");
		request.setAttribute("bloques", ConsultaBloques.getBloques());
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
