import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LuchadorTest {

	@Test
	void siEsChuckNorris() {
		Luchador luchador1 = new Luchador();
		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(800);
		luchador1.setJiu(true);
		
		assertEquals(true, luchador1.esChuckNorris(700));
	}
	
	@Test
	void siNoEsChuckNorrisPorqueNoSuperaElValorDado() {
		Luchador luchador1 = new Luchador();
		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(1);
		luchador1.setJiu(true);
		
		assertEquals(false, luchador1.esChuckNorris(700));
	}
	
	@Test
	void siNoEsChuckNorrisCompletamente() {
		Luchador luchador1 = new Luchador();
		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(100);
		luchador1.setJiu(true);
		
		assertEquals(false, luchador1.esChuckNorris(700));
	}
	
	@Test
	void siNoEsInsecto() {
		Luchador luchador1 = new Luchador();
		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(600);
		luchador1.setJiu(true);
		
		assertEquals(false, luchador1.esInsecto());
	}
	
	@Test
	void siEsInsecto() {
		Luchador luchador1 = new Luchador();
		luchador1.setNombre("Dino");
		luchador1.setFuerzaDeCombate(100);
		luchador1.setJiu(true);
		
		assertEquals(true, luchador1.esInsecto());
	}

}
