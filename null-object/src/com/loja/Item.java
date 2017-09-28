package com.loja;

import com.loja.desconto.SemDesconto;

public class Item {

	private String nome;
	private double valor;
	private Desconto desconto;
	
	public Item(String nome, double valor) {
		this(nome, valor, new SemDesconto());
	}
	
	public Item(String nome, double valor, Desconto desconto) {
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
	}

	public double precoQuantidade(int quantidade) {
		return desconto.darDesconto(valor) * quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
}
