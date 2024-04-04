import java.util.ArrayList;

public class PanelSolar {
	ArrayList<CeldasPanelSolar> celdas = new ArrayList<CeldasPanelSolar>();
	private Electrodomestico electrodomestico;
	
	public int energiaQueProduce()
	{
		CeldasPanelSolar a = new CeldasPanelSolar();
		int energiaProducida = a.getCantidadCeldas()*a.getValorCadaCelda();
		return energiaProducida;
	}

	public Electrodomestico getElectrodomestico() {
		return electrodomestico;
	}

	public void setElectrodomestico(Electrodomestico electrodomestico) {
		this.electrodomestico = electrodomestico;
	}


}
