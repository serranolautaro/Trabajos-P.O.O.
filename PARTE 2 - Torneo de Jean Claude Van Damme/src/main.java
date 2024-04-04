
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Luchador> l = new ArrayList<>();
		Torneo j = new Torneo();
		Luchador ll = new Luchador();
		Luchador luchador1 = new Luchador();
		Luchador luchador2 = new Luchador();
		Luchador luchador3 = new Luchador();
		
		luchador1.setNombre("Dino");
		luchador1.setFuerzacombate(600);
		luchador1.setPracticaJitSu(false);
		
		luchador2.setNombre("Jaz");
		luchador2.setFuerzacombate(600);
		luchador2.setPracticaJitSu(true);
		
		luchador3.setNombre("Arthar");
		luchador3.setFuerzacombate(400);
		luchador3.setPracticaJitSu(false);
		
		
		l.add(luchador1);
		l.add(luchador2);
		l.add(luchador3);
		
		System.out.println(ll.esChuckNorris(700));
		System.out.println(ll.insectos());
		
		System.out.println(j.losChuckNorris());
		
		if(j.hayUnJiuJitsu() == true)
		{
			System.out.println("Hay por lo menos una persona que practica JiuJitsu");
		}
		else
			System.out.println("No hay nadie que practique JiuJitsu");
		
		System.out.println("Hay " + j.laCantidadDeJiuJitsus() + " que practican JiuJitsu");
	}

}
