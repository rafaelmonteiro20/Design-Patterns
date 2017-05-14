package com.loja.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.loja.builder.NotaFiscalBuilder;

public class NotaFiscalTest {

	@Test
	public void deveCalcularNotaFiscal() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
									.comNumero("10023")
									.comDataEmissao("14/05/2017")
									.comItem("Livro Design Pattern", 100.0, 1)
									.comItem("Fone de Ouvido", 150.0, 2)
									.build();
		
		BigDecimal total = notaFiscal.getTotal();
		assertEquals(new BigDecimal(400.0).doubleValue(), total.doubleValue(), 0.0001);
	}
	
}