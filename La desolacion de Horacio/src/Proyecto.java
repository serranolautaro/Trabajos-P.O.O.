import java.util.ArrayList;

public class Proyecto {
	private String nombreProyecto;
	private int horasEstimadas;
	ArrayList<Desarrollador> desarrolladores = new ArrayList<Desarrollador>();
	
	public void agregarDesarrollador(Desarrollador d) 
	{
		desarrolladores.add(d);
	}
	
	public Desarrollador minutoPagani()
	{
		Desarrollador mayorPreferenciaRiquelme = desarrolladores.get(0);
		for(Desarrollador desarrollador : desarrolladores)
		{
			if(desarrollador.getPreferenciaRiquelme() < mayorPreferenciaRiquelme.getPreferenciaRiquelme())
			{
				mayorPreferenciaRiquelme = desarrollador;
			}
		}
		return mayorPreferenciaRiquelme;
	}
	
	public int contadorLesionesCronicas()
	{
		int contadorDesarrolladoresLesiones = 0;
		for(Desarrollador desLes : desarrolladores)
		{
			if(desLes.getLesionesCronicas() >= 1)
			{
				contadorDesarrolladoresLesiones++;
			}
		}
		return contadorDesarrolladoresLesiones;
	}
	
	// GETS & SETS

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	
}
