package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaBloques;
import BD.ConsultaFacultades;
import Clases.Materia;
import Clases.MateriaHorarioA;
import Clases.MateriaHorarioAA;
import Clases.MateriaHorarioAAA;

/**
 * Servlet implementation class MateriasControlador
 */
@WebServlet("/MateriasControlador")
public class MateriasControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher rd = request.getRequestDispatcher("Materia.jsp");   
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();
        try{
        	String materia_nombre=request.getParameter("matnombre");
        	int materia_creditos=Integer.parseInt(request.getParameter("matcreditos"));
        	String aula_nombre=request.getParameter("mataula");        	
        	String facultad_nombre=request.getParameter("facumat");
        	String horario_nombre=request.getParameter("horario");
        	String nombre_bloque=request.getParameter("matbloque");
        	
        	if (request.getParameter("horario").equals("A")){
            	Materia nMateriaHorarioA= new MateriaHorarioA(materia_nombre, nombre_bloque, materia_creditos, aula_nombre, facultad_nombre, horario_nombre);
            	if (nMateriaHorarioA.validar() && nMateriaHorarioA.agregarbd()){
            		out.print("<p style=\"color:blue\">La Materia se ha agregado correctamente</p>");            		
            	}else{
            		out.println("<html><body onload=\"alert('Hello World')\"></body></html>");            		
        		}
        	}     		
        	if (request.getParameter("horario").equals("AA")){
            	Materia nMateriaHorarioAA= new MateriaHorarioAA(materia_nombre, nombre_bloque, materia_creditos, aula_nombre, facultad_nombre, horario_nombre);
            	if (nMateriaHorarioAA.validar() && nMateriaHorarioAA.agregarbd()){
            		out.print("<p style=\"color:blue\">La Materia se ha agregado correctamente</p>");
            	}else{
        		out.print("<p style=\"color:red\">No se puede agregar. Solo se permiten asignaturas de Ingenieria</p>");    
        		}
        	}
        	if (request.getParameter("horario").equals("AAA")){
            	Materia nMateriaHorarioAAA= new MateriaHorarioAAA(materia_nombre, nombre_bloque, materia_creditos, aula_nombre, facultad_nombre, horario_nombre);
            	if (nMateriaHorarioAAA.validar() && nMateriaHorarioAAA.agregarbd()){
            		out.print("<p style=\"color:blue\">La Materia se ha agregado correctamente</p>");            		
	            }else{
        		out.print("<p style=\"color:red\">No se puede agregar. Solo se permiten materias con numero de creditos menor a 7</p>");    
        		}
        	}
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {       	
        	request.setAttribute("facultad", ConsultaFacultades.getFacultades());
        	request.setAttribute("bloques", ConsultaBloques.getBloques());
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
        try {
        	request.setAttribute("facultad", ConsultaFacultades.getFacultades());
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
