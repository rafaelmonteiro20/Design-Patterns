package com.loja; 

import java.math.BigDecimal;
import java.time.LocalDate;

import com.loja.listener.EnviadorEmail;
import com.loja.listener.GeradorNotaFiscal;
import com.loja.model.Item;
import com.loja.model.Pedido;
import com.loja.notifier.Notificador;
import com.loja.notifier.NotificadorNovoPedido;

public class Principal {

	public static void main(String[] args) {
		
		Notificador notificador = new NotificadorNovoPedido();
		notificador.adicionarAcao(new GeradorNotaFiscal());
		notificador.adicionarAcao(new EnviadorEmail());
		// Posso adicionar quantas ações forem necessárias
				
		Pedido pedido = new Pedido();
		pedido.setNumero(100235L);
		pedido.setData(LocalDate.now());
		pedido.adicionarItem(new Item("Livro", new BigDecimal(79.9), 2));
		pedido.adicionarItem(new Item("Fone de ouvido", new BigDecimal(139.9), 1));
		
		notificador.novoPedido(pedido);
		
	}
	
}