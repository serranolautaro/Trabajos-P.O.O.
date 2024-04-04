
public class Personaje {
	
	private int locura;
	private int locuramax;
	private int ubicacion; private int secretos;
	private String nombre; 
	
	public Personaje(int locura, int locuramax) 
	{
		this.locura = locura;
		this.locuramax = locuramax;
	}

	public void embellecer(int valorvariable)
	{
		/*
		 Embellecer: este m�todo a�ade a la locura de un personaje un valor variable.
Tambi�n disminuye los secretos del personaje en 10 unidades.
		 */
		locura+=valorvariable;
		secretos-= 10;
	}
	
	public boolean estaEnMaravilla()
	{
		/*
		 Determinar si un personaje est� en el mundo de las maravillas: las personas pueden
estar en Maravilla o en alg�n lugar del mundo. El personaje tiene asociada una
ubicaci�n, esta ubicaci�n tiene un n�mero que indica la distancia que existe entre el
lugar actual y Buenos Aires. Si este n�mero es negativo significa que el personaje
est� en el mundo de las maravilla
		 */
		if (ubicacion < 0 )
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean esLinda()
	{
		/*
		 Determinar si un personaje es �lindo�: es lindo si posee un nivel de locura mayor al
75 % del m�ximo de locura permitido y, adem�s, est� en el mundo de las maravillas. */
		if(locura > 75*locuramax/100 && estaEnMaravilla() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean siEsNormal()
	{
		/*
		 Determinar si un personaje es normal: se considera normal si su nivel de locura es
menor a 10 y guardan al menos 500 secretos.*/
		if(locura < 10 && secretos >= 500)
		{
			return true;
		}
		else
		{
			return false;
		}
		 
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLocura() {
		return locura;
	}

	public void setLocura(int locura) {
		this.locura = locura;
	}

	public int getLocuramax() {
		return locuramax;
	}

	public void setLocuramax(int locuramayor) {
		this.locuramax = locuramayor;
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getSecretos() {
		return secretos;
	}

	public void setSecretos(int secretos) {
		this.secretos = secretos;
	}


}
