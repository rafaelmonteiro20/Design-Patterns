package com.aeroporto;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrechoAereoTest {

	@Test
	public void trechoComEscala() {
		TrechoAereo t1 = new TrechoAereoSimples("GRU", "FOR", 600, 3000);
		TrechoAereo t2 = new TrechoAereoSimples("FOR", "NAT", 200, 500);
		TrechoAereo escala = new TrechoAereoComEscala(t1, t2);
		
		assertEquals("GRU", escala.getOrigem());
		assertEquals("NAT", escala.getDestino());
		assertEquals(800, escala.getCusto());
		assertEquals(3500, escala.getDistancia());
	}
	
	@Test(expected = RuntimeException.class)
	public void trechoComEscalaAeroportosDiferentes() {
		TrechoAereo t1 = new TrechoAereoSimples("GRU", "FOR", 600, 3000);
		TrechoAereo t2 = new TrechoAereoSimples("PER", "NAT", 200, 500);
		new TrechoAereoComEscala(t1, t2);
	}
	
	@Test
	public void trechoComConexao() {
		TrechoAereo t1 = new TrechoAereoSimples("GRU", "FOR", 600, 3000);
		TrechoAereo t2 = new TrechoAereoSimples("FOR", "NAT", 200, 500);
		TrechoAereo conexao = new TrechoAereoComConexao(t1, t2, 50);
		
		assertEquals("GRU", conexao.getOrigem());
		assertEquals("NAT", conexao.getDestino());
		assertEquals(850, conexao.getCusto());
		assertEquals(3500, conexao.getDistancia());
	}
	
	@Test
	public void trechoComEscalaEConexao() {
		TrechoAereo t1 = new TrechoAereoSimples("GRU", "FOR", 600, 3000);
		TrechoAereo t2 = new TrechoAereoSimples("FOR", "NAT", 200, 500);
		
		TrechoAereo escala = new TrechoAereoComEscala(t1, t2);
		TrechoAereo t3 = new TrechoAereoSimples("NAT", "FRA", 1000, 5000);
		
		TrechoAereo conexao = new TrechoAereoComConexao(escala, t3, 50);
		
		assertEquals("GRU", conexao.getOrigem());
		assertEquals("FRA", conexao.getDestino());
		assertEquals(1850, conexao.getCusto());
		assertEquals(8500, conexao.getDistancia());
	}
	
}
