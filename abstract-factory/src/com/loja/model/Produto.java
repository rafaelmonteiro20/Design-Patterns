package com.loja.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	
	private int quantidade;
	
	private BigDecimal valorUnitario = BigDecimal.ZERO;

	public Produto() {

	}
	
	public Produto(String nome, int quantidade, String valorUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = new BigDecimal(valorUnitario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public BigDecimal getValorTotal() {
		return valorUnitario.multiply(new BigDecimal(quantidade));
	}
	
}