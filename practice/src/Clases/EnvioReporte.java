package Clases;

public class EnvioReporte {
	
	ICommand ordenEnvioSugerencia, ordenEnvioFallo;
	
	public EnvioReporte(ICommand ordenEnvioSugerencia, ICommand ordenEnvioFallo){
		this.ordenEnvioSugerencia = ordenEnvioSugerencia;
		this.ordenEnvioFallo = ordenEnvioFallo;		
	}
	public void envioSugerencia() throws Exception{
		ordenEnvioSugerencia.execute();	
    	System.out.println("Enviada llego hasta aca");

	}
	public void envioFallo() throws Exception{
		ordenEnvioFallo.execute();
	}
}
