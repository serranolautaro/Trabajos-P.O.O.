import java.util.ArrayList;

public class Mundo {
	ArrayList<Aldea> aldeas = new ArrayList<Aldea>();
	
	public void agregarAldea(Aldea a)
	{
		aldeas.add(a);
	}
	
	public ArrayList<Aldea> aldeasMenosPosibilidadesIncendio()
	{
		ArrayList<Aldea> aldeasQueSafan = new ArrayList<Aldea>();
		for (Aldea a : aldeas) {
			if(a.bajaProbabilidadIncendio())
			{
				aldeasQueSafan.add(a);
			}
		}
		return aldeasQueSafan;
	}
	
	public boolean furiaActivada()
	{
		for (Aldea a : aldeas) {
			if(a.empatiaTotal() == 0)
			{
				return true;
			}
		}
		return false;
	}
	
	public int cantidadTotalMontadoresDelMundo()
	{
		int acumMontadores = 0;
		for (Aldea a : aldeas) {
			acumMontadores += a.cantidadMontadores();
		}
		return acumMontadores;
	}

}
