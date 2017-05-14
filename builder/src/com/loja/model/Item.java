package com.loja.model;

import java.math.BigDecimal;

public class Item {

	private String descricao;
	
	private BigDecimal valorUnitario;
	
	private int quantidade;
	
	public Item(String descricao, BigDecimal valorUnitario, int quantidade) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public BigDecimal getTotal() {
		return valorUnitario.multiply(new BigDecimal(quantidade));
	}
	
}