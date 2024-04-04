import java.util.ArrayList;

public class Aldea {
	
	ArrayList<Vikingo> vikingos = new ArrayList<Vikingo>();
	
	public void agregarVikingo(Vikingo v)
	{
		vikingos.add(v);
	}
	
	public double empatiaTotal()
	{
		int acumEmpatia = 0;
		for (Vikingo v : vikingos) {
			acumEmpatia += v.nivelEmpatia();
		}
		return acumEmpatia;
	}
	
	public int cantidadMontadores()
	{
		int cont = 0;
		for (Vikingo v : vikingos) {
			if(v.puedeMontarDragon())
			{
				cont++;
			}
		}
		return cont;
	}
	
	public boolean bajaProbabilidadIncendio()
	{
		if(empatiaTotal() > empatiaTotal()*0.5)
		{
			return true;
		}
		return false;
	}

}
