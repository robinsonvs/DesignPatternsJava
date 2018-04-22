package com.design.strategy.impl;

import com.design.strategy.Imposto;

public class IPI implements Imposto {

	private double valor;
	
	public IPI(double valor){
		this.valor = valor;
	}
	
	@Override
	public double calcular() {
		return this.valor * 0.20;
	}

}
