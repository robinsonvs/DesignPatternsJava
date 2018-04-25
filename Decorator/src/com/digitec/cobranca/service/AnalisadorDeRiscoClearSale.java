package com.digitec.cobranca.service;

import com.digitec.cobranca.model.CartaoCredito;
import com.digitec.cobranca.model.Cliente;

public class AnalisadorDeRiscoClearSale implements AutorizadorCartaoCredito {

	private AutorizadorCartaoCredito autorizador;
	
	@Override
	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double Valor) {
		// TODO Auto-generated method stub

	}

}
