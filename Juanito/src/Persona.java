
public class Persona {
 private int ingerido; private int capacidadestomago;
	
	
	public void comer(int alimento)
	{
		if(alimento + ingerido <= capacidadestomago)
		{
			ingerido += alimento;
		}
		else
			ingerido = capacidadestomago;
	}

	public boolean personaLlena()
	{
		if(90*ingerido/capacidadestomago >= 90 )
		{
			return true;
		}
		else
			return false;
	}
	
	public void crecer()
	{
			capacidadestomago += 50;
	}
	
	public void digerir()
	{
		ingerido = 0;
		System.out.println("Juanito ha digerido todo");
	}
	
	public void aprender(boolean personaLlena)
	{
		if(personaLlena == true)
		{
			System.out.println("Juanito puede aprender");
		}
		else
			System.out.println("Juanito no puede aprender");
	}
	
	public int getIngerido() {
		return ingerido;
	}

	public void setIngerido(int ingerido) {
		this.ingerido = ingerido;
	}

	public int getCapacidadestomago() {
		return capacidadestomago;
	}

	public void setCapacidadestomago(int capacidadestomago) {
		this.capacidadestomago = capacidadestomago;
	}

}
