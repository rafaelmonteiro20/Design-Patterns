package com.loja.listener;


import java.math.BigDecimal;

import com.loja.model.Item;
import com.loja.model.Pedido;

public class EnviadorEmail implements AcaoAposVenda {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando e-mail de confirmaçao...");
		System.out.println("--------------------------------------------------");
		System.out.println("N° do Pedido: " + pedido.getNumero());
		System.out.println("Data: " + pedido.getData());
		System.out.println("ITENS DO PEDIDO:");
		
		for (Item item : pedido.getItens()) {
			imprimirItem(item);
		}
		
		System.out.println("TOTAL DO PEDIDO: R$ " + formatarValor(pedido.getValorTotal()));
		System.out.println("-------------------------------------------------");
	}

	private void imprimirItem(Item item) {
		System.out.printf("-> %-20s %-3d %-10.2f %-5.2f \n", 
				item.getDescricao(), item.getQuantidade(), item.getValorUnitario(), item.getValorTotal());
	}
	
	private String formatarValor(BigDecimal valor) {
		return String.format("%.2f", valor);
	}
	
}