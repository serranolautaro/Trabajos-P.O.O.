public class Luchador {
	
	private String nombre;
	private int fuerzacombate;
	private boolean practicaJitSu;
	private int cvd = 2;
	

	
	public boolean esChuckNorris(int valor)
	{
		if(getFuerzacombate()*cvd > valor)
		{
			return true;
		}
		return false;
	}
	
	public boolean insectos()
	{
		if(getFuerzacombate() > 500)
		{
			return true;
		}
		return false;
	}
	
		public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerzacombate() {
		return fuerzacombate;
	}

	public void setFuerzacombate(int fuerzacombate) {
		this.fuerzacombate = fuerzacombate;
	}

	public boolean isPracticaJitSu() {
		return practicaJitSu;
	}

	public void setPracticaJitSu(boolean practicaJitSu) {
		this.practicaJitSu = practicaJitSu;
	}
}
