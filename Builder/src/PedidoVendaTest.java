import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import Builder.src.com.digitec.model.Cliente;
import Builder.src.com.digitec.model.ItemPedido;
import Builder.src.com.digitec.model.PedidoVenda;
import Builder.src.com.digitec.model.builder.PedidoBuilder;

public class PedidoVendaTest {

	@Test
	public void deveCalcularValorTotalClienteVip() {
		PedidoVenda pedidoVenda = new PedidoVenda();
		
		Cliente cliente = new Cliente();
		cliente.setNome("João");
		cliente.setVip(true);
		pedidoVenda.setCliente(cliente);
		
		ItemPedido item1 = new ItemPedido();
		item1.setNome("Calculadora");
		item1.setValorUnitario(new BigDecimal("200"));
		item1.setQuantidade(2);
		
		ItemPedido item2 = new ItemPedido();
		item2.setNome("Mochila");
		item2.setValorUnitario(new BigDecimal("200"));
		item2.setQuantidade(1);
		
		List<ItemPedido> itensPedido = Arrays.asList(item1, item2);
		pedidoVenda.setItensPedido(itensPedido);
		
		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		
		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
	}

	@Test
	public void deveCalcularValorTotalClienteVipBuilder(){
		PedidoVenda pedidoVenda = new PedidoBuilder()
								.comClienteVip("Joao")
								.comIem("Calculadora", 2, "200")
								.comIem("Mochila", 1, "200")
								//obrigando o uso do numero
								.comNumeroPedido("045020")
								.construir();
		
		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		
		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
	}
	
}
