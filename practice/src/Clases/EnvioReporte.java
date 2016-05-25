package Clases;

public class EnvioReporte {
	
	ICommand ordenEnvioSugerencia, ordenEnvioFallo;
	
	public EnvioReporte(ICommand ordenEnvioSugerencia, ICommand ordenEnvioFallo){
		this.ordenEnvioSugerencia = ordenEnvioSugerencia;
		this.ordenEnvioFallo = ordenEnvioFallo;		
	}
	public void envioSugerencia(){
		ordenEnvioSugerencia.execute();	
    	System.out.println("Enviada llego hasta aca");

	}
	public void envioFallo(){
		ordenEnvioFallo.execute();
	}
}
