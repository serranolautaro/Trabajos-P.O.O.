import java.util.ArrayList;

public class Picnic {
	
	ArrayList<Carpincho> carpinchos = new ArrayList<Carpincho>();
	
	public Carpincho elMasMatero()
	{
		Carpincho mateoli = carpinchos.get(0);
		for (Carpincho carpincho : carpinchos) {
			if(carpincho.getAgradoMate() < mateoli.getAgradoMate())
			{
				 mateoli = carpincho;
			}
		}
		return mateoli;
	}
	
	public ArrayList<Carpincho> mateolisTodoElDia()
	{
		ArrayList<Carpincho> losremateros = new ArrayList<Carpincho>();
		for (Carpincho carpincho : carpinchos) {
			if(carpincho.getCanasta().tomanMateTodoElDia())
			{
				losremateros.add(carpincho);
			}
		}
		return losremateros;
	}
	
	public boolean noDescansanLaVista()
	{
		int c = 0;
		for (Carpincho carpincho : carpinchos) {
			c++;
		}
		if(c*100/mateolisTodoElDia().size()>= c*0.7)
		{
			return true;
		}
		return false;
	}
	
	public int totalDeCache() {
		int s = 0;
		for (Carpincho carpincho : carpinchos) {
			s += carpincho.cache();
		}
		return s;
	}
	
	public boolean enLaBristol() {
		if(totalDeCache()/carpinchos.size() > totalDeCache()*0.80)
		{
			return true;
		}
		return false;
	}

}
