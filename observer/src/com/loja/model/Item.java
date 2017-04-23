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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public BigDecimal getValorTotal() {
		return valorUnitario.multiply(new BigDecimal(quantidade)); 
	}

}