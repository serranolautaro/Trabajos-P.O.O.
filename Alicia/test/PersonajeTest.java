import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonajeTest {
	
	@Test
	void elPersonajePuedeEmbellecer() {
		Personaje p = new Personaje(76, 100);
		p.setNombre("Alicia");
		p.setSecretos(500);
		p.setUbicacion(-6);
		
		p.embellecer(4);
		assertEquals(80, p.getLocura());
	}

	@Test
	void elPersonajeEsLindo() {
		Personaje p = new Personaje(76, 100);
		p.setNombre("Alicia");
		p.setUbicacion(-6);
		p.setSecretos(510);
		
		assertEquals(true, p.esLinda());
	}
	
	@Test
	void elPersonajeNoEsLindoPorqueNoEstaEnMaravilla() {
		Personaje p = new Personaje(76, 100);
		p.setNombre("Alicia");
		p.setUbicacion(6);
		p.setSecretos(510);
		
		assertEquals(false, p.esLinda());
	}
	
	@Test
	void elPersonajeNoEsLindoPorqueNoTieneLocura() {
		Personaje p = new Personaje(74, 100);
		p.setNombre("Alicia");
		p.setUbicacion(-6);
		p.setSecretos(510);
		
		assertEquals(false, p.esLinda());
	}

	@Test
	void elPersonajeNoTieneNadaEntoncesClaramenteNoEsLindo() {
		Personaje p = new Personaje(74, 100);
		p.setNombre("Alicia");
		p.setUbicacion(6);
		p.setSecretos(510);
		
		assertEquals(false, p.esLinda());
	}
	
	@Test
	void elPersonajeEsNormal() {
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(505);
		
		assertEquals(true, p.siEsNormal());
	}
	
	@Test
	void elPersonajeNoEsNormalPorqueNoTieneSecretos() {
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(400);
		
		assertEquals(false, p.siEsNormal());
	}
	
	@Test
	void elPersonajeNoEsNormalPorqueNoTieneLocuraMenorA10() {
		Personaje p = new Personaje(15, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(400);
		
		assertEquals(false, p.siEsNormal());
	}
	
	@Test
	void elPersonajeNoEsNormalPorqueNoTieneNadaParaSerNormal() {
		Personaje p = new Personaje(16, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(400);
		
		assertEquals(false, p.siEsNormal());
	}
	
	@Test
	void eLPersonajeEstaEnMaravilla() {
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(-6);
		p.setSecretos(400);
		
		assertEquals(false, p.estaEnMaravilla());
	}
	
	@Test
	void eLPersonajeNoEstaEnMaravilla() {
		Personaje p = new Personaje(5, 100);
		p.setNombre("Dino");
		p.setUbicacion(6);
		p.setSecretos(400);
		
		assertEquals(true, p.estaEnMaravilla());
	}

}
