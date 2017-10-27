package com.loja.venda;

public class Item {

	private String descricao;
	
	private int quantidade;
	
	private double preco;

	public Item(String descricao, int quantidade, double preco) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}
	
	public double total() {
		return quantidade * preco;
	}

}
