import java.util.ArrayList;

public class Carrera {
	
	ArrayList<Ciclista> ciclistas = new ArrayList<Ciclista>();
	
	public void agregarCiclistas(Ciclista c)
	{
		ciclistas.add(c);
	}
	
	public ArrayList<Ciclista> superoLos30()
	{
		ArrayList<Ciclista> ciclistasMasDe30 = new ArrayList<Ciclista>();
		for (Ciclista ciclista : ciclistas) {
			if(ciclista.puntajeTotal() < 30)
			{
				ciclistasMasDe30.add(ciclista);
			}
		}
		return ciclistasMasDe30;
	}
	
	public ArrayList<Ciclista> ciclistaConMasTiempo()
	{
		Ciclista a = ciclistas.get(0);
		for (Ciclista ciclista : ciclistas) {
			if(ciclista.tiempoTotal() < a.tiempoTotal())
			{
				a = ciclista;
			}
		}
		ciclistaConMasTiempo().add(a);
		return ciclistaConMasTiempo();
		
	}
	
	public boolean menosDe2Horas()
	{
		for (Ciclista ciclista : ciclistas) {
			if(ciclista.tiempoTotal()/ciclista.getVelocidadPromedio() < 2)
			{
				return true;
			}
		}
		return false;
	}

}
