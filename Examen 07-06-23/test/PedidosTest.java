import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PedidosTest {
	@Test
	void siSeEmbalaElPaquete() {
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(40);
		pedido1.setPesoMaximo(100);
		
		pedido1.embalar();
		assertEquals(40.12, pedido1.getPesoPedido(), 0.01);
	}
	
	@Test
	void siSumaCapa() {
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(50);
		pedido1.setPesoMaximo(100);
		pedido1.embalar();
		pedido1.embalar();
		pedido1.embalar();
		assertEquals(4, pedido1.getCantidadCapas());
	}
	
	@Test
	void siElPedidoEsPesado() {
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(95.1);
		pedido1.setPesoMaximo(100);
		assertEquals(true, pedido1.esPesado());
	}
	
	@Test
	void siElPedidoNoEsPesado() {
		Pedidos pedido1 = new Pedidos();
		pedido1.setPesoPedido(94.9);
		pedido1.setPesoMaximo(100);
		assertEquals(false, pedido1.esPesado());
	}

}
