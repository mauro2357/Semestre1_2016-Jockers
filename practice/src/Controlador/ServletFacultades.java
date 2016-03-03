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
 * Servlet implementation class ServletFacultades
 */
@WebServlet("/ServletFacultades")
public class ServletFacultades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Facultades.jsp");
       
        PrintWriter out = response.getWriter();
        try{
        	String facu_bloque=request.getParameter("facbloque");
        	String fac_nombre=request.getParameter("facnombre");
        	int fac_telefono=Integer.parseInt(request.getParameter("factel"));
        	String fac_horario=request.getParameter("fachora");
        	String fac_descripcion=request.getParameter("facdesc");
        	
        	Facultades nfacultades= new Facultades(facu_bloque, fac_nombre, fac_telefono, fac_horario, fac_descripcion);
        	AgregarFacultades.agregar(nfacultades);
        	out.println("Se ha agregado correctamente la facultad");
        	
        	}catch (NumberFormatException e) {
        		request.setAttribute("estado", "error");
            	}finally {
            	rd.forward(request, response);
            	out.close();
         }
    }       	
        
    public ServletFacultades() {
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
