import java.util.ArrayList;

public class Estudiante {
	
	ArrayList<Materia> materias = new ArrayList<Materia>();
	ArrayList<Materia> materiasqueaprobo = new ArrayList<Materia>();
	
	private String nombre;
	private boolean regularidad;
	private boolean trabajo;
	private int haceCuantoIngreso;
	
	public double puntajeTotal()
	{
		double puntaje = 0;
		for (Materia materia : materias) {
			puntaje += materia.puntajeTotal();
		}
		return puntaje;
	}
	
	public void asignarMateria(Materia m) 
	{
		if(regularidad == true)
		{
			materias.add(m);
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isRegularidad() {
		return regularidad;
	}
	public void setRegularidad(boolean regularidad) {
		this.regularidad = regularidad;
	}
	public boolean isTrabajo() {
		return trabajo;
	}
	public void setTrabajo(boolean trabajo) {
		this.trabajo = trabajo;
	}
	public int getHaceCuantoIngreso() {
		return haceCuantoIngreso;
	}

	public void setHaceCuantoIngreso(int haceCuantoIngreso) {
		this.haceCuantoIngreso = haceCuantoIngreso;
	}
	
	

}
