/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-04-22 19:48:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Clases.Bloque;
import Clases.HorarioO;

public final class Oficinas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("Clases.HorarioO");
    _jspx_imports_classes.add("Clases.Bloque");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Aplicacion UCO-MAPS en construccion</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo1.css\" media=\"screen\"/>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Registre oficinas en la aplicacion</h1>\r\n");
      out.write("\t<form action=\"OficinasControlador\" method=\"post\">\r\n");
      out.write("\t<p>Ingrese el nombre de la oficina: <input type=\"text\" name=\"ofinombre\" value=\"");
      out.print(request.getParameter("ofinombre")!=null?request.getParameter("ofinombre"):"");
      out.write("\"  />\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>Selecciones el Bloque: <select name=\"ofibloque\"> \r\n");
      out.write("                    ");
ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("bloques");
                        for (Bloque h : lista) {
                    
      out.write("                    \r\n");
      out.write("                    <option value=\"");
      out.print(h.getNombre_bloque());
      out.write('"');
      out.write('>');
      out.print((h.getNombre_bloque()));
      out.write("</option>                    \r\n");
      out.write("                    ");
}
                    
      out.write("\r\n");
      out.write("                </select><br>\t\t\r\n");
      out.write("<p>Ingrese el telefono de la oficina: <input type=\"text\" name=\"ofitel\" value=\"");
      out.print(request.getParameter("ofitel")!=null?request.getParameter("ofitel"):"");
      out.write("\"  />\r\n");
      out.write("<br>\r\n");
      out.write("<br>Seleccione el horario de la oficina:<select name=\"horaofi\"> \r\n");
      out.write("                    ");
ArrayList<HorarioO> listaHorarios = (ArrayList<HorarioO>)request.getAttribute("Horario");
                        for (HorarioO h : listaHorarios) {
                    
      out.write("                    \r\n");
      out.write("                    <option value=\"");
      out.print(h.getHorario_nombre());
      out.write('"');
      out.write('>');
      out.print((h.getHorario_nombre()+", Desde"+ h.getHorario_inicio()+", Hasta"+ h.getHorario_fin()));
      out.write("</option>                    \r\n");
      out.write("                    ");
}
                    
      out.write("\r\n");
      out.write("                </select><br>\r\n");
      out.write("\t<p>Ingrese una breve descripcion de la oficina: <input type=\"text\" name=\"ofidesc\" value=\"");
      out.print(request.getParameter("ofidesc")!=null?request.getParameter("ofidesc"):"");
      out.write("\"  />\r\n");
      out.write("\t<p><input type=\"submit\" name=\"Ingresar\" value=\"Ingresar Oficina\"/>\t\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"MenuPrincipal.html\">Regrese al Menu Principal</a>\r\n");
request.getAttribute("estado"); 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
