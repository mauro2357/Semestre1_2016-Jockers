<%@page import="Clases.Bloque"%>
<%@page import="java.util.ArrayList"%>
<div id='infobloque'>  
				<br>
      			Informacion: <select name='infobloque'>
      			<%ArrayList<Bloque> lista = (ArrayList<Bloque>)request.getAttribute("InfoBloques");
                        for (Bloque l : lista) {
                    %>                    
                    <option><%=("Aulas: "+l.getAulas())%></option>
                    <option><%=("Pisos: "+l.getPisos())%></option> 
                    <option><%=("Baños: "+l.getBanos())%></option> 
                    <option><%=("Laboratorios y Salas: "+l.getLaboratorios_salas())%></option>
                    <option><%=("Oficinas y Facultades: "+l.getOficinas_facultades())%></option>
                    <option><%=("Oratorios: "+l.getOratorios())%></option> 
                    <option><%=("Parqueadero: "+l.getParqueaderos())%></option> 
                    <option><%=("Zonas de Estudio: "+l.getZonas_estudio())%></option>                          
                    <%}
                    %>
                 </select>
                 <br>        			
      			</div>  
      			