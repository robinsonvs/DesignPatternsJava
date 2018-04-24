package com.digitec.model.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.digitec.model.Cliente;
import com.digitec.model.ItemPedido;
import com.digitec.model.PedidoVenda;

public class PedidoBuilder {

	private PedidoVenda instancia;
	
	public PedidoBuilder(){
		this.instancia = new PedidoVenda();
	}
	
	public PedidoBuilder comClienteVip(String nome){
		definirCliente(nome, true);
		return this;
	}
	
	public PedidoBuilder comClienteNormal(String nome){
		definirCliente(nome, false);
		return this;
	}
	
	public PedidoBuilderValido comNumeroPedido(String numero){
		this.instancia.setNumero(numero);
		return new PedidoBuilderValido(instancia);
	}
	
	public PedidoBuilder comItem(String nome, Integer quantidade, String valorUnitario){
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValorUnitario(new BigDecimal(valorUnitario));
		if (this.instancia.getItensPedido() == null){
			this.instancia.setItensPedido(new ArrayList<ItemPedido>());
		}
		this.instancia.getItensPedido().add(item);
		return this;
	}
	
	private void definirCliente(String nome, boolean vip){
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setVip(vip);
		this.instancia.setCliente(cliente);
	}


}
