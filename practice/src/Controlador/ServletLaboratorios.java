package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarLaboratorios;
import Clases.Laboratorios;

/**
 * Servlet implementation class ServletLaboratorios
 */
@WebServlet("/ServletLaboratorios")
public class ServletLaboratorios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Laboratorios.jsp");
       
        PrintWriter out = response.getWriter();
        try{
        	String lab_bloque=request.getParameter("blolab");
        	String lab_nombre=request.getParameter("nomlab");
        	String lab_hora_apertura=request.getParameter("labape");
        	String lab_hora_cierre=request.getParameter("labcie");
        	String lab_descripcion=request.getParameter("labdesc");
        	String lab_videobeam=request.getParameter("labvideobeam");
        	
        	Laboratorios nlaboratorios= new Laboratorios(lab_bloque, lab_nombre, lab_hora_apertura, lab_hora_cierre, lab_descripcion, lab_videobeam);
        	AgregarLaboratorios.agregar(nlaboratorios);
        	out.println("Se ha agregado el laboratorio correctamente");
        	
        }catch (NumberFormatException e) {
    		request.setAttribute("estado", "error");
        	}finally {
        	rd.forward(request, response);
        	out.close();
        	}
	}
        
    public ServletLaboratorios() {
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
