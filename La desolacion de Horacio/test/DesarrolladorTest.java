import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DesarrolladorTest {

	@Test
	void sumaLesiones() {
		Desarrollador desarrollador1 = new Desarrollador();
		
		desarrollador1.setNombreDesarrollador("Dino");
		desarrollador1.setLesionesCronicas(2);
		desarrollador1.setLesionesTransitorias(3);
		
		assertEquals(5, desarrollador1.historialLesiones());
		
	}

}
