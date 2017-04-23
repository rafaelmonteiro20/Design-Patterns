package com.loja.listener;

import com.loja.model.Pedido;

public interface AcaoAposVenda {

	void executar(Pedido pedido);
	
}