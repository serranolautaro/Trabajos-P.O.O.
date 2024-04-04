
public class RecorridoAvanzada extends Recorrido {
	
	private int cantidadObstaculos;

	public double tiempoEstimado()
	{
		return getDistancia()/20*cantidadObstaculos;
	}
	
	public double puntaje()
	{
		return getPuntaje()+getDistancia()*0.5;
	}
	
	public int getCantidadObstaculos() {
		return cantidadObstaculos;
	}

	public void setCantidadObstaculos(int cantidadObstaculos) {
		this.cantidadObstaculos = cantidadObstaculos;
	}
	
	
	
}
