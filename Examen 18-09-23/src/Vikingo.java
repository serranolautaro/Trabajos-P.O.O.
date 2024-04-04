
public abstract class Vikingo {
	private int edad;
	private int peso;
	private double empatia;
	private int capacidadMontar;
	
	public abstract double nivelEmpatia();
	
	public abstract boolean puedeMontarDragon();
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getEmpatia() {
		return empatia;
	}
	public void setEmpatia(double empatia) {
		this.empatia = empatia;
	}
	public int getCapacidadMontar() {
		return capacidadMontar;
	}
	public void setCapacidadMontar(int capacidadMontar) {
		this.capacidadMontar = capacidadMontar;
	}
	
	
}
