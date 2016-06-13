package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaBloques;
import BD.FacultadesRepositorio;
import Clases.Facultad;

/**
 * Servlet implementation class FacultadControlador
 */
@WebServlet("/FacultadControlador")
public class FacultadControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws Exception 
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Facultad.jsp");
        try{
        	String facultades_bloque=request.getParameter("facubloque");
        	String facultades_nombre=request.getParameter("facunombre");
        	int facultades_telefono=Integer.parseInt(request.getParameter("facutel"));
        	String facultades_horario=request.getParameter("facuhora");        	
        	String facultades_descripcion=request.getParameter("facudesc");
        	
        	Facultad nfacultades= new Facultad(facultades_bloque, facultades_nombre, facultades_telefono, facultades_horario, facultades_descripcion);
        	FacultadesRepositorio.agregar(nfacultades);        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
             rd.forward(request, response);            
         }
    }
    
    public FacultadControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        RequestDispatcher rd = request.getRequestDispatcher("Facultad.jsp");
        try {
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
