
public class MateriaObligatoria extends Materia{
	
	
	public double puntajeTotal()
	{
		if(isRecursada() == false)
		{
			return getPuntaje()*getA�oCarrera();
		}
		return getPuntaje();
	}

}
