import java.util.ArrayList;

public class Superheroes {
	
	private String nombre;
	private double presupuestoMensual;
	
	private ArrayList<Asistentes> asistentesDelHeroe= new ArrayList<Asistentes>();

	public double sumaSueldos() {
	double sumaTotal=0;
	for (Asistentes a : asistentesDelHeroe)
	{
	sumaTotal+=a.getSueldoBase();
	}
	return sumaTotal;
	}

	public void añadirAsistente(Asistentes a)
	{
	asistentesDelHeroe.add(a);
	}

	public Boolean llegaAFinDeMes()
	{

	if (sumaSueldos()<presupuestoMensual)
	{
	return true;
	}
	else
	{
	return false;
	}
	}

	public String getNombre() {
	return nombre;
	}
	public double getPresupuestoMensual() {
	return presupuestoMensual;
	}
	public ArrayList<Asistentes> getAsistentesDelHeroe() {
	return asistentesDelHeroe;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public void setPresupuestoMensual(double presupuestoMensual) {
	this.presupuestoMensual = presupuestoMensual;
	}

}
