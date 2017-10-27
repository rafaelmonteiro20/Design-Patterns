package com.loja.entrega;

import com.loja.TipoEntrega;
import com.loja.Venda;

public class EntregaExpressa implements TipoEntrega {

	private static final double TAXA = 100.0;
	private static final double LIMITE = 10;
	
	@Override
	public double entrega(Venda venda) {
		if(venda.quantidadeDeItens() > LIMITE) 
			return (venda.quantidadeDeItens() - LIMITE) * 10.0 + TAXA;
			
		return TAXA;
	}

}
