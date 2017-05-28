package com.loja.boleto.cef;

import java.math.BigDecimal;

import com.loja.boleto.Boleto;
import com.loja.model.Venda;

public class CEFBoleto implements Boleto {

	@Override
	public void emitir(Venda venda, BigDecimal imposto) {
		System.out.println("### Boleto Caixa Economica ###");
		System.out.println("Valor venda:" + venda.getValorTotal());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor Total: " + venda.getValorTotal().add(imposto));
	}
	
}