package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarFacultades;
import Clases.Facultades;

/**
 * Servlet implementation class ServletFacultad
 */
@WebServlet("/ServletFacultad")
public class ServletFacultad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Facultad.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String facultades_bloque=request.getParameter("facubloque");
        	String facultades_nombre=request.getParameter("facunombre");
        	int facultades_telefono=Integer.parseInt(request.getParameter("facutel"));
        	String facultades_horario=request.getParameter("faculhora");
        	String facultades_descripcion=request.getParameter("facudesc");
        	
        	Facultades nfacultades= new Facultades(facultades_bloque, facultades_nombre, facultades_telefono, facultades_horario, facultades_descripcion);
        	AgregarFacultades.agregar(nfacultades);
        	out.println("Se ha agregado la facultad correctamente");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }
    
    public ServletFacultad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
