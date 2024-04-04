import java.util.ArrayList;
import java.util.Iterator;

public class Simulacion {
	
	ArrayList<PanelSolar> panelsolar = new ArrayList<PanelSolar>();
	
	public void agregarPanelSolar(PanelSolar a)
	{
		panelsolar.add(a);
	}
	
	public ArrayList<PanelSolar> losPanelesChicos(){
		ArrayList<PanelSolar> paneles = new ArrayList<PanelSolar>();
		for (PanelSolar p : panelsolar) {
			if(p.energiaQueProduce() < p.getElectrodomestico().getWattsPorHora())
			{
				paneles.add(p);
			}
		}
		return paneles;
		
	}
	
	public int consumoElectroTotal()
	{
		int consumo = 0;
		for (PanelSolar a : panelsolar) {
			consumo += a.getElectrodomestico().getWattsPorHora();
		}
		return consumo;
	}
	
	public int cantidadTotalProducidaPorPaneles()
	{
		int cantidad = 0;
		for (PanelSolar a : panelsolar) {
			cantidad += a.energiaQueProduce();
		}
		return cantidad;
	}
	
	public Boolean hayPanelesChicos()
	{
			if(losPanelesChicos().size() >= 1)
			{
				return true;
			}
			return false;
	}
	
	public Boolean upsConectamosTodoMal()
	{
		if(cantidadTotalProducidaPorPaneles() > consumoElectroTotal())
		{
			return true;
		}
		return false;
	}
	
	public Electrodomestico elElectroQueMasConsume()
	{
		Electrodomestico electromasconsumidor = new Electrodomestico();
		for (PanelSolar a : panelsolar) {
			if(electromasconsumidor.getWattsPorHora() > a.getElectrodomestico().getWattsPorHora())
			{
				electromasconsumidor = a.getElectrodomestico();
			}
			
		}
		return electromasconsumidor;
	}
	

}

