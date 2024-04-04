import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AsistentesTest {
	
	@Test
	void salario() {
		
		Asistentes a = new Asistentes();
		a.setSueldoBase(50000);
		
		assertEquals(50000, a.salario());

	}

}
