
public class MateriaOptativaTP extends Materia{
	
	private double dificultad;
	private int tp = 10;
	
	public double puntajeTotal()
	{
		if(dificultad == 1 ||  dificultad == 2 || dificultad == 3) {
			return (dificultad * getHoras()) + tp;
		}
		return 0;
	}

	public double getDificultad() {
		return dificultad;
	}

	public void setDificultad(double dificultad) {
		this.dificultad = dificultad;
	}

	public int getTp() {
		return tp;
	}

	public void setTp(int tp) {
		this.tp = tp;
	}

	
}
