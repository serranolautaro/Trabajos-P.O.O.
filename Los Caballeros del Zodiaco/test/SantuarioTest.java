import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SantuarioTest {

	@Test
	void seEncontroPosibleHades() {
		
		Caballero caballero1 = new Caballero();
		Caballero caballero2 = new Caballero();
		Caballero caballero3 = new Caballero();
		
		Santuario grupo =  new Santuario();
		
		caballero1.setNombrecaballero("Tieryi");
		caballero1.setEdadcaballerismo(11);
		caballero1.setNivelmaldadencubierta(5);
		
		caballero2.setNombrecaballero("Arianosky");
		caballero2.setEdadcaballerismo(10);
		caballero2.setNivelmaldadencubierta(16);
		
		caballero3.setNombrecaballero("Johh Sébastian Segundo");
		caballero3.setEdadcaballerismo(17);
		caballero3.setNivelmaldadencubierta(30);
		
		grupo.agregarCaballero(caballero1);
		grupo.agregarCaballero(caballero2);
		grupo.agregarCaballero(caballero3);
		
		assertEquals(caballero1, grupo.encontrarPosibleHades());
	}
	
	@Test
	void lasConstelacionesMasCercanas() {
		
		Constelacion virgo = new Constelacion();
		Constelacion piscis = new Constelacion();
		Constelacion tauro = new Constelacion();
		
		virgo.setNombreconstelacion("Virgo");
		virgo.setDistanciasol(1100000000);
		virgo.setBandaceleste(false);
		
		piscis.setNombreconstelacion("Piscis");
		piscis.setDistanciasol(8000000);
		piscis.setBandaceleste(true);
		
		tauro.setNombreconstelacion("Tauro");
		tauro.setDistanciasol(1350000000);
		tauro.setBandaceleste(false);
		
		Santuario grupoconstelaciones =  new Santuario();
		
		grupoconstelaciones.agregarConstelacion(virgo);
		grupoconstelaciones.agregarConstelacion(piscis);
		grupoconstelaciones.agregarConstelacion(tauro);
		
		assertEquals(piscis, grupoconstelaciones.constelacionMasCercanaAlSol());
	}
	
	@Test
	void porcentajeCaballeroPrecoces() {
		
		Caballero caballero1 = new Caballero();
		Caballero caballero2 = new Caballero();
		Caballero caballero3 = new Caballero();
		
		Santuario grupo =  new Santuario();
		
		caballero1.setNombrecaballero("Tieryi");
		caballero1.setEdadcaballerismo(11);
		caballero1.setNivelmaldadencubierta(5);
		
		caballero2.setNombrecaballero("Arianosky");
		caballero2.setEdadcaballerismo(10);
		caballero2.setNivelmaldadencubierta(16);
		
		caballero3.setNombrecaballero("Johh Sébastian Segundo");
		caballero3.setEdadcaballerismo(17);
		caballero3.setNivelmaldadencubierta(30);
		
		grupo.agregarCaballero(caballero1);
		grupo.agregarCaballero(caballero2);
		grupo.agregarCaballero(caballero3);
		
		assertEquals(66, grupo.esCaballeroPrecoz()); //El porcentaje es 66.
	}
	
	@Test
	void siHayCaballeroMasPoderoso() {
		
		Constelacion virgo = new Constelacion();
		Constelacion piscis = new Constelacion();
		Constelacion tauro = new Constelacion();
		
		virgo.setNombreconstelacion("Virgo");
		virgo.setDistanciasol(1100000000);
		virgo.setBandaceleste(false);
		
		piscis.setNombreconstelacion("Piscis");
		piscis.setDistanciasol(8000000);
		piscis.setBandaceleste(true);
		
		tauro.setNombreconstelacion("Virgo");
		tauro.setDistanciasol(1350000000);
		tauro.setBandaceleste(false);
		
		Caballero caballero1 = new Caballero();
		Caballero caballero2 = new Caballero();
		Caballero caballero3 = new Caballero();
		
		Santuario grupo =  new Santuario();
		
		caballero1.setNombrecaballero("Tieryi");
		caballero1.setEdadcaballerismo(11);
		caballero1.setNivelmaldadencubierta(5);
		caballero1.setConstelacion(virgo);
		
		caballero2.setNombrecaballero("Arianosky");
		caballero2.setEdadcaballerismo(10);
		caballero2.setNivelmaldadencubierta(16);
		caballero2.setConstelacion(piscis);
		
		caballero3.setNombrecaballero("Johh Sébastian Segundo");
		caballero3.setEdadcaballerismo(17);
		caballero3.setNivelmaldadencubierta(30);
		caballero3.setConstelacion(tauro);

		grupo.agregarCaballero(caballero1);
		grupo.agregarCaballero(caballero2);
		grupo.agregarCaballero(caballero3);
		
		ArrayList<Caballero>resEsperado = new ArrayList<Caballero>();
		resEsperado.add(caballero2);
		
		ArrayList<Caballero>resObtenido = grupo.caballeroMasPoderosos();
		
		assertEquals(resEsperado, resObtenido);
	}

}
