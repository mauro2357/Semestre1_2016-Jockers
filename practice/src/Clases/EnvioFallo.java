package Clases;

public class EnvioFallo implements ICommand{
	Reporte mireporte;
	
	public EnvioFallo(Reporte reporte){
		this.mireporte = reporte;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mireporte.agregar();
	}

}
