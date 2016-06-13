package Controlador;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import BD.ImagenesRepositorio;
import Clases.Imagen;
@WebServlet("/ImagenesAdministradorControlador")
	public  class ImagenesAdministradorControlador extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RequestDispatcher rd = request.getRequestDispatcher("GuardarImagenesAdministrador.jsp");
			try{
				String nombre=request.getParameter("nombre");
				String direccion = request.getParameter("direccion");
				FileInputStream direccion2 = new FileInputStream(direccion);
    
				Imagen nimagen=new Imagen ( new ImagenesRepositorio(), nombre, direccion2);
				nimagen.agregar();  
				}catch (NumberFormatException e) {
					request.setAttribute("estado", "error");
				}finally {
					rd.forward(request, response);
				}
	}	

	public ImagenesAdministradorControlador() {
		super();
		// TODO Auto-generated constructor stub
	}	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			responder(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			responder(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
	}
