package com.loja.venda.saopaulo;

import com.loja.boleto.Boleto;
import com.loja.boleto.bb.BBBoleto;
import com.loja.notafiscal.NotaFiscal;
import com.loja.notafiscal.saopaulo.SaoPauloNotaFiscal;
import com.loja.venda.ModuloVendaFactory;

public class SaoPauloModuloVendaFactory implements ModuloVendaFactory {

	@Override
	public NotaFiscal criarNotaFiscal() {
		return new SaoPauloNotaFiscal();
	}

	//Para venda em São Paulo somente Banco do Brasil
	@Override
	public Boleto criarBoleto() {
		return new BBBoleto();
	}
	
}