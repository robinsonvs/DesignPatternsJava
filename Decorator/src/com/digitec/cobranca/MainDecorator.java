package com.digitec.cobranca;

import java.time.YearMonth;
import java.util.Scanner;

import com.digitec.cobranca.model.CartaoCredito;
import com.digitec.cobranca.model.Cliente;
import com.digitec.cobranca.service.AutorizadorCartaoCredito;
import com.digitec.cobranca.service.AutorizadorCielo;

public class MainDecorator {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Cliente : ");
			String nomeCliente = entrada.nextLine();
			
			System.out.println("CPF : ");
			String cpf = entrada.nextLine();
			
			System.out.println();
			System.out.println("Valor compra : R$ ");
			double valor = entrada.nextDouble();
			entrada.nextLine();
			
			System.out.println();
			System.out.println("Informações : ");
			System.out.println("Número cartão : ");
			String cartao = entrada.nextLine();
			System.out.println("Nome cartão : ");
			String nomeCartao = entrada.nextLine();
			System.out.println("Ano vencimento : ");
			int anoVencimento = entrada.nextInt();
			System.out.println("Mês vencimento");
			int mesVencimento = entrada.nextInt();
			System.out.println("Código segurança : ");
			int codigoSeguranca = entrada.nextInt();
			
			Cliente cliente = new Cliente(nomeCliente, cpf);
			CartaoCredito cartaoCredito = new CartaoCredito(cartao, nomeCartao, 
					YearMonth.of(anoVencimento, mesVencimento), codigoSeguranca);
					
			AutorizadorCartaoCredito autorizador = new AutorizadorCielo();
			autorizador.autorizar(cliente, cartaoCredito, valor);
					
			
					
		}
	}
}
