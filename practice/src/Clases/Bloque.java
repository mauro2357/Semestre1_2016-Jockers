package Clases;

import BD.IBloquesRepositorio;

public class Bloque extends Lugar {	
	
	private IBloquesRepositorio bloquesRepositorio;
	
	public Bloque(IBloquesRepositorio bloquesRepositorio) {
		this.bloquesRepositorio=bloquesRepositorio;
	}	
	private int aulas;
	private int pisos;
	private int banos;
	private int laboratorios_salas;
	private int oficinas_facultades;
	private String oratorios;
	private String parqueaderos;
	private String zonas_estudio;
		
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public int getBanos() {
		return banos;
	}
	public void setBanos(int banos) {
		this.banos = banos;
	}
	public int getLaboratorios_salas() {
		return laboratorios_salas;
	}
	public void setLaboratorios_salas(int laboratorios_salas) {
		this.laboratorios_salas = laboratorios_salas;
	}
	public int getOficinas_facultades() {
		return oficinas_facultades;
	}
	public void setOficinas_facultades(int oficinas_facultades) {
		this.oficinas_facultades = oficinas_facultades;
	}
	public String getOratorios() {
		return oratorios;
	}
	public void setOratorios(String oratorios) {
		this.oratorios = oratorios;
	}
	public String getParqueaderos() {
		return parqueaderos;
	}
	public void setParqueaderos(String parqueaderos) {
		this.parqueaderos = parqueaderos;
	}
	public String getZonas_estudio() {
		return zonas_estudio;
	}
	public void setZonas_estudio(String zonas_estudio) {
		this.zonas_estudio = zonas_estudio;
	}
	public Bloque(IBloquesRepositorio bloquesRepositorio, String nombre_bloque,int aulas,int pisos,int banos,int laboratorios_salas,int oficinas_facultades,String oratorios,String parqueaderos,String zonas_estudio){
			super(nombre_bloque);
			this.bloquesRepositorio=bloquesRepositorio;
			this.aulas=aulas;
			this.pisos=pisos;
			this.banos=banos;
			this.laboratorios_salas=laboratorios_salas;
			this.oficinas_facultades=oficinas_facultades;
			this.oratorios=oratorios;
			this.parqueaderos=parqueaderos;
			this.zonas_estudio=zonas_estudio;
	}
	
	@Override
	public void agregar() throws Exception {
		bloquesRepositorio.agregar(this);
		
	}
	public void actualizar() throws Exception{
		bloquesRepositorio.agregar(this);
	}
}
	
	






