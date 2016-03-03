package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AgregarZonaEstudio;
import Clases.ZonaEstudio;

/**
 * Servlet implementation class ServletZonaEstudio
 */
@WebServlet("/ServletZonaEstudio")
public class ServletZonaEstudio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("ZonaEstudio.jsp");
        
        PrintWriter out = response.getWriter();
        try{
        	String zona_nombre=request.getParameter("zonanom");
        	int zona_capacidad=Integer.parseInt(request.getParameter("zonacap"));
        	String zona_bloque=request.getParameter("zonablo");
        	
        	ZonaEstudio nzonaestudio = new ZonaEstudio(zona_nombre, zona_capacidad, zona_bloque);
        	AgregarZonaEstudio.agregar(nzonaestudio);
        	out.println("Se ha agregado la zona de estudio correctamente");
        	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }finally {
             rd.forward(request, response);
             out.close();
         }
    }
	
    public ServletZonaEstudio() {
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
