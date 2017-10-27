package com.loja;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.loja.entrega.EntregaExpressa;
import com.loja.entrega.EntregaNormal;
import com.loja.venda.Item;
import com.loja.venda.VendaAtacado;
import com.loja.venda.VendaVarejo;

public class VendaEntregaTest {

	@Test
	public void calculaTotalVendaVarejoComEntregaNormal() {
		Venda venda = new VendaVarejo(new EntregaNormal());
		venda.addItem(new Item("Notebook", 1, 2950.0));
		venda.addItem(new Item("Mouse", 1, 50.0));
		
		assertEquals(3050.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaVarejoComEntregaExpressa() {
		Venda venda = new VendaVarejo(new EntregaExpressa());
		venda.addItem(new Item("Notebook", 1, 2950.0));
		venda.addItem(new Item("Mouse", 1, 50.0));
		
		assertEquals(3100.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaVarejoComEntregaExpressaComMaisDeDezItens() {
		Venda venda = new VendaVarejo(new EntregaExpressa());
		venda.addItem(new Item("Camiseta", 10, 80.0));
		venda.addItem(new Item("Calças", 2, 100.0));
		
		assertEquals(1120.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaAtacadoComEntregaNormal() {
		Venda venda = new VendaAtacado(new EntregaNormal());
		venda.addItem(new Item("Camiseta", 10, 100.0));
		
		assertEquals(950.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaAtacadoComEntregaExpressa() {
		Venda venda = new VendaAtacado(new EntregaExpressa());
		venda.addItem(new Item("Camiseta", 10, 100.0));
		
		assertEquals(1000.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaAtacadoComEntregaExpressaComMaisDeDezItens() {
		Venda venda = new VendaAtacado(new EntregaExpressa());
		venda.addItem(new Item("Camiseta", 15, 100.0));
		
		assertEquals(1500.0, venda.total(), 0.0001);
	}
	
	@Test
	public void calculaTotalVendaAtacadoSemFrete() {
		Venda venda = new VendaAtacado();
		venda.addItem(new Item("Camiseta", 15, 100.0));
		
		assertEquals(1350.0, venda.total(), 0.0001);
	}
	
}
