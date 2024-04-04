
public class Reformista extends Vikingo{
	
	private double tibieza;

	public double nivelEmpatia()
	{
		return tibieza/2;
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
	
	public double getTibieza() {
		return tibieza;
	}

	public void setTibieza(double tibieza) {
		this.tibieza = tibieza;
	}
	
	

}
