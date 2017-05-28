package com.loja.venda;

import com.loja.boleto.Boleto;
import com.loja.notafiscal.NotaFiscal;

public interface ModuloVendaFactory {

	public NotaFiscal criarNotaFiscal();
	
	public Boleto criarBoleto();
	
}