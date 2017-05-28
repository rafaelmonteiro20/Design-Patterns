package com.loja.venda.ceara;

import com.loja.boleto.Boleto;
import com.loja.model.Banco;
import com.loja.notafiscal.NotaFiscal;
import com.loja.notafiscal.ceara.CearaNotaFiscal;
import com.loja.venda.ModuloVendaFactory;

public class CearaModuloVendaFactory implements ModuloVendaFactory {

	private Banco banco;
	
	public CearaModuloVendaFactory(Banco banco) {
		this.banco = banco;
	}
	
	@Override
	public NotaFiscal criarNotaFiscal() {
		return new CearaNotaFiscal();
	}

	@Override
	public Boleto criarBoleto() {
		return banco.getBoleto();
	}
	
}