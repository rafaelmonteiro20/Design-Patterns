package com.loja.notafiscal.ceara;

import java.math.BigDecimal;

import com.loja.model.Venda;
import com.loja.notafiscal.NotaFiscal;

public class CearaNotaFiscal implements NotaFiscal {

	private BigDecimal aliquota = new BigDecimal("0.07");
	
	@Override
	public BigDecimal gerar(Venda venda) {
		System.out.println("Gerando da Nota Fiscal para o estado do Ceará");
		return venda.getValorTotal().multiply(aliquota);
	}

}