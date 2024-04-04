import java.util.ArrayList;

public class Ciclista {
	
	ArrayList<Recorrido> recorridos = new ArrayList<Recorrido>();

	private String nombre;
	private int velocidadPromedio;
	
	public void agregarRecorrido(Recorrido r)
	{
		recorridos.add(r);
	}
	
	public double puntajeTotal()
	{
		double total = 0;
		for (Recorrido recorriditos : recorridos) {
			total += recorriditos.getPuntaje();
		}
		return total;
	}
	
	public double tiempoTotal()
	{
		double total = 0;
		for (Recorrido recorriditos : recorridos) {
			total += recorriditos.tiempoEstimado();
		}
		return total;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVelocidadPromedio() {
		return velocidadPromedio;
	}
	public void setVelocidadPromedio(int velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}
	
	
}
