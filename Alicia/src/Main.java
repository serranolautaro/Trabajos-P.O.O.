public class Main {

	public static void main(String[] args) {
		System.out.println("PARTE A");
		Personaje alicia = new Personaje(75, 100);
		alicia.setNombre("Alicia");
		alicia.setUbicacion(6);
		alicia.setSecretos(510);
		
		alicia.embellecer(4);

		if(alicia.estaEnMaravilla() == true)
		{
			System.out.println("Esta a " + alicia.getUbicacion() + " km de Villa Celina");
		}
		else
		{
			System.out.println("Esta en el pais de las maravillas");
		}
		
		if(alicia.esLinda() == true)
		{
			System.out.println("Si la defino, la limito = Es lindx");
		}
		else
		{
			System.out.println("No opino");
		}
		
		if(alicia.siEsNormal() == true)
		{
			System.out.println("Es normal");
		}
		else
		{
			System.out.println("No esta cuerdo");
		}
		
		System.out.println("PARTE B");
		
		Personaje dino = new Personaje(2, 100);
		dino.setNombre("Dino");
		dino.setUbicacion(-242);
		dino.setSecretos(370);
		
		dino.embellecer(6);
		
		Personaje jaz = new Personaje(10, 100);
		jaz.setNombre("Jaz");
		jaz.setUbicacion(-75);
		jaz.setSecretos(335);
		
		jaz.embellecer(8);
		
		Mundo mundo1 = new Mundo();
		mundo1.agregarPersonaje(jaz);
		mundo1.agregarPersonaje(dino);
		mundo1.agregarPersonaje(alicia);
		
		//Determinar si hay al menos una persona normal.
		if(mundo1.hayPersonaNormal() == true)
		{
			System.out.println("Hay personas normales");
		}
		else
			System.out.println("No hay personas normales");
		
		//Encontrar los personajes lindos
		System.out.println("Personajes lindos: " + mundo1.encontrarLindos());
		
		//Cuantos personajes están en maravilla
		System.out.println("Cuantas personas en maravilla: " + mundo1.cuantasPersonasMaravilla());
		
		//Encontrar al personaje que tenga la mayor cantidad de locura
		System.out.println(mundo1.mayorCantidadLocura());
		
		//Ver si hay mas personajes lindos o mas normales
		if(mundo1.hayMasPersonajesLindos() == true)
		{
			System.out.println("Hay mas personajes lindos");
		}
		else
			System.out.println("Hay mas personajes normales");

	}
}
