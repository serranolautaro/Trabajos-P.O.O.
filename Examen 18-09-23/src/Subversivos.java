
public class Subversivos extends Vikingo{
	
	public double nivelEmpatia()
	{
		setEmpatia(100);
		return getEmpatia();
	}
	
	public boolean puedeMontarDragon()
	{
		setCapacidadMontar(100);
		int calculo = 0;
		calculo = getEdad()*getPeso();
		
		if(calculo > 100)
		{
			calculo = 100;
		}
		if(calculo > 70)
		{
			return true;
		}
		return false;
	}

}
