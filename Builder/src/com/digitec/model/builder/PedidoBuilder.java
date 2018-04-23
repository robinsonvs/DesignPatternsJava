package com.digitec.model.builder;

import com.digitec.model.Cliente;
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
	
	private void definirCliente(String nome, boolean vip){
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setVip(vip);
		this.instancia.setCliente(cliente);
	}
	
	public PedidoVenda construir(){
		return this.instancia;
	}

}
