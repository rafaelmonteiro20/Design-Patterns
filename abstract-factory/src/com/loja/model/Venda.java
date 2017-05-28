package com.loja.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Produto> produtos;
	
	public Venda() {
		this.produtos = new ArrayList<>();
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public BigDecimal getValorTotal() {
		return produtos.stream()
					.map(Produto::getValorTotal)
					.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
}