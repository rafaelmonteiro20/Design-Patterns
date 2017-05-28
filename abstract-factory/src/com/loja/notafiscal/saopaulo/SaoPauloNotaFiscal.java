package com.loja.notafiscal.saopaulo;

import java.math.BigDecimal;

import com.loja.model.Venda;
import com.loja.notafiscal.NotaFiscal;

public class SaoPauloNotaFiscal implements NotaFiscal {

	private BigDecimal aliquota = new BigDecimal("0.10");
	
	@Override
	public BigDecimal gerar(Venda venda) {
		System.out.println("Gerando da Nota Fiscal para o estado de São Paulo");
		return venda.getValorTotal().multiply(aliquota);
	}

}