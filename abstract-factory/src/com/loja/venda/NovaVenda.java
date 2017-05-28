package com.loja.venda;

import java.math.BigDecimal;

import com.loja.boleto.Boleto;
import com.loja.model.Venda;
import com.loja.notafiscal.NotaFiscal;

public class NovaVenda {

	private NotaFiscal notaFiscal;
	
	private Boleto boleto;
	
	public NovaVenda(ModuloVendaFactory modulo) {
		this.notaFiscal = modulo.criarNotaFiscal();
		this.boleto = modulo.criarBoleto();
	}
	
	public void realizar(Venda venda) {
		BigDecimal imposto = notaFiscal.gerar(venda);
		boleto.emitir(venda, imposto);
	}
	
}