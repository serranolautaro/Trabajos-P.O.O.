import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ProyectoTest {

	@Test
	void mayorPreferenciaPorTristelme () {
		Desarrollador uno = new Desarrollador();
		uno.setPreferenciaRiquelme(50);
		
		Desarrollador dos = new Desarrollador();
		dos.setPreferenciaRiquelme(5);
		
		Desarrollador tres = new Desarrollador();
		tres.setPreferenciaRiquelme(1);
		
		Proyecto proyecto1 = new Proyecto();
		proyecto1.agregarDesarrollador(uno);
		proyecto1.agregarDesarrollador(dos);
		proyecto1.agregarDesarrollador(tres);
		
		ArrayList<Proyecto> resultadoEsperado = new ArrayList<Proyecto>();
		resultadoEsperado.add(0, proyecto1);
		
		ArrayList<Proyecto> resultadoObtenido = new ArrayList<Proyecto>();
		resultadoObtenido.add(0, proyecto1);
	}
}
