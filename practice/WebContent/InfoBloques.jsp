<%@page import="Clases.Bloque"%>
<%@page import="java.util.ArrayList"%>
<div id='infobloque'>  
      			<select name='infobloque'>
      			<%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("InfoBloques");
                        for (Bloque h : lista) {
                    %>                    
                    <option><%=("Aulas: "+h.getAulas())%></option>
                    <option><%=("Pisos: "+h.getPisos())%></option> 
                    <option><%=("Baños: "+h.getBanos())%></option> 
                    <option><%=("Laboratorios y Salas: "+h.getLaboratorios_salas())%></option>
                    <option><%=("Oficinas y Facultades: "+h.getOficinas_facultades())%></option>
                    <option><%=("Oratorios: "+h.getOratorios())%></option> 
                    <option><%=("Parqueadero: "+h.getParqueaderos())%></option> 
                    <option><%=("Zonas de Estudio: "+h.getZonas_estudio())%></option>                          
                    <%}
                    %>
                 </select>
                 <br>        			
      			</div>  
      			