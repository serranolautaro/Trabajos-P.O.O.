
public class Desarrollador {
	private String nombreDesarrollador;
	private int preferenciaRiquelme;
	private int lesionesCronicas;
	private int lesionesTransitorias;
	
	public int historialLesiones()
	{
		return lesionesCronicas+lesionesTransitorias;
	}
	
	// GETS & SETS
	
	public String getNombreDesarrollador() {
		return nombreDesarrollador;
	}

	public void setNombreDesarrollador(String nombreDesarrollador) {
		this.nombreDesarrollador = nombreDesarrollador;
	}

	public int getPreferenciaRiquelme() {
		return preferenciaRiquelme;
	}

	public void setPreferenciaRiquelme(int preferenciaRiquelme) {
		this.preferenciaRiquelme = preferenciaRiquelme;
	}

	public int getLesionesCronicas() {
		return lesionesCronicas;
	}

	public void setLesionesCronicas(int lesionesCronicas) {
		this.lesionesCronicas = lesionesCronicas;
	}

	public int getLesionesTransitorias() {
		return lesionesTransitorias;
	}

	public void setLesionesTransitorias(int lesionesTransitorias) {
		this.lesionesTransitorias = lesionesTransitorias;
	}


}
