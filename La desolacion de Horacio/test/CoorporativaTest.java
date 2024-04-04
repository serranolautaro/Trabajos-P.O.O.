import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoorporativaTest {

	@Test
	void siElProyectoQueMasGusta() {
		Desarrollador dino = new Desarrollador();
		Desarrollador jaz = new Desarrollador();
		Desarrollador gonzalo = new Desarrollador();
		Desarrollador artharpual = new Desarrollador();
		Desarrollador tieryi = new Desarrollador();
		
		Proyecto proyecto1 = new Proyecto();
		proyecto1.agregarDesarrollador(dino);
		proyecto1.agregarDesarrollador(tieryi);
		
		Proyecto proyecto2 = new Proyecto();
		proyecto2.agregarDesarrollador(artharpual);
		proyecto2.agregarDesarrollador(jaz);
		proyecto2.agregarDesarrollador(gonzalo);
		
		Coorporativa cooperativalul = new Coorporativa();
		cooperativalul.agregarProyecto(proyecto2);
		cooperativalul.agregarProyecto(proyecto1);
		
		assertEquals(proyecto2, cooperativalul.proyectoQueGusta());
		
	}
	
	@Test
	void proyectoConMasImpacto() {
		Desarrollador dino = new Desarrollador();
		dino.setNombreDesarrollador("Dino");
		dino.setPreferenciaRiquelme(5);
		dino.setLesionesTransitorias(1);
		dino.setLesionesCronicas(5);
		
		Desarrollador jaz = new Desarrollador();
		jaz.setNombreDesarrollador("Jaz");
		jaz.setLesionesTransitorias(3);
		jaz.setLesionesCronicas(1);
		jaz.setPreferenciaRiquelme(54);
		
		Desarrollador gonzalo = new Desarrollador();
		gonzalo.setNombreDesarrollador("Gonzalo");
		gonzalo.setPreferenciaRiquelme(30);
		gonzalo.setLesionesCronicas(0);
		gonzalo.setLesionesTransitorias(1);
		
		Desarrollador artharpual = new Desarrollador();
		artharpual.setNombreDesarrollador("Arthar");
		artharpual.setPreferenciaRiquelme(1);
		artharpual.setLesionesCronicas(2);
		artharpual.setLesionesTransitorias(3);
		
		Desarrollador tieryi = new Desarrollador();
		tieryi.setNombreDesarrollador("Thiago");
		tieryi.setLesionesCronicas(1);
		tieryi.setLesionesTransitorias(1);
		tieryi.setPreferenciaRiquelme(2);
		
		Proyecto proyecto1 = new Proyecto();
		proyecto1.agregarDesarrollador(dino);
		proyecto1.agregarDesarrollador(tieryi);
		proyecto1.agregarDesarrollador(jaz);
		proyecto1.setHorasEstimadas(16);
		
		Proyecto proyecto2 = new Proyecto();
		proyecto2.agregarDesarrollador(gonzalo);
		proyecto2.agregarDesarrollador(artharpual);
		proyecto2.setHorasEstimadas(11);
		
		Coorporativa coorporativa1 = new Coorporativa();
		coorporativa1.agregarProyecto(proyecto1);
		coorporativa1.agregarProyecto(proyecto2);
		

		assertEquals(proyecto1, coorporativa1.proyectoAltoImpacto());
		
	}

}
