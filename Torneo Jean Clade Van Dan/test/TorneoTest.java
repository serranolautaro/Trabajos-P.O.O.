import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TorneoTest {

	@Test
	void siEsChuckNorriss() {
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(600);
		l1.setJiu(true);
	
		l1.setNombre("Pablito");
		
		assertEquals(true, l1.esChuckNorris(600));
	}
	
	@Test
	void siNoEsChuckNorriss() {
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(600);
		l1.setJiu(true);
	
		l1.setNombre("Pablito");
		
		assertEquals(false, l1.esChuckNorris(6000));
	}
	
	@Test
	void siHayInsectos() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(600);
		l1.setJiu(true);
	
		l1.setNombre("Kanye");
		l1.esInsecto();
		
		Luchador l2 = new Luchador();
		l2.setFuerzaDeCombate(400);
		l2.setJiu(false);
	
		l2.setNombre("Taylor");
		
		listaj.agregarLuchador(l1);
		listaj.agregarLuchador(l2);
		
		assertEquals(1, listaj.insectos());
	}
	
	@Test
	void siHayLosChuckNorris() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(900);
		l1.setJiu(true);

		l1.setNombre("Arthur");
		
		Luchador l2 = new Luchador();
		l2.setFuerzaDeCombate(800);
		l2.setJiu(true);
		l2.setNombre("Brian");

		Luchador l3 = new Luchador();
		l3.setNombre("Dino");
		l3.setFuerzaDeCombate(1);


		
		listaj.agregarLuchador(l1);
		listaj.agregarLuchador(l2);
		listaj.agregarLuchador(l3);
		
		ArrayList<Luchador> resObtenido = listaj.losChuckNorris(700);
		
		ArrayList<Luchador> resEsperado = new ArrayList<Luchador>();
		resEsperado.add(l1);
		resEsperado.add(l2);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	@Test
	void hayJiuJitSu() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(400);
		l1.setJiu(true);
		l1.setNombre("Arian");
		
		listaj.agregarLuchador(l1);
		
		assertEquals(true, listaj.hayUnJiujitsu());
	}
	
	@Test
	void noHayJiuJitSu() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(400);
		l1.setJiu(false);
	
		l1.setNombre("Arian");
		listaj.agregarLuchador(l1);
		
		
		assertEquals(false, listaj.hayUnJiujitsu());
	}
	
	@Test
	void determinaCuantosJiuJitSu() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(400);
		l1.setJiu(true);
		
		
		l1.setNombre("Maximo");
		
		Luchador l2 = new Luchador();
		l2.setFuerzaDeCombate(600);
		l2.setJiu(true);
		
		l2.setNombre("Juan");
		
		listaj.agregarLuchador(l1);
		listaj.agregarLuchador(l2);
		
		assertEquals(2, listaj.laCantidadDeJiuJitsus());
	}
	@Test
	void noHayJiuJitSuDirectamente() {
		Torneo listaj = new Torneo();
		Luchador l1 = new Luchador();
		l1.setFuerzaDeCombate(400);
		l1.setJiu(false);

		l1.setNombre("Maximo");
		
		Luchador l2 = new Luchador();
		l2.setFuerzaDeCombate(600);
		l2.setJiu(false);
		l2.setNombre("Juan");
		
		listaj.agregarLuchador(l1);
		listaj.agregarLuchador(l2);
		
		assertEquals(0, listaj.laCantidadDeJiuJitsus());
	}

}
