
public class RecorridoIntermedio extends Recorrido {
	
	private boolean pendienteAscendente;
	
	public double tiempoEstimado() {
		if(pendienteAscendente == true)
		{
			return getDistancia()/25*1.5;
		}
		else
		{
			return getDistancia()/25*0.5;
		}
	}
	
	public double puntaje()
	{
		if(pendienteAscendente == true)
		{
			return getPuntaje()+1+1.5;
		}
		else
		{
			return getPuntaje()+1+0.5;
		}
	}
	
	public boolean isPendienteAscendente() {
		return pendienteAscendente;
	}

	public void setPendienteAscendente(boolean pendienteAscendente) {
		this.pendienteAscendente = pendienteAscendente;
	}


}
