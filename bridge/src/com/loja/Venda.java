package com.loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.loja.venda.Item;

public abstract class Venda {

	private TipoEntrega tipoEntrega;
	
	private List<Item> itens = new ArrayList<>();
	
	public Venda(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	protected abstract double preco();
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}
	
	public double total() {
		return preco() + tipoEntrega.entrega(this);
	}
	
	public int quantidadeDeItens() {
		return itens.stream().mapToInt(Item::getQuantidade).sum();
	}
	
}
