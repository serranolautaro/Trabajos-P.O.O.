
public class Pedidos {
	/*embalar: agrega 1 capa de embalaje. Hay que tener en cuenta que el peso total de
	cada capa es de 12gr */
	private int cantidadCapas = 1; 
	private double pesoPedido;
	private double pesoMaximo;
	private double capaEmbalaje = 0.12;
	
	public void embalar()
	{
		cantidadCapas++;
		pesoPedido += capaEmbalaje;
	}
	
	public boolean esPesado() /*se considera que un pedido es pesado si su peso
(medido en kg) supera en un 95% al peso máximo permitido.
 */
	{
		if(pesoPedido>pesoMaximo*0.95)
		{
			return true;
		}
		return false;
	}

	public int getCantidadCapas() {
		return cantidadCapas;
	}

	public double getPesoPedido() {
		return pesoPedido;
	}

	public void setPesoPedido(double pesoPedido) {
		this.pesoPedido = pesoPedido;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public double getCapaEmbalaje() {
		return capaEmbalaje;
	}

	public void setCapaEmbalaje(double capaEmbalaje) {
		this.capaEmbalaje = capaEmbalaje;
	}

}
