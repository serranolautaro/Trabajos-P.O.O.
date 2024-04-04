import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EstudianteTest {

	@Test
	void test() {
		Materia mate = new Materia();
		mate.setNombreMateria("Matematica");
		mate.setPuntaje(7);
		
		Materia lengua = new Materia();
		mate.setPuntaje(7);
		
		Estudiante dino = new Estudiante();
		dino.setRegularidad(true);
		dino.asignarMateria(mate);
		dino.asignarMateria(lengua);
		
		ArrayList<Materia> resultadoEsperado = new ArrayList<Materia>();
		resultadoEsperado.add(mate);
		resultadoEsperado.add(lengua);
		
		assertEquals(resultadoEsperado, dino.materias);
	}

}
