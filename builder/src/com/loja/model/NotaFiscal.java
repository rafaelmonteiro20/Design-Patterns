package com.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	private String numero;
	
	private LocalDate dataEmissao;
	
	private List<Item> itens;
	
	public NotaFiscal() {
		this.itens = new ArrayList<>();
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	public void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	public BigDecimal getTotal() {
		return itens.stream().map(Item::getTotal)
							 .reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
}