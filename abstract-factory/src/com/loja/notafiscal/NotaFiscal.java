package com.loja.notafiscal;

import java.math.BigDecimal;

import com.loja.model.Venda;

public interface NotaFiscal {

	BigDecimal gerar(Venda venda);
	
}