import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RepartidorTest {
	
	@Test
	void encontroTodosLosPedidosPesados() 
	{
		Pedidos pedido1 = new Pedidos(); 
		pedido1.setPesoPedido(99.9);
		pedido1.setPesoMaximo(100);
		pedido1.embalar();
		
		Pedidos pedido2 = new Pedidos();
		pedido2.setPesoPedido(95.2);
		pedido2.setPesoMaximo(100);
		
		Pedidos pedido3 = new Pedidos();
		pedido3.setPesoPedido(96.8);
		pedido3.setPesoMaximo(100);
		
		Repartidor deposito = new Repartidor();
		deposito.agregarPedidos(pedido1);
		deposito.agregarPedidos(pedido2);
		deposito.agregarPedidos(pedido3);
		
		ArrayList<Pedidos> resEsperado = new ArrayList<Pedidos>();
		resEsperado.add(pedido1);
		resEsperado.add(pedido2);
		resEsperado.add(pedido3);
		
		ArrayList<Pedidos> resObtenido = deposito.encontrarPedidosPesados();
		
		assertEquals(resEsperado, resObtenido);
	}

	@Test
	void encontro2PedidosPesados() 
	{
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(99.1);
		pedido1.setPesoMaximo(100);
		pedido1.embalar();
		pedido1.embalar();
		
		Pedidos pedido2 = new Pedidos();
		pedido2.setPesoPedido(50.8);
		pedido2.setPesoMaximo(100);
		
		Pedidos pedido3 = new Pedidos();
		pedido3.setPesoPedido(97.2);
		pedido3.setPesoMaximo(100);
		
		Repartidor deposito = new Repartidor();
		deposito.agregarPedidos(pedido1);
		deposito.agregarPedidos(pedido2);
		deposito.agregarPedidos(pedido3);
		
		ArrayList<Pedidos> resEsperado = new ArrayList<Pedidos>();
		resEsperado.add(pedido1);
		resEsperado.add(pedido3);
		
		ArrayList<Pedidos> resObtenido = deposito.encontrarPedidosPesados();
		
		assertEquals(resEsperado, resObtenido);
		
	}
	
	@Test
	void noEncontroNingunPedidoPesado() 
	{
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(15);
		pedido1.setPesoMaximo(100);
		pedido1.embalar();
		
		Pedidos pedido2 = new Pedidos();
		pedido2.setPesoPedido(50);
		pedido2.setPesoMaximo(100);
		
		Pedidos pedido3 = new Pedidos();
		pedido3.setPesoPedido(12);
		pedido3.setPesoMaximo(100);
		
		Repartidor deposito = new Repartidor();
		deposito.agregarPedidos(pedido1);
		deposito.agregarPedidos(pedido2);
		deposito.agregarPedidos(pedido3);
		
		ArrayList<Pedidos> resEsperado = new ArrayList<Pedidos>();
		
		ArrayList<Pedidos> resObtenido = deposito.encontrarPedidosPesados();
		
		assertEquals(resEsperado, resObtenido);	
	}

}
