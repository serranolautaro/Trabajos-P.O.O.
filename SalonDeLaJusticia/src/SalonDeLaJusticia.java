import java.util.ArrayList;

public class SalonDeLaJusticia {
	
	private ArrayList <Superheroes> integrantes = new ArrayList<Superheroes>();

	public void añadirSuperheroe (Superheroes s)
	{
	integrantes.add(s);
	}

	public ArrayList<Superheroes> mas_asistentes()
	{
	ArrayList<Superheroes> masCantAsistentes= new ArrayList<Superheroes>();
	int cantMaxAsistentes=0;
	for (Superheroes s : integrantes) {
	if (s.getAsistentesDelHeroe().size()>cantMaxAsistentes) {
	cantMaxAsistentes=s.getAsistentesDelHeroe().size();
		}
	}
	for (Superheroes s : integrantes) {
	if (s.getAsistentesDelHeroe().size()==cantMaxAsistentes) {
	masCantAsistentes.add(s);
		}
	}

	return masCantAsistentes;
	}

	public ArrayList<Superheroes> noLleganAFinDeMes(){
	ArrayList<Superheroes> noLlegan= new ArrayList<Superheroes>();
	for (Superheroes s : integrantes) {
	if (s.llegaAFinDeMes()==false)
	{
	noLlegan.add(s);
	}
	}
	return noLlegan;
	}

	public double presupuestoTotal() {
	double presupuestoTotalSalon=0;
	for (Superheroes s : integrantes)
	{
	if (s.llegaAFinDeMes()==true)
	{
	double añadidoXHeroe=0;
	añadidoXHeroe=s.getPresupuestoMensual()-s.sumaSueldos();
	presupuestoTotalSalon+=añadidoXHeroe;
	}
	}
	return presupuestoTotalSalon;
	}

	public int cantAsistentesConBuenSueldo(){
	int asistentesConBuenSueldo=0;
	for (Superheroes s : integrantes) {
	for (Asistentes a : s.getAsistentesDelHeroe()) {
	if (a.getSueldoBase()>60000) {
	asistentesConBuenSueldo+=1;
		}
	}
	}
	return asistentesConBuenSueldo;
	}

	public ArrayList<Superheroes> getIntegrantes() {
	return integrantes;
	}

}
