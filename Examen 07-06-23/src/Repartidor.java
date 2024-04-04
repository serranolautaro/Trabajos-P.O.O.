import java.util.ArrayList;

public class Repartidor {
	ArrayList<Pedidos> pedidito = new ArrayList<Pedidos>();
	
	/*Encontrar los pedidos pesados: se considera que un pedido es pesado si su peso
	(medido en kg) supera en un 95% al peso máximo permitido.*/
	
	public void agregarPedidos(Pedidos p)
	{
		pedidito.add(p);
	}
	
	public ArrayList<Pedidos> encontrarPedidosPesados()
	{
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
		for(Pedidos p1 : pedidito)
		{
			if(p1.esPesado() == true)
			{
				pedidos.add(p1);
			}
		}
		return pedidos;
	}


}
