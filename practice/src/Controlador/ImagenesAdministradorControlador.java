package Controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import BD.ImagenesRepositorio;
import Clases.Imagen;

@MultipartConfig(fileSizeThreshold=1024*1024*2,maxFileSize=1024*1024*10,maxRequestSize=1024*1024*50)
@WebServlet("/ImagenesAdministradorControlador")
	public  class ImagenesAdministradorControlador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("resource")
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		String nombre= request.getParameter("nombre");
		Part dir= request.getPart("direccion");
		String foto="";
		String direccion="C:/Imagenes/ImagenesAdministrador";
		File archivo= new File(direccion);
		archivo.mkdir();
		String nom_archivo= getFileName(dir);
		OutputStream out_1= null;
		InputStream contenido= null;
		out_1=new FileOutputStream(new File(direccion+ File.separator+nom_archivo));
		contenido=dir.getInputStream();		
		int read=0;
		final byte[] bytes=new byte[1024];
		while((read= contenido.read(bytes))!= -1){
			out_1.write(bytes, 0, read);
			foto=direccion+'/'+nom_archivo;			
		}
		Imagen nimagen= new Imagen(new ImagenesRepositorio(),nombre,foto);
		nimagen.agregar();
	}
	private String getFileName(final Part part) {
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf("C:") +19).trim().replace("\"", "");
	        }
	    }
	    return "";
	}
	public ImagenesAdministradorControlador() {
		super();
		// TODO Auto-generated constructor stub
	}	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			responder(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}