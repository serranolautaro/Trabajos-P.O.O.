
public class MateriaOptativa extends Materia{
	
	private double dificultad;


	public double puntajeTotal()
	{
			if(dificultad == 1 ||  dificultad == 2 || dificultad == 3) {
				return dificultad * getHoras();
			}
			return 0;
	}
	
	public double getDificultad() {
		return dificultad;
	}

	public void setDificultad(double dificultad) {
		this.dificultad = dificultad;
	}

}
