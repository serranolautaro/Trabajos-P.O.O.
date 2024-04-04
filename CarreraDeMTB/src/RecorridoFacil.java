
public class RecorridoFacil extends Recorrido {
	
	public double tiempoEstimado() {
		return getDistancia()/30;
	}
	
	public double puntaje()
	{
		return getPuntaje()+1;
	}

}
