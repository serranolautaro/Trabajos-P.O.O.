
public class Materia {
	
	private String nombreMateria;
	private int aņoCarrera;
	private double puntaje;
	private double horas;
	private boolean recursada;
	
	public double puntajeTotal()
	{
		return puntaje;
	}
	
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public int getAņoCarrera() {
		return aņoCarrera;
	}
	public void setAņoCarrera(int aņoCarrera) {
		this.aņoCarrera = aņoCarrera;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public boolean isRecursada() {
		return recursada;
	}
	public void setRecursada(boolean recursada) {
		this.recursada = recursada;
	}



}
