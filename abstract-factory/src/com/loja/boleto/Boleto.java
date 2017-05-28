package com.loja.boleto;

import java.math.BigDecimal;

import com.loja.model.Venda;

public interface Boleto {

	void emitir(Venda venda, BigDecimal imposto);

}