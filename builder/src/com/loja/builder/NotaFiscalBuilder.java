package com.loja.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.loja.model.Item;
import com.loja.model.NotaFiscal;

public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal;
	
	public NotaFiscalBuilder() {
		this.notaFiscal = new NotaFiscal();
	}
	
	public NotaFiscalBuilder comNumero(String numero) {
		notaFiscal.setNumero(numero);
		return this;
	}
	
	public NotaFiscalBuilder comDataEmissao(String data) {
		LocalDate parse = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		notaFiscal.setDataEmissao(parse);
		return this;
	}
	
	public NotaFiscalBuilder comItem(String descricao, double valor, int quantidade) {
		Item item = new Item(descricao, new BigDecimal(valor), quantidade);
		notaFiscal.adicionarItem(item);
		return this;
	}
	
	public NotaFiscal build() {
		return notaFiscal;
	}
	
}