import java.util.ArrayList;

public class Censo {
	
	ArrayList<Grupo> censos = new ArrayList<Grupo>();
	
	
	public void agregarGrupo(Grupo g)
	{
		censos.add(g);
	}
	
	public ArrayList<Grupo> youDrankAllTheNesquick()
	{
		/* Se debe encontrar los grupos en los que todos sus
		integrantes se tomaron todo el nesquick . Se dice que un hincha se tomó todo el
		nesquick si tienen los niveles de consumo de nesquick por arriba del 90% del máximo.
		Ese máximo de tolerancia al nesquick es propio de cada persona. */
		
		ArrayList<Grupo> seTomaronTodaLaNesquick = new ArrayList<Grupo>();
		
		int contadorHinchasQueTomaron = 0;
		for (Grupo g : censos) {
			if(g.tomoNesquick() == true)
			{
				contadorHinchasQueTomaron++;
			}
		}
		for (Grupo grupardo : censos) {
			if(contadorHinchasQueTomaron == censos.size())
			{
				seTomaronTodaLaNesquick.add(grupardo);
			}
		}
		return seTomaronTodaLaNesquick;
	}

}
