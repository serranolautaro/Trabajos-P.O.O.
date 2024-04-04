package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Optional;

public class Identificado extends Detenidos {

	private int dniDetenido;
	private String nombreDetenido;
	private LocalDate fechaUltimaVezVisto;
	private String biografia;
	private String materialAudiovisual;
	private Profesion profesionDetenido;
	private LugarDeDetencion lugarDetenido;
	private ArrayList<CCDTyE> centros = new ArrayList<>();

	/*
	 * public java.util.Date ultimaVezVisto() { //Convierte el string a date
	 * java.util.Date ultimaVezVisto = null; try { ultimaVezVisto =
	 * formatoFechas.parse(fechaUltimaVezVisto); } catch (ParseException e) {
	 * e.printStackTrace(); } return ultimaVezVisto; }
	 */

	@Override
	public long tiempoCautiverio() {
		if (getCentrosEnLosQueEstuvo().size() != 0) {
			Duration diferencia = Duration.between(fechaUltimaVezVisto, fechaCierre());
			return diferencia.toDays();
		}
		return 0;
	}

	@Override
	// Si hay un testigo, no sobrevivio, si no, se toma que si sobrevivio
	public boolean sobrevivio() {
		if (getTestigoDelDetenido() == null) {
			return true;
		}
		return false;
	}

	public String getNombreDetenido() {
		return nombreDetenido;
	}

	public void setNombreDetenido(String nombreDetenido) {
		this.nombreDetenido = nombreDetenido;
	}

	public int getDniDetenido() {
		return dniDetenido;
	}

	public void setDniDetenido(int dniDetenido) {
		this.dniDetenido = dniDetenido;
	}

	public LocalDate getFechaUltimaVezVisto() {
		return fechaUltimaVezVisto;
	}

	public void setFechaUltimaVezVisto(LocalDate fechaUltimaVezVisto) {
		this.fechaUltimaVezVisto = fechaUltimaVezVisto;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getMaterialAudiovisual() {
		return materialAudiovisual;
	}

	public void setMaterialAudiovisual(String materialAudiovisual) {
		this.materialAudiovisual = materialAudiovisual;
	}

	public Profesion getProfesionDetenido() {
		return profesionDetenido;
	}

	public void setProfesionDetenido(Profesion profesionDetenido) {
		this.profesionDetenido = profesionDetenido;
	}

	public LugarDeDetencion getLugarDetenido() {
		return lugarDetenido;
	}

	public void setLugarDetenido(LugarDeDetencion lugarDetenido) {
		this.lugarDetenido = lugarDetenido;
	}

	public void setCentrosEnLosQueEstuvo(ArrayList<CCDTyE> centros) {
		this.centros = centros;
		// TODO Auto-generated method stub

	}

	public void desvincularCentro(CCDTyE centroADesvincular) {
		centros.remove(centroADesvincular);

	}
}
