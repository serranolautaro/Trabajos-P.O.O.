
public class mainn {

	public static void main(String[] args) {
		/*Desarrollar un programa que permita a una persona:
1. comer: una cantidad de alimento. La persona posee un est�mago y este l�mite por lo
tanto no puede comer m�s alimento del que su est�mago le permite.
2. saber si est� llena (panza llena coraz�n contento): se considera llena una persona
cuando la cantidad de alimento que comi� equivale al 90% de la capacidad de su
est�mago.
3. crecer: aumenta la capacidad del est�mago.
4. digerir: la cantidad de alimento vuelve a 0.
5. aprender: s�lo se puede aprender si la panza est� llena.
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
