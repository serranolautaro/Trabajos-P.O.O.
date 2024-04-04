
public class mainn {

	public static void main(String[] args) {
		/*Desarrollar un programa que permita a una persona:
1. comer: una cantidad de alimento. La persona posee un estómago y este límite por lo
tanto no puede comer más alimento del que su estómago le permite.
2. saber si está llena (panza llena corazón contento): se considera llena una persona
cuando la cantidad de alimento que comió equivale al 90% de la capacidad de su
estómago.
3. crecer: aumenta la capacidad del estómago.
4. digerir: la cantidad de alimento vuelve a 0.
5. aprender: sólo se puede aprender si la panza está llena.
		 */

		Persona juanito = new Persona();
		juanito.setCapacidadestomago(100);
		juanito.setIngerido(0);
		while(juanito.personaLlena() == false) {
			juanito.comer(5);
			juanito.comer(30);
			System.out.println(juanito.getIngerido());
		}
		if(juanito.personaLlena() == true)
		{
			System.out.println("Juanito esta lleno");
		}
		juanito.crecer();
		juanito.digerir();
		juanito.aprender(true);
	}

}
