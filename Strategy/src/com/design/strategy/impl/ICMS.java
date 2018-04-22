package com.design.strategy.impl;

import com.design.strategy.Imposto;

public class ICMS implements Imposto {

	private double valor;
	
	public ICMS(double valor){
		this.valor = valor;
	}
	
	@Override
	public double calcular() {
		return this.valor * 0.10;
	}

}
