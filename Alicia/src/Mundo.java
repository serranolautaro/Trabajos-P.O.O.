import java.util.ArrayList;

public class Mundo {
	ArrayList<Personaje> listapersonajes = new ArrayList<Personaje>();
	
	public void agregarPersonaje(Personaje p) {
		this.listapersonajes.add(p);
	}
	
	public boolean hayPersonaNormal()
	{
		for (Personaje personajes : listapersonajes) {
			if(personajes.siEsNormal() == true)
			{
			return true;
			}
		}
		return false;
	}
	
	public int encontrarLindos()
	{
		int c=0;
		for(Personaje personajes : listapersonajes) {
			if(personajes.esLinda() == true)
			{
				c++;
			}
		}
		return c;
	}
	
	public ArrayList<Personaje> cuantasPersonasMaravilla()
	{
		ArrayList<Personaje> maravillosas = new ArrayList<Personaje>();
		for(Personaje personajes : listapersonajes) {
			if(personajes.estaEnMaravilla() == true)
			{
				maravillosas.add(personajes);
			}
		}
		return maravillosas;
	}
	
	public String mayorCantidadLocura()
	{
			String nombre = "";
			int locuraalta = 0;
		for(Personaje personajes : listapersonajes) {
			if(personajes.getLocura()>locuraalta)
			{
				locuraalta=personajes.getLocura();
				nombre=personajes.getNombre();
			}
		}
		return nombre;
	}
	
	public boolean hayMasPersonajesLindos()
	{
		int personajeslindos = 0; int personajesnormales = 0;
		for(Personaje personajes : listapersonajes) 
		{
			if(personajes.esLinda() == true)
			{
				personajeslindos++;
			}
			else if(personajes.siEsNormal() == true)
			{
				personajesnormales++;
			}
		}
		if(personajeslindos>personajesnormales)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
