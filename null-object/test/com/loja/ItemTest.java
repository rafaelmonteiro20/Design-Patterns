package com.loja;

import static org.junit.Assert.*;

import org.junit.Test;

import com.loja.desconto.DescontoAbsoluto;
import com.loja.desconto.DescontoPercentual;

public class ItemTest {

	@Test
	public void deveCalcularItemSemDesconto() {
		Item item = new Item("Camiseta", 100.0);
		assertEquals(200.0, item.precoQuantidade(2), 0.0001);
	}
	
	@Test
	public void deveCalcularItemComDescontoAbsoluto() {
		Item item = new Item("Camiseta", 100.0, new DescontoAbsoluto(10.0));
		assertEquals(180.0, item.precoQuantidade(2), 0.0001);
	}
	
	@Test
	public void deveCalcularItemComDescontoPercentual() {
		Item item = new Item("Camiseta", 100.0, new DescontoPercentual(20.0));
		assertEquals(160.0, item.precoQuantidade(2), 0.0001);
	}
	
}
