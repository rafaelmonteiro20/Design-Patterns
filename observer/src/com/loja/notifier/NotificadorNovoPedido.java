package com.loja.notifier;


import java.util.ArrayList;
import java.util.List;

import com.loja.listener.AcaoAposVenda;
import com.loja.model.Pedido;

public class NotificadorNovoPedido implements Notificador {

	private List<AcaoAposVenda> acoes;
	
	private Pedido pedido;
	
	public NotificadorNovoPedido() {
		this.acoes = new ArrayList<>();
	}
	
	public void adicionarAcao(AcaoAposVenda acao) {
		acoes.add(acao);
	}

	public void removerAcao(AcaoAposVenda acao) {
		acoes.remove(acao);
	}

	public void notificar() {
		acoes.forEach(a -> a.executar(pedido));
	}

	@Override
	public void novoPedido(Pedido pedido) {
		this.pedido = pedido;
		notificar();
	}

}