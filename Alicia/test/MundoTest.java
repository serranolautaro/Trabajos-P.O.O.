import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MundoTest {
	
	
	@Test
	void siHayPersonasNormales() {
		Mundo m = new Mundo();
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(550);
		
		m.agregarPersonaje(p);
		
			assertEquals(true, m.hayPersonaNormal());
	}
	
	@Test
	void siNoHayPersonasNormalesPorqueNoTieneSecretosSuficientes() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(400);
		
		m.agregarPersonaje(p);
		
			assertEquals(false, m.hayPersonaNormal());
	}
	
	@Test
	void siNoHayPersonasNormalesPorqueNoTieneLocuraMenor() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(15, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(550);
		
		m.agregarPersonaje(p);
		
			assertEquals(false, m.hayPersonaNormal());
	}
	
	@Test
	void siNoHayPersonasNormalesPorqueNoTieneNada() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(15, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		
			assertEquals(false, m.hayPersonaNormal());
	}
	
	@Test
	void siHayPersonajesLindos() {
		Mundo m = new Mundo();
		Personaje p = new Personaje(77, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		assertEquals(1, m.encontrarLindos());
	}
	
	@Test
	void siNoHayPersonajesLindosPorqueNoEstaEnMaravilla() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(77, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		
			assertEquals(0, m.encontrarLindos());
	}
	
	@Test
	void siNoHayPersonajesLindosPorqueNoTieneLocuraSuficiente() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(70, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		
		assertEquals(0, m.encontrarLindos());
	}
	
	@Test
	void siNoHayPersonajesLindosPorqueNoTieneNada() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(70, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		
		assertEquals(0, m.encontrarLindos());
	}
	
	@Test
	void siHayPersonasEnMaravilla() {
		
		Mundo m = new Mundo();
		Personaje dino = new Personaje(70, 100);
		dino.setUbicacion(-6);
		Personaje thiago = new Personaje(70, 100);
		thiago.setUbicacion(6);
		
		m.agregarPersonaje(thiago);
		m.agregarPersonaje(dino);
		
		ArrayList<Personaje> resEsperado = new ArrayList<Personaje>();
		resEsperado.add(dino);
		ArrayList<Personaje> resObtenido = m.cuantasPersonasMaravilla();
		assertEquals(resEsperado, resObtenido);
	}
	
	@Test
	void siNoHayPersonasEnMaravilla() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(70, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(480);
		
		m.agregarPersonaje(p);
		
			assertEquals(0, m.cuantasPersonasMaravilla());
	}
	
	@Test
	void siHayPersonasConMayorCantidadLocura() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(77, 100);
		Personaje p2 = new Personaje(69, 100);
		
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(480);
		
		p2.setNombre("Arthar");
		p2.setUbicacion(-5);
		p2.setSecretos(600);
		
		m.agregarPersonaje(p);
		m.agregarPersonaje(p2);
		
		assertEquals("Dino", m.mayorCantidadLocura());
	}
	
	@Test
	void siNoHayPersonasConMayorCantidadLocura() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(77, 100);
		Personaje p2 = new Personaje(69, 100);
		
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(480);
		
		p2.setNombre("Arthar");
		p2.setUbicacion(-5);
		p2.setSecretos(600);
		
		m.agregarPersonaje(p);
		m.agregarPersonaje(p2);
		
		assertEquals("Arthar", m.mayorCantidadLocura());
	}
	
	@Test
	void siHayMasPersonajesLindos() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(77, 100);
		Personaje p2 = new Personaje(79, 100);
		
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(480);
		
		p2.setNombre("Arthar");
		p2.setUbicacion(-5);
		p2.setSecretos(600);
		
		m.agregarPersonaje(p);
		m.agregarPersonaje(p2);
		
		assertEquals(true, m.hayMasPersonajesLindos());
	}
	
	@Test
	void siHayMasPersonajesNormales() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(9, 100);
		Personaje p2 = new Personaje(5, 100);
		
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(550);
		
		p2.setNombre("Arthar");
		p2.setUbicacion(-5);
		p2.setSecretos(600);
		
		m.agregarPersonaje(p);
		m.agregarPersonaje(p2);
		
		assertEquals(false, m.hayMasPersonajesLindos());
	}
	
	@Test
	void siNoHayNiMasNormalesNiMasLindos() {
		
		Mundo m = new Mundo();
		Personaje p = new Personaje(15, 100);
		Personaje p2 = new Personaje(20, 100);
		
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(499);
		
		p2.setNombre("Arthar");
		p2.setUbicacion(10);
		p2.setSecretos(299);
		
		m.agregarPersonaje(p);
		m.agregarPersonaje(p2);
		
		assertEquals(false, m.hayMasPersonajesLindos());
	}
}
