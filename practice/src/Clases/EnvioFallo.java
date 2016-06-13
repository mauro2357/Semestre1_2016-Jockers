package Clases;

public class EnvioFallo implements ICommand{
	Reporte mireporte;
	
	public EnvioFallo(Reporte reporte){
		this.mireporte = reporte;
	}

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		mireporte.agregar();
	}

}
