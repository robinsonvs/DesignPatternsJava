package com.design.strategy.main;

import com.design.strategy.impl.CalculadoraImposto;
import com.design.strategy.impl.ICMS;
import com.design.strategy.impl.IPI;

public class MainCalculadora {

	public static void main(String[] args) {
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
		ICMS icms = new ICMS(100.00);
		IPI ipi = new IPI(100.00);
		
		System.out.println(calculadoraImposto.calcular(icms));
		System.out.println(calculadoraImposto.calcular(ipi));
	}

}
