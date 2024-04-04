import java.util.ArrayList;

public class Carrera {
	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private int parametro = 10;
	
	public void añadirEstudiantes(Estudiante e)
	{
		estudiantes.add(e);
	}
	
	public ArrayList<Estudiante> estudiantesMayorParametro()
	{
		ArrayList<Estudiante> estudiantesCracks = new ArrayList<Estudiante>();
		for (Estudiante estudiante : estudiantes) {
			if(estudiante.puntajeTotal() > parametro)
			{
				estudiantesCracks.add(estudiante);
			}
		}
		return estudiantesCracks;
	}
	
	public int estudiantesMasViejitos()
	{
		int cont = 0;
		for (Estudiante estudiante : estudiantes) {
			if(estudiante.isTrabajo() && estudiante.getHaceCuantoIngreso() > 10)
			{
				cont++;
			}
		}
		return cont;
	}

	public int getParametro() {
		return parametro;
	}

	public void setParametro(int parametro) {
		this.parametro = parametro;
	}
	
	
	

}
