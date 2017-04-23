package com.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Long numero;
	
	private LocalDate data;
	
	private List<Item> itens;

	public Pedido() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	public BigDecimal getValorTotal() {
		return itens.stream().map(Item::getValorTotal)
							 .reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
}