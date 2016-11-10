package Clases;

import java.util.ArrayList;

public class PuntoReferencia {
	private String pun_nombre;
	private double pun_latitud;
	private double pun_longitud;
	private String ruta;
	
	public String getPun_nombre() {
		return pun_nombre;
	}
	public void setPun_nombre(String pun_nombre) {
		this.pun_nombre = pun_nombre;
	}
	public double getPun_latitud() {
		return pun_latitud;
	}
	public void setPun_latitud(double pun_latitud) {
		this.pun_latitud = pun_latitud;
	}
	public double getPun_longitud() {
		return pun_longitud;
	}
	public void setPun_longitud(double pun_longitud) {
		this.pun_longitud = pun_longitud;
	}
	public PuntoReferencia(String pun_nombre, String ruta, double pun_latitud,
			double pun_longitud) {
		super();
		this.pun_nombre = pun_nombre;
		this.ruta = ruta;
		this.pun_latitud = pun_latitud;
		this.pun_longitud = pun_longitud;		
	}	
	 public String convertirPublicacionesAJavaScrip(ArrayList<PuntoReferencia> ListaPuntos){
	        String MatrizScrip="[";
	        for(int i =0; i<ListaPuntos.size(); i++){           
	           MatrizScrip=MatrizScrip+"[\""+ListaPuntos.get(i).getPun_nombre()+"\", ";
	           MatrizScrip=MatrizScrip+"\""+ListaPuntos.get(i).getPun_latitud()+"\", ";
	           MatrizScrip=MatrizScrip+"\""+ListaPuntos.get(i).getPun_longitud()+"\"],";           
	        }
	        MatrizScrip=MatrizScrip+"]";
	        System.out.println(MatrizScrip);
	        return MatrizScrip;
	    }
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
