package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaBloques;
import BD.ConsultaFacultades;
import BD.ConsultaHorarios;
import BD.MateriaRepositorio;
import Clases.MateriaAgregar;

/**
 * Servlet implementation class MateriasControlador
 */
@WebServlet("/MateriasControlador")
public class MateriasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("Materia.jsp");
        try{
        	String materia_nombre=request.getParameter("matnombre");
        	int materia_creditos=Integer.parseInt(request.getParameter("matcreditos"));
        	String aula_nombre=request.getParameter("mataula");        	
        	String facultad_nombre=request.getParameter("matfacultad");
        	String horario_nombre=request.getParameter("mathorario");
        	String nombre_bloque=request.getParameter("matbloque");
        	
        	MateriaAgregar nmateria= new MateriaAgregar(materia_nombre, materia_creditos, nombre_bloque, aula_nombre, facultad_nombre, horario_nombre);
        	MateriaRepositorio.agregar(nmateria);        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
        	 request.setAttribute("bloques", ConsultaBloques.getBloques());
        	 request.setAttribute("facultad", ConsultaFacultades.getFacultades());
             request.setAttribute("horario", ConsultaHorarios.getHorario());
             rd.forward(request, response);            
         }
    }     

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MateriasControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Materia.jsp");
        request.setAttribute("facultad", ConsultaFacultades.getFacultades());
        request.setAttribute("horario", ConsultaHorarios.getHorario());
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