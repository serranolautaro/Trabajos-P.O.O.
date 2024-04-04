
public class AsistentesConHabilidadesEspeciales extends Asistentes {
	
	private String habilidad;
	
	public double salario()
	{
		return getSueldoBase() * 1.2;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	

}
