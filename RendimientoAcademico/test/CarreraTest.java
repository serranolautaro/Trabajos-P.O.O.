import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CarreraTest {

	@Test
	void estudiantesMayorParametro() {
		
		Materia mate = new Materia();
		mate.setNombreMateria("Matematica");
		mate.setPuntaje(12);
		
		Materia lengua = new Materia();
		mate.setPuntaje(5.5);
		
		Estudiante est1 = new Estudiante();
		est1.setNombre("Jaz");
		est1.setRegularidad(true);
		est1.asignarMateria(mate);
		est1.asignarMateria(lengua);
		est1.puntajeTotal();
		
		Estudiante est2 = new Estudiante();
		est2.setNombre("Dino");
		est2.setRegularidad(true);
		est2.asignarMateria(lengua);
		est2.puntajeTotal();
		
		Carrera carrera1 = new Carrera();
		carrera1.añadirEstudiantes(est1);
		carrera1.añadirEstudiantes(est2);
		
		ArrayList<Estudiante> curso = carrera1.estudiantesMayorParametro();
				
		ArrayList<Estudiante> aprobados = new ArrayList<Estudiante>();
		aprobados.add(est1);
		
		assertEquals(aprobados, curso);
	}

}
