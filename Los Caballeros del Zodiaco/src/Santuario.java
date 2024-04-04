import java.util.ArrayList;

public class Santuario {
	ArrayList<Caballero> c = new ArrayList<>();
	ArrayList<Constelacion> constelacion = new ArrayList<>();
	
	public void agregarCaballero(Caballero cc)
	{
		this.c.add(cc);
	}
	
	public void agregarConstelacion(Constelacion conste)
	{
		this.constelacion.add(conste);
	}
	
	public Caballero encontrarPosibleHades()
	{
		Caballero posibleHades = c.get(0);
		for (Caballero caballero : c) {
			if(caballero.getNivelmaldadencubierta() < posibleHades.getNivelmaldadencubierta())
			{
				posibleHades = caballero;
			}
		}
		return posibleHades;
	}
	
	public Constelacion constelacionMasCercanaAlSol()
	{
		Constelacion distanciasol = constelacion.get(0);
		for (Constelacion caballero : constelacion) {
			if(caballero.getDistanciasol() < 1000000000)
			{
				distanciasol = caballero;
			}
		}
		return distanciasol;
	}
	
	public double esCaballeroPrecoz()
	{
		int totalCaballerosPrecoces = 0;
		for(Caballero caballero : c)
		{
			if(caballero.getEdadcaballerismo() < 12)
			{
				totalCaballerosPrecoces++;
			}
		}
		double porcentaje = totalCaballerosPrecoces * 100 / c.size();
		return porcentaje;
	}
	
	public ArrayList<Caballero> caballeroMasPoderosos()
	{
		ArrayList<Caballero> masPoderoso = new ArrayList<>();
		for (Caballero caballero : c) {
			{			if(caballero.getEdadcaballerismo() < 12 && caballero.getConstelacion().getEnBandaceleste() == true)

				masPoderoso.add(caballero);
			}
		}
		return masPoderoso;
	}
	
}
