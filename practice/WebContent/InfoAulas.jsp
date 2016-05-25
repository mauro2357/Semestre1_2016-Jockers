<%@page import="Clases.Aula"%>
<%@page import="java.util.ArrayList"%>
<div id='infoaulas'>  
      			<select name='infoaulas'>
      			<%ArrayList<Aula> lista = (ArrayList<Aula>)request.getAttribute("infoaula");
                        for (Aula h : lista) {
                    %>                    
                    <option><%=("Bloque: "+h.getNombre_bloque())%></option>                                             
                    <%}
                    %>
                 </select>
                 <br>        			
      			</div>  
      			