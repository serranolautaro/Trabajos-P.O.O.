public class Luchador {
private String nombre;
private boolean jiu;
private double fuerzaDeCombate;
private int cvd = 2;

public boolean esChuckNorris(double fuerzaVan ) {
	double fuerzatotal;
	fuerzatotal= fuerzaDeCombate * cvd;
	if( fuerzatotal > fuerzaVan ) {
		return true;
	}
	else {
		return false;
	}
}

public boolean esInsecto() {
	if(fuerzaDeCombate <= 500) {
		return true;
	}
	else {
		return false;
	}
}

public double getFuerzaDeCombate() {
	return fuerzaDeCombate;
	}

public void setFuerzaDeCombate(double fuerzaCombate) {
	this.fuerzaDeCombate = fuerzaCombate;
	}

public String getNombre() {
	return nombre;
	}	

public void setNombre(String nombre) {
	this.nombre = nombre;
	}

public boolean isJiu() {
	return jiu;
	}

public void setJiu(boolean jiu) {
	this.jiu = jiu;
	}

public int getCvd() {
	return cvd;
}

}
