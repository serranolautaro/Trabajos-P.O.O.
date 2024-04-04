import java.util.ArrayList;

public class Coorporativa {
	ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
	
	public void agregarProyecto(Proyecto p)
	{
		proyectos.add(p);
	}
	
	public Proyecto proyectoQueGusta()
	{
		Proyecto proyectoQueMasGusta = proyectos.get(0);
		for(Proyecto p : proyectos) {
			if(p.desarrolladores.size() > proyectoQueMasGusta.desarrolladores.size())
			{
				proyectoQueMasGusta = p;
			}
		}
		return proyectoQueMasGusta;
	}

	public Proyecto proyectoAltoImpacto()
	{
		Proyecto proyectoConMasImpacto = proyectos.get(0);
		for(Proyecto p : proyectos) 
		{
			if(p.getHorasEstimadas() > proyectoConMasImpacto.getHorasEstimadas() && p.contadorLesionesCronicas() > proyectoConMasImpacto.contadorLesionesCronicas())
			{
					proyectoConMasImpacto = p;
			}
		}
		return proyectoConMasImpacto;
	}
	
}
