package com.digitec.cobranca.service;

import com.digitec.cobranca.model.CartaoCredito;
import com.digitec.cobranca.model.Cliente;

public interface AutorizadorCartaoCredito {

	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double Valor);
}
