package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.AnuncioRepositorio;
import Clases.Anuncios;

/**
 * Servlet implementation class AnuncioControlador
 */
@WebServlet("/AnuncioControlador")
public class AnuncioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd= request.getRequestDispatcher("Anuncios.jsp");
        try{
        	int empresa_anuncio=Integer.parseInt(request.getParameter("empanuncio"));
        	String titulo_anuncio=request.getParameter("nomanuncio");
        	String descripcion_anuncio=request.getParameter("descanuncio");
        	
        	Anuncios nanuncio = new Anuncios(empresa_anuncio, titulo_anuncio, descripcion_anuncio);
        	AnuncioRepositorio.agregar(nanuncio);
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally{
        	rd.forward(request, response);	
        }        
	}   
	
    public AnuncioControlador() {
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
