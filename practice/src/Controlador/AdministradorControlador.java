package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BD.AdministradorRepositorio;

/**
 * Servlet implementation class AdministradorControlador
 */
@WebServlet("/AdministradorControlador")
public class AdministradorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n =request.getParameter("adminuser");    
        String p =request.getParameter("adminpass");        
        
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("name", n );  
  		
		if(AdministradorRepositorio.validate(n, p)){    
            RequestDispatcher rd=request.getRequestDispatcher("MenuPrincipal.html");    
            rd.forward(request,response);
            out.println("Entro al if");
        }    
        else{    
            out.print("<p style=\"color:red\">Usuario y/o Contrase�a Invalidos</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("Administrador.jsp");    
            rd.include(request,response);    
        }   
        out.close();    
    } 
}


	