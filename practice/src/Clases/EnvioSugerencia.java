package Clases;

public class EnvioSugerencia implements ICommand{
	Reporte mireporte;
	
	public EnvioSugerencia(Reporte reporte){
		this.mireporte = reporte;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mireporte.agregar();
    	System.out.println("Enviada llego hasta aca");

	}

}
