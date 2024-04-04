import java.util.ArrayList;

public class Grupo {
	
	ArrayList<Simpatizantes> simpatizantes = new ArrayList<Simpatizantes>();
	
	
	public void agregarSimpatizantes(Simpatizantes s)
	{
		simpatizantes.add(s);
	}
	
	public boolean tomoNesquick()
	{
		/*Se dice que un hincha se tom� todo el
nesquick si tienen los niveles de consumo de nesquick por arriba del 90% del m�ximo.
Ese m�ximo de tolerancia al nesquick es propio de cada persona. */
		for (Simpatizantes s : simpatizantes) {
			double calculo = s.getMaximoTolerancia()*0.9;
			double noventaPorEncima = s.getNivelConsumoNesquick()+calculo;
			if(s.getNivelConsumoNesquick() >= noventaPorEncima)
			{
				return true;
			}
		}
		return false;
	}
	
	public Simpatizantes encontrarElMasBauzista()
	{
		Simpatizantes elMasBauzista = simpatizantes.get(0); 
		
		for (Simpatizantes s : simpatizantes) {
			if(s.getPreferenciaBauza() < elMasBauzista.getPreferenciaBauza())
			{
				elMasBauzista = s;
			}
		}
		return elMasBauzista;
	}
	
	public boolean parlanteDeLaB() {
		
		/*  Se debe saber si hay m�s de 50 hinchas con problemas vocales,
hecho que podr�a inducir al club a tener que alquilar parlantes como hizo en su
momento el Canalla. */
		
		int contadorHinchasVocales = 0;
		for (Simpatizantes s : simpatizantes) {
			
			if(s.isProblemasVocales() == true)
			{
				contadorHinchasVocales++;
			}
		}
		
		if(contadorHinchasVocales > 50)
		{
			return true;
			//jaja anda a alquilar los parlantes 
		}
		return false;
		
	}

}
