import java.util.ArrayList;

public class Torneo {
	ArrayList<Luchador> jiu = new ArrayList<>();

	public void agregarLuchador(Luchador a)
	{
		this.jiu.add(a);
	}
	
	public ArrayList<Luchador> losChuckNorris()
	{
		ArrayList<Luchador> losChuckNorris = new ArrayList<>();
		for(Luchador a : jiu) {
			if(a.esChuckNorris(700) == true){
				losChuckNorris.add(a);
			}
		}
		return losChuckNorris;
	}
	
	public boolean hayUnJiuJitsu()
	{
		for(Luchador a : jiu) {
			if(a.isPracticaJitSu()){
				return true;
			}
		}
		return false;
	}
	
	public int laCantidadDeJiuJitsus()
	{
		int c = 0;
		for(Luchador a : jiu)
		{
			if(a.isPracticaJitSu()) {
				c++;
			}
		}
		return c;
	}

}
