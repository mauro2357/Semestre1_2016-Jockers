<%@page import="Clases.Aula"%>
<%@page import="java.util.ArrayList"%>
<div id='infoaulas'>  
      			<br>
      			Informacion: <select name='infoaulas'>
      			<%ArrayList<Aula> lista = (ArrayList<Aula>)request.getAttribute("infoaula");
                        for (Aula h : lista) {
                    %>                    
                    <option><%=("Bloque: "+h.getNombre_bloque())%></option>
                    <option><%=("Capacidad: "+h.getCapacidad())%></option>
                    <option><%=("VideoBeam: "+h.getVideobeam())%></option>
                    <%}
                    %>
                 </select>
                 <br>        			
      			</div>  
      			