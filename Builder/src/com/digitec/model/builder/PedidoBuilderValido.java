package com.digitec.model.builder;

import com.digitec.model.PedidoVenda;

//criado para obrigado o uso de numero de pedido em compilacao
public class PedidoBuilderValido {

	private PedidoVenda instancia;
	
	public PedidoBuilderValido(PedidoVenda instancia) {
		this.instancia = instancia;
	}

	public PedidoVenda construir(){
		return this.instancia;
	}

}
