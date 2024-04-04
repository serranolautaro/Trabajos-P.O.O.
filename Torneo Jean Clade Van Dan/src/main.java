import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Luchador luchador1 = new Luchador();
		Luchador luchador2 = new Luchador();
		Luchador luchador3 = new Luchador();

		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(100);
		luchador1.setJiu(true);

		luchador2.setNombre("Jaz");
		luchador2.setFuerzaDeCombate(0);
		luchador2.setJiu(false);

		luchador3.setNombre("Arthar");
		luchador3.setFuerzaDeCombate(200);
		luchador3.setJiu(true);

		Torneo Jiu = new Torneo();
		ArrayList<Luchador> l = new ArrayList<>();

		l.add(luchador1);
		l.add(luchador2);
		l.add(luchador3);
		Jiu.setA(l);

//if(Jiu.esChuckNorris() == true){
//	System.out.println("Hay alguien puede ganarle a JCV");
//	}
//else{
//	System.out.println("No hay nadie que pueda ganarle a JCV");
//}

		ArrayList<Luchador> loschuckNorris = Jiu.losChuckNorris(700);

		for (Luchador luchadores : loschuckNorris) {
			System.out.println(luchadores.getNombre());
		}

		if (Jiu.hayUnJiujitsu() == true) {
			System.out.println("Por lo menos una persona sabe Jiujitsu");
		} else
			System.out.println("No hay nadie que sepa Jiujitsu");

		System.out.println(Jiu.laCantidadDeJiuJitsus());

	}

}