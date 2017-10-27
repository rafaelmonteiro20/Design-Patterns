package com.loja.venda;

import com.loja.TipoEntrega;
import com.loja.Venda;
import com.loja.entrega.FreteGratis;

public class VendaAtacado extends Venda {

	public VendaAtacado(TipoEntrega tipoEntrega) {
		super(tipoEntrega);
	}
	
	public VendaAtacado() {
		super(new FreteGratis());
	}

	@Override
	protected double preco() {
		double total = 0.0;
		
		for(Item item : getItens())
			total += item.total() * 0.9;
		
		return total;
	}
	
}
