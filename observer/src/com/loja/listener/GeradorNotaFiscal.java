package com.loja.listener;

import com.loja.model.Pedido;

public class GeradorNotaFiscal implements AcaoAposVenda {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Gerando nota fiscal para o pedido N° " + pedido.getNumero());
	}

}