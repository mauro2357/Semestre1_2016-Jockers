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
 
import Clases.ImagenesSugeridas;

@WebServlet("/ImagenesUsuarioControlador")
@MultipartConfig(fileSizeThreshold=1024*1024*2,maxFileSize=1024*1024*10,maxRequestSize=1024*1024*50)
public class ImagenesUsuarioControlador extends HttpServlet{
	private static final long serialVersionUID = 1L;	
	@SuppressWarnings("resource")
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		String user= request.getParameter("usuario");
		String correo= request.getParameter("correo");
		String nombre= request.getParameter("nombre");
		Part dir= request.getPart("direccion");
		String foto="";
		String direccion="C:/Imagenes/ImagenesUsuario";
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
		ImagenesSugeridas nimagen= new ImagenesSugeridas(user,correo,nombre,foto);
		nimagen.agregar();		
	}
	private String getFileName(final Part part) {
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf("C:") + 19).trim().replace("\"", "");
	        }
	    }
	    return "";
	}
	public ImagenesUsuarioControlador() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			responder(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}