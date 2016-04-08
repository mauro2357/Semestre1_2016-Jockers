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
import BD.OficinasRepositorio;
import Clases.Oficina;

/**
 * Servlet implementation class OficinasControlador
 */
@WebServlet("/OficinasControlador")
public class OficinasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Oficinas.jsp");
        try{
        	String nombre_bloque = request.getParameter("ofibloque");
        	String ofi_nombre = request.getParameter("ofinombre");
        	int ofi_telefono = Integer.parseInt(request.getParameter("ofitel"));
        	String horario_nombre = request.getParameter("horaofi");
        	String ofi_descripcion = request.getParameter("ofidesc");
        	
        	Oficina noficinas = new Oficina(nombre_bloque, ofi_nombre, ofi_telefono, horario_nombre, ofi_descripcion);
        	OficinasRepositorio.agregar(noficinas);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
        	 request.setAttribute("Horario", ConsultaHorarios.getHorario());
             rd.forward(request, response);
         }
    }           	       
            
    public OficinasControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        RequestDispatcher rd = request.getRequestDispatcher("Oficinas.jsp");
		request.setAttribute("bloques", ConsultaBloques.getBloques());
   	 	request.setAttribute("Horario", ConsultaHorarios.getHorario());
        rd.forward(request, response);	}		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
