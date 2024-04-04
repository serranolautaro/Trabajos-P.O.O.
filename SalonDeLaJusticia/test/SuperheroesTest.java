import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SuperheroesTest {

	@Test
	void sumaSueldos() {
		Superheroes a = new Superheroes();
		
		AsistentesConHabilidadesEspeciales a1 = new AsistentesConHabilidadesEspeciales();
		a1.setNombre("Paul");
		a1.setSueldoBase(50000);
		a1.setHabilidad("Fuerza");
		
		AsistentesConHabilidadesEspeciales a2 = new AsistentesConHabilidadesEspeciales();
		a2.setNombre("Raur");
		a2.setSueldoBase(70000);
		
		a.añadirAsistente(a1);
		a.añadirAsistente(a2);
		
		assertEquals(120000, a.sumaSueldos());
	}
	
	@Test
	void llegaAFinDeMes()
	{
		Superheroes a = new Superheroes();
		a.setPresupuestoMensual(150000);
		
		AsistentesConHabilidadesEspeciales a1 = new AsistentesConHabilidadesEspeciales();
		a1.setNombre("Paul");
		a1.setSueldoBase(50000);
		a1.setHabilidad("Fuerza");
		
		AsistentesConHabilidadesEspeciales a2 = new AsistentesConHabilidadesEspeciales();
		a2.setNombre("Raur");
		a2.setSueldoBase(70000);
		
		a.añadirAsistente(a1);
		a.añadirAsistente(a2);
		
		a.sumaSueldos();
		
		assertEquals(true, a.llegaAFinDeMes());
		
	}

}
