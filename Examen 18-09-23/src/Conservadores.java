
public class Conservadores extends Vikingo {
	
	public double nivelEmpatia()
	{
		setEmpatia(0);
		return getEmpatia();
	}
	
	public boolean puedeMontarDragon()
	{
		setCapacidadMontar(100);
		int calculo = 0;
		int limite = 100;
		calculo = getCapacidadMontar()-getEdad()-getPeso();
		if(calculo > 70 && calculo <= limite)
		{
			return true;
		}
		return false;
	}
}
