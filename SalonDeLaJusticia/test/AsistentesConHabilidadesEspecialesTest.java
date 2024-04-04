import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AsistentesConHabilidadesEspecialesTest {
	
	@Test
	void salario() {
		AsistentesConHabilidadesEspeciales a1 = new AsistentesConHabilidadesEspeciales();
		a1.setSueldoBase(1000);
		assertEquals(1200, a1.salario());

	}

}
