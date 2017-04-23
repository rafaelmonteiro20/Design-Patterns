package com.loja.notifier;

import com.loja.listener.AcaoAposVenda;
import com.loja.model.Pedido;

public interface Notificador {

	void adicionarAcao(AcaoAposVenda acao);
	
	void removerAcao(AcaoAposVenda acao);
	
	void notificar();
	
	void novoPedido(Pedido pedido);

}